; Durations / Periods

(
  "second (unit-of-duration)"
  #"(?iu)vte[řr](in[áa]ch|inami|inama|in[áa]m|in[ěe]|inou|ina|ino|inu|iny|in)|seku(nd[áa]ch|ndami|ndama|nd[áa]m|nd[ěe]|ndou|nda|ndo|ndu|ndy|nd)|se[kc]|s"
  {:dim :unit-of-duration
   :grain :second}

  "minute (unit-of-duration)"
  #"(?iu)min(ut[áa]ch|utami|utama|ut[áa]m|ut[ěe]|utou|uta|uto|utu|uty|ut)|min|m"
  {:dim :unit-of-duration
   :grain :minute}

  "hour (unit-of-duration)"
  #"(?iu)hod(in[áa]ch|inami|inama|in[áa]m|in[ěe]|inou|ina|ino|inu|iny|in)|hod|h"
  {:dim :unit-of-duration
   :grain :hour}

  "day (unit-of-duration)"
  #"(?iu)d(enama|en[ůu]m|nov[ée]|enech|n[ůu]m|nech|n[ůu]v|n[íi]m|en[ůu]|enum|enem|ene|eny|enu|nem|n[íi]|n[ůu]|en|ny|nu|ne|ni)"
  {:dim :unit-of-duration
   :grain :day}

  "week (unit-of-duration)"
  #"(?iu)t(ejdnov[ée]|[ýy]dnov[ée]|[ýy]dn[ůu]m|[ýy]dn[ůu]v|ejdn[ůu]v|ejdn[ůu]m|ejdnech|[ýy]dnech|[ýy]dn[ůu]|ejdnem|ejdn[íi]|ejdn[ůu]|[ýy]dnem|[ýy]dn[íi]|ejdne|[ýy]dny|[ýy]dnu|[ýy]den|[ýy]dni|ejdni|ejden|ejdny|ejdnu|[ýy]dne)"
  {:dim :unit-of-duration
   :grain :week}

  "month (unit-of-duration)"
  #"(?iu)m[ěe]s[íi](c[íi]ch|cema|c[ůu]m|cem|cum|c[ůu]|ce|ci|c)"
  {:dim :unit-of-duration
   :grain :month}

  "year (unit-of-duration)"
  #"(?iu)(rok[áa]ch|l[ée]t[ůu]m|l[ée]tama|l[ée]tech|roc[íi]ch|rokama|rok[ůu]m|rok[ůu]v|let[ůu]m|letech|l[ée]tum|rokem|rok[ůu]|rokum|l[ée]ty|l[ée]ta|lety|leta|l[ée]t|roce|roku|roky|roka|let|rok)"
  {:dim :unit-of-duration
   :grain :year}

   "half an hour"
  [#"(?iu)p[ůu]l hodi(n[áa]ch|na|nu|ny)"]
  {:dim :duration
   :value (duration :minute 30)}

  "<integer> <unit-of-duration>"
  [(integer 0) (dim :unit-of-duration)]; duration can't be negative...
  {:dim :duration
   :value (duration (:grain %2) (:value %1))}

  ; "<integer> more <unit-of-duration>"
  ; [(integer 0) #"(?iu)more|less" (dim :unit-of-duration)]; would need to add fields at some point
  ; {:dim :duration
  ;  :value (duration (:grain %3) (:value %1))}

  ; TODO handle cases where ASR outputs "1. 5 hours"
  ; but allowing a space creates many false positive
  "number.number hours" ; in 1.5 hour but also 1.75
  [#"(\d+)\.(\d+)" #"(?iu)hodi(n[áa]ch|na|nu|ny)"] ;duration can't be negative...
  {:dim :duration
   :value (duration :minute (int (+ (quot (* 6 (Long/parseLong (second (:groups %1)))) (java.lang.Math/pow 10 (- (count (second (:groups %1))) 1))) (* 60 (Long/parseLong (first (:groups %1)))))))}

  "<integer> and an half hours"
  [(integer 0) #"(?iu)a p[ůu]l hodi(n[áa]ch|na|nu|ny)"] ;duration can't be negative...
  {:dim :duration
   :value (duration :minute (+ 30 (* 60 (:value %1))))}

 "<unit-of-duration> as a duration"
 (dim :unit-of-duration)
 {:dim :duration
  :value (duration (:grain %1) 1)}

 "in <duration>"
 [#"(?iu)ve?" (dim :duration)]
 (in-duration (:value %2))

 ; "<duration> as latent time"
 ; [(dim :duration)]
 ; (assoc (in-duration (:value %1)) :latent true)

 "after <duration>"
 [#"(?iu)po|za|ve?" (dim :duration)]
 (merge (in-duration (:value %2)) {:direction :after})

  "<duration> from now"
  [(dim :duration) #"(?iu)ode? (dne[šs]ka|dnes|teraz|te[ďd]|nyn[íi])"]
  (in-duration (:value %1))

  "<duration> from now"
  [#"(?iu)za" (dim :duration) #"(?iu)ode? (dne[šs]ka|dnes|teraz|te[ďd]|nyn[íi])"]
  (in-duration (:value %2))

  "<duration> ago"
  [#"(?iu)p[řr]ed" (dim :duration)]
  (duration-ago (:value %2))

  "<duration> ago"
  [(dim :duration) #"(?iu)zp[áa]tky|zp[ěe]t"]
  (duration-ago (:value %1))

  "<duration> hence"
  [(dim :duration) #"(?iu)pozd[ěe]ji|potom|pot[ée]|pak"]
  (in-duration (:value %1))

  "<duration> after <time>"
  [(dim :duration) #"(?iu)po" (dim :time)]
  (duration-after (:value %1) %3)

  "<duration> before <time>"
  [(dim :duration) #"(?iu)do|p[řr]ed" (dim :time)]
  (duration-before (:value %1) %3)

  "about <duration>" ; about
  [#"(?iu)okolo|kolem|o|plus ?m[i[íi]]nus|zhruba|tak o" (dim :duration)]
  (-> %2
    (merge {:precision "approximate"}))

 "exactly <duration>" ; sharp
 [#"(?iu)p[řr]esn[ěe]" (dim :duration)]
 (-> %2
     (merge {:precision "exact"}))

 )
