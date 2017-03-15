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
  #"(?i)sekun(dách|dami|dama|dám|dě|dou|da|do|du|dy|d)"
  {:dim :cycle
   :grain :second}

  "minute (cycle)"
  #"(?i)minu(tách|tami|tama|tám|tě|tou|ta|to|tu|ty|t)"
  {:dim :cycle
   :grain :minute}

  "hour (cycle)"
  #"(?i)hodi(nách|nami|nama|nám|ně|nou|na|no|nu|ny|n)"
  {:dim :cycle
   :grain :hour}

  "day (cycle)"
  #"(?i)d(enama|enům|nové|enech|nům|nech|nův|ním|enů|enum|enem|ene|eny|enu|nem|ní|nů|en|ny|nu|ne|ni)"
  {:dim :cycle
   :grain :day}

  "week (cycle)"
  #"(?i)t(ejdnové|ýdnové|ýdnům|ýdnův|ejdnův|ejdnům|ejdnech|ýdnech|ýdnů|ejdnem|ejdní|ejdnů|ýdnem|ýdní|ejdne|ýdny|ýdnu|ýden|ýdni|ejdni|ejdny|ejdnu|ýdne)"
  {:dim :cycle
   :grain :week}

  "month (cycle)"
  #"(?i)měsí(cích|cema|cům|cem|cum|ců|ce|ci|c)"
  {:dim :cycle
   :grain :month}

  "quarter (cycle)"
  #"(?i)kvartá(lama|lům|lech|lem|lum|lů|le|lu|ly|l)|čtvrtlet(íma|ích|ími|ím|í)"
  {:dim :cycle
   :grain :quarter}

  "year (cycle)"
  #"(?i)(rokách|létům|létama|létech|rocích|rokama|rokům|rokův|letům|letech|létum|rokem|roků|rokum|léty|léta|lety|leta|lét|roce|roku|roky|roka|let|rok)"
  {:dim :cycle
   :grain :year}

  "this <cycle>"
  [#"(?i)t(ěmihle|ěmahle|ěchhle|ěmhle|ohohle|omuhle|ímhle|ímdle|ýhle|éhle|ýdle|oudle|enhle|ěhle|ouhle|omhle|ahle|yhle|uhle|ohle|odle|ihle|omle)|t(ěmito|ěchto|ěmato|ohoto|omuto|ímto|ěmto|ento|omto|outo|éto|ato|ito|oto|uto|yto)" (dim :cycle)]
  (cycle-nth (:grain %2) 0)

  "last <cycle>"
  [#"(?i)předchoz(ímu|ích|íma|ího|ími|ím|í)|předešl(ého|ých|ému|ýma|ými|ým|ém|ou|á|é|í|ý)|minul(ého|ých|ému|ýma|ými|ým|ém|ou|á|é|í|ý)" (dim :cycle)]
  (cycle-nth (:grain %2) -1)

  "next <cycle>"
  [#"(?i)příšt(ímu|ích|íma|ího|ími|ím|í)|nadcházejíc(ímu|ích|íma|ího|ími|ím|í)" (dim :cycle)]
  (cycle-nth (:grain %2) 1)

  ;; "the <cycle> after <time>"
  ;; [#"(?i)the" (dim :cycle) #"(?i)after" (dim :time)]
  ;; (cycle-nth-after (:grain %2) 1 %4)

  "<cycle> after <time>"
  [(dim :cycle) #"(?i)po" (dim :time)]
  (cycle-nth-after (:grain %1) 1 %3)

  ;; "the <cycle> before <time>"
  ;; [#"(?i)the" (dim :cycle) #"(?i)before" (dim :time)]
  ;; (cycle-nth-after (:grain %2) -1 %4)

  "<cycle> before <time>"
  [(dim :cycle) #"(?i)před" (dim :time)]
  (cycle-nth-after (:grain %1) -1 %3)

  "last n <cycle>"
  [#"(?i)předchoz(ímu|ích|íma|ího|ími|ím|í)|předešl(ého|ých|ému|ýma|ými|ým|ém|ou|á|é|í|ý)|minul(ého|ých|ému|ýma|ými|ým|ém|ou|á|é|í|ý)" (integer 1 9999) (dim :cycle)]
  (cycle-n-not-immediate (:grain %3) (- (:value %2)))

  "next n <cycle>"
  [#"(?i)příšt(ímu|ích|íma|ího|ími|ím|í)|nadcházejíc(ímu|ích|íma|ího|ími|ím|í)" (integer 1 9999) (dim :cycle)]
  (cycle-n-not-immediate (:grain %3) (:value %2))

 "<ordinal> <cycle> of <time>"
 [(dim :ordinal) (dim :cycle) #"(?i)v(e)?|z(e)?" (dim :time)]
 (cycle-nth-after-not-immediate (:grain %2) (dec (:value %1)) %4)

 "<ordinal> <cycle> <time>"
[(dim :ordinal) (dim :cycle) (dim :time)]
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
  [(dim :ordinal) (dim :cycle #(= :quarter (:grain %))) (dim :time)]
  (cycle-nth-after :quarter (dec (:value %1)) %3)
)
