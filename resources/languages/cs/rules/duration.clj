; Durations / Periods

(
  "second (unit-of-duration)"
  #"(?iu)vteř(inách|inami|inama|inám|ině|inou|ina|ino|inu|iny|in)|seku(ndách|ndami|ndama|ndám|ndě|ndou|nda|ndo|ndu|ndy|nd)|se[kc]|s"
  {:dim :unit-of-duration
   :grain :second}

  "minute (unit-of-duration)"
  #"(?iu)min(utách|utami|utama|utám|utě|utou|uta|uto|utu|uty|ut)|min|m"
  {:dim :unit-of-duration
   :grain :minute}

  "hour (unit-of-duration)"
  #"(?iu)hod(inách|inami|inama|inám|ině|inou|ina|ino|inu|iny|in)|hod|h"
  {:dim :unit-of-duration
   :grain :hour}

  "day (unit-of-duration)"
  #"(?iu)d(enama|enům|nové|enech|nům|nech|nův|ním|enů|enum|enem|ene|eny|enu|nem|ní|nů|en|ny|nu|ne|ni)"
  {:dim :unit-of-duration
   :grain :day}

  "week (unit-of-duration)"
  #"(?iu)t(ejdnové|ýdnové|ýdnům|ýdnův|ejdnův|ejdnům|ejdnech|ýdnech|ýdnů|ejdnem|ejdní|ejdnů|ýdnem|ýdní|ejdne|ýdny|ýdnu|ýden|ýdni|ejdni|ejdny|ejdnu|ýdne)"
  {:dim :unit-of-duration
   :grain :week}

  "month (unit-of-duration)"
  #"(?iu)měsí(cích|cema|cům|cem|cum|ců|ce|ci|c)"
  {:dim :unit-of-duration
   :grain :month}

  "year (unit-of-duration)"
  #"(?iu)(rokách|létům|létama|létech|rocích|rokama|rokům|rokův|letům|letech|létum|rokem|roků|rokum|léty|léta|lety|leta|lét|roce|roku|roky|roka|let|rok)"
  {:dim :unit-of-duration
   :grain :year}

   "half an hour"
  [#"(?iu)půl hodi(nách|na|nu|ny)"]
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
  [#"(\d+)\.(\d+)" #"(?iu)hodi(nách|na|nu|ny)"] ;duration can't be negative...
  {:dim :duration
   :value (duration :minute (int (+ (quot (* 6 (Long/parseLong (second (:groups %1)))) (java.lang.Math/pow 10 (- (count (second (:groups %1))) 1))) (* 60 (Long/parseLong (first (:groups %1)))))))}

  "<integer> and an half hours"
  [(integer 0) #"(?iu)a půl hodi(nách|na|nu|ny)"] ;duration can't be negative...
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
  [(dim :duration) #"(?iu)od (teraz|teď|nyní)"]
  (in-duration (:value %1))

  "<duration> ago"
  [#"(?iu)před" (dim :duration)]
  (duration-ago (:value %2))

  "<duration> ago"
  [(dim :duration) #"(?iu)zpátky|zpět"]
  (duration-ago (:value %1))

  "<duration> hence"
  [(dim :duration) #"(?iu)později|potom|poté|pak"]
  (in-duration (:value %1))

  "<duration> after <time>"
  [(dim :duration) #"(?iu)po" (dim :time)]
  (duration-after (:value %1) %3)

  "<duration> before <time>"
  [(dim :duration) #"(?iu)do|před" (dim :time)]
  (duration-before (:value %1) %3)

  "about <duration>" ; about
  [#"(?iu)okolo|kolem|o|plus ?m[ií]nus|zhruba|tak o" (dim :duration)]
  (-> %2
    (merge {:precision "approximate"}))

 "exactly <duration>" ; sharp
 [#"(?iu)přesně" (dim :duration)]
 (-> %2
     (merge {:precision "exact"}))

 )
