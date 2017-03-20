; Cycles are like a heart beat, the next starts just when the previous ends.
; Unlike durations, they have an absolute position in the time, it's just that this position is periodic.
; Examples of phrases involving cycles:
; - this week
; - today (= this day)
; - last month
; - last 2 calendar months (last 2 months is interpreted as a duration)
;
; As soon as you put a quantity (2 months), the cycle becomes a duration.


(
  "second (cycle)"
  #"(?i)sekun(d[áa]ch|dami|dama|d[áa]m|d[ěe]|dou|da|do|du|dy|d)"
  {:dim :cycle
   :grain :second}

  "minute (cycle)"
  #"(?i)minu(t[áa]ch|tami|tama|t[áa]m|t[ěe]|tou|ta|to|tu|ty|t)"
  {:dim :cycle
   :grain :minute}

  "hour (cycle)"
  #"(?i)hodi(n[áa]ch|nami|nama|n[áa]m|n[ěe]|nou|na|no|nu|ny|n)"
  {:dim :cycle
   :grain :hour}

  "day (cycle)"
  #"(?i)d(enama|en[ůu]m|nov[ée]|enech|n[ůu]m|nech|n[ůu]v|n[íi]m|en[ůu]|enum|enem|ene|eny|enu|nem|n[íi]|n[ůu]|en|ny|nu|ne|ni)"
  {:dim :cycle
   :grain :day}

  "week (cycle)"
  #"(?i)t(ejdnov[ée]|[ýy]dnov[ée]|[ýy]dn[ůu]m|[ýy]dn[ůu]v|ejdn[ůu]v|ejdn[ůu]m|ejdnech|[ýy]dnech|[ýy]dn[ůu]|ejdnem|ejdn[íi]|ejdn[ůu]|[ýy]dnem|[ýy]dn[íi]|ejdne|[ýy]dny|[ýy]dnu|[ýy]den|[ýy]dni|ejdni|ejdny|ejdnu|[ýy]dne)"
  {:dim :cycle
   :grain :week}

  "month (cycle)"
  #"(?i)m[ěe]s[íi](c[íi]ch|cema|c[ůu]m|cem|cum|c[ůu]|ce|ci|c)"
  {:dim :cycle
   :grain :month}

  "quarter (cycle)"
  #"(?i)kvart[áa](lama|l[ůu]m|lech|lem|lum|l[ůu]|le|lu|ly|l)|[čc]tvrtlet([íi]ma|[íi]ch|[íi]mi|[íi]m|[íi])"
  {:dim :cycle
   :grain :quarter}

  "year (cycle)"
  #"(?i)(rok[áa]ch|roc[íi]ch|rokama|rok[ůu]m|rok[ůu]v|rokem|rok[ůu]|rokum|roce|roku|roky|roka|rok|l[ée]t[ůu]m|l[ée]tama|l[ée]tech|let[ůu]m|letech|l[ée]tum|l[ée]ty|l[ée]ta|lety|leta|l[ée]t|let)"
  {:dim :cycle
   :grain :year}

  "this <cycle>"
  [#"(?i)t([ěe]mihle|[ěe]mahle|[ěe]chhle|[ěe]mhle|ohohle|omuhle|[íi]mhle|[íi]mdle|[ýy]hle|[ée]hle|[ýy]dle|oudle|enhle|[ěe]hle|ouhle|omhle|ahle|yhle|uhle|ohle|odle|ihle|omle)|t([ěe]mito|[ěe]chto|[ěe]mato|ohoto|omuto|[íi]mto|[ěe]mto|ento|omto|outo|[ée]to|ato|ito|oto|uto|yto)" (dim :cycle)]
  (cycle-nth (:grain %2) 0)

  "last <cycle>"
  [#"(?i)p[řr]edchoz([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|[íi])|p[řr]edch[áa]zej[íi]c([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|[íi])|p[řr]ede[šs]l([ée]ho|[ýy]ch|[ée]mu|[ýy]ma|[ýy]mi|[ýy]m|[ée]m|ou|[áa]|[ée]|[íi]|[ýy])|p[řr]ed|minul([ée]ho|[ýy]ch|[ée]mu|[ýy]ma|[ýy]mi|[ýy]m|[ée]m|ou|[áa]|[ée]|[íi]|[ýy])|posledn([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|[íi])" (dim :cycle)]
  (cycle-nth (:grain %2) -1)

  "before last <cycle>"
  [#"(?i)p[řr]edp[řr]edchoz([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|[íi])|p[řr]edminul([ée]ho|[ýy]ch|[ée]mu|[ýy]ma|[ýy]mi|[ýy]m|[ée]m|ou|[áa]|[ée]|[íi]|[ýy])|p[řr]edposledn([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|[íi])" (dim :cycle)]
  (cycle-nth (:grain %2) -2)

  "next <cycle>"
  [#"(?i)p[řr][íi][šs]t([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|[íi])|n[áa]sleduj[íi]c([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|[íi])|nadch[áa]zej[íi]c([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|[íi])" (dim :cycle)]
  (cycle-nth (:grain %2) 1)

  "next <cycle>"
  [#"(?i)za" (dim :cycle #(= :week (:grain %)))]
  (cycle-nth (:grain %2) 1)

  ;; "the <cycle> after <time>"
  ;; [#"(?i)the" (dim :cycle) #"(?i)after" (dim :time)]
  ;; (cycle-nth-after (:grain %2) 1 %4)

  "<cycle> after"
  [(dim :cycle) #"(?i)po"]
  (cycle-nth (:grain %1) 1)

  "<cycle> after <time>"
  [(dim :cycle) #"(?i)po" (dim :time)]
  (cycle-nth-after (:grain %1) 1 %3)

  ;; "the <cycle> before <time>"
  ;; [#"(?i)the" (dim :cycle) #"(?i)before" (dim :time)]
  ;; (cycle-nth-after (:grain %2) -1 %4)

  "<cycle> before"
  [(dim :cycle) #"(?i)(p[řr]ed|zp[ěe]t|zp[áa]tky)"]
  (cycle-nth (:grain %1) -1)

  "<cycle> before <time>"
  [(dim :cycle) #"(?i)p[řr]ed" (dim :time)]
  (cycle-nth-after (:grain %1) -1 %3)

  ; "last n <cycle>"
  ; [#"(?i)p[řr]edchoz([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|[íi])|p[řr]ede[šs]l([ée]ho|[ýy]ch|[ée]mu|[ýy]ma|[ýy]mi|[ýy]m|[ée]m|ou|[áa]|[ée]|[íi]|[ýy])|p[řr]ed|minul([ée]ho|[ýy]ch|[ée]mu|[ýy]ma|[ýy]mi|[ýy]m|[ée]m|ou|[áa]|[ée]|[íi]|[ýy])" (integer 1 9999) (dim :cycle)]
  ; (cycle-n-not-immediate (:grain %3) (- (:value %2)))

  ; "n <cycle> ago"
  ; [(integer 1 9999) (dim :cycle) #"(?i)zp[áa]tky|zp[ěe]t"]
  ; (cycle-n-not-immediate (:grain %2) (- (:value %1)))

  ; "next n <cycle>"
  ; [#"(?i)p[řr][íi][šs]t([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|[íi])|nadch[áa]zej[íi]c([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|[íi])" (integer 1 9999) (dim :cycle)]
  ; (cycle-n-not-immediate (:grain %3) (:value %2))

  ; "n <cycle> next"
  ; [(integer 1 9999) (dim :cycle) #"(?i)po"]
  ; (cycle-n-not-immediate (:grain %2) (:value %1))

 "<ordinal> <cycle> of <time>"
 [(dim :ordinal) (dim :cycle) #"(?i)v(e)?|z(e)?" (dim :time)]
 (cycle-nth-after-not-immediate (:grain %2) (dec (:value %1)) %4)

 "<ordinal> <cycle> <time>"
 [(dim :ordinal) (dim :cycle #(not= :quarter (:grain %))) (dim :time)]
 (cycle-nth-after-not-immediate (:grain %2) (dec (:value %1)) %3)

  ;; "the <ordinal> <cycle> of <time>"
  ;; [#"(?i)the" (dim :ordinal) (dim :cycle) #"(?i)of|in|from" (dim :time)]
  ;; (cycle-nth-after-not-immediate (:grain %3) (dec (:value %2)) %5)

  "the <cycle> of <time>"
  [(dim :cycle) #"(?i)z" (dim :time)]
  (cycle-nth-after-not-immediate (:grain %1) 0 %3)

  ; the 2 following rules may need a different helper

  "<ordinal> <cycle> after <time>"
  [(dim :ordinal) (dim :cycle) #"(?i)po" (dim :time)]
  (cycle-nth-after-not-immediate (:grain %2) (dec (:value %1)) %4)

  ; "the <ordinal> <cycle> after <time>"
  ; [#"(?i)the" (dim :ordinal) (dim :cycle) #"(?i)after" (dim :time)]
  ; (cycle-nth-after-not-immediate (:grain %3) (dec (:value %2)) %5)


  ; quarters are a little bit different, you can say "3rd quarter" alone

  "<ordinal> quarter"
  [(dim :ordinal) (dim :cycle #(= :quarter (:grain %)))]
  (cycle-nth-after :quarter (dec (:value %1)) (cycle-nth :year 0))

  "<ordinal> quarter <year>"
  [(dim :ordinal) (dim :cycle #(= :quarter (:grain %))) (dim :time #(not (:military-time %)))]
  (cycle-nth-after :quarter (dec (:value %1)) %3)
)
