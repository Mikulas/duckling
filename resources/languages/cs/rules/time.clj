(
  ;; generic

  "intersect"
  [(dim :time #(not (:latent %))) (dim :time #(not (:latent %)))] ; sequence of two tokens with a time dimension
  (intersect %1 %2)

  ; same thing, with "of" in between like "Sunday of last week"
  "intersect by \"of\", \"from\", \"'s\""
  [(dim :time #(not (:latent %))) #"(?iu)ve?|ze?" (dim :time #(not (:latent %)))] ; sequence of two tokens with a time fn
  (intersect %1 %3)

  ; mostly for January 12, 2005
  ; this is a separate rule, because commas separate very specific tokens
  ; so we want this rule's classifier to learn this
  "intersect by \",\""
  [(dim :time #(not (:latent %))) #"," (dim :time #(not (:latent %)))] ; sequence of two tokens with a time fn
  (intersect %1 %3)

  "on <date>" ; on Wed, March 23
  [#"(?iu)ve?|na" (dim :time)]
  %2 ; does NOT dissoc latent

  "on a named-day" ; on a sunday
  [#"(?iu)ve?|na" {:form :day-of-week}]
  %2 ; does NOT dissoc latent

  ;;;;;;;;;;;;;;;;;;;
  ;; Named things

  "named-day"
  #"(?iu)ponděln(ímu|ích|íma|ího|ími|ím|í)|ponděl(íma|ích|ími|ím|í|kách|cích|kům|kama|kem|ků|kum|ka|ek|ku|ky)|pon?\.?"
  (day-of-week 1)

  "named-day"
  #"(?iu)útern(ímu|ích|íma|ího|ími|ím|í)|úter(ýma|ých|ým|ý|kách|cích|kům|kama|kem|ků|kum|ka|ek|ku|ky)|út\.?"
  (day-of-week 2)

  "named-day"
  #"(?iu)středečn(ímu|ích|íma|ího|ími|ím|í)|stř(edách|edami|edama|edám|edě|edou|eda|edo|edu|edy|ed)|st\.?"
  (day-of-week 3)

  "named-day"
  #"(?iu)čtvrtečn(ímu|ích|íma|ího|ími|ím|í)|čtvrt(kách|cích|kům|kama|kem|ků|kum|ka|ek|ku|ky)|čtv?\.?"
  (day-of-week 4)

  "named-day"
  #"(?iu)pátečn(ímu|ích|íma|ího|ími|ím|í)|pát(cích|kách|kům|kama|kem|ků|kum|ka|ek|ku|ky)|pát?\.?"
  (day-of-week 5)

  "named-day"
  #"(?iu)sobotn(ímu|ích|íma|ího|ími|ím|í)|sob(otách|otami|otama|otám|otě|otou|ota|oto|otu|oty|ot)|sob?\.?"
  (day-of-week 6)

  "named-day"
  #"(?iu)neděln(ímu|ích|íma|ího|ími|ím|í)|nedě(lích|lema|lemi|lím|lí|le|li|l)|ne\.?"
  (day-of-week 7)

  "named-month"
  #"(?iu)lednov(ou|ými|é|á|ý|í)|led(nama|nech|nům|num|nů|nem|na|ne|en|nu|ny)"
  (month 1)

  "named-month"
  #"(?iu)únorov(ou|ými|é|á|ý|í)|úno(rům|rama|rech|rum|rem|rů|ra|re|ru|ry|r)"
  (month 2)

  "named-month"
  #"(?iu)březnov(ou|ými|é|á|ý|í)|břez(nama|nech|nům|num|nů|nem|na|ne|en|nu|ny)"
  (month 3)

  "named-month"
  #"(?iu)dubnov(ou|ými|é|á|ý|í)|dub(nama|nech|nům|num|nů|nem|na|ne|en|nu|ny)"
  (month 4)

  "named-month"
  #"(?iu)květnov(ou|ými|é|á|ý|í)|květ(nama|nech|nům|num|nů|nem|na|ne|en|nu|ny)"
  (month 5)

  "named-month"
  #"(?iu)červnov(ou|ými|é|á|ý|í)|červ(nama|nech|nům|num|nů|nem|na|ne|en|nu|ny)"
  (month 6)

  "named-month"
  #"(?iu)červencov(ou|ými|é|á|ý|í)|červen(cích|cům|cema|cum|ců|cem|ec|ce|ci)"
  (month 7)

  "named-month"
  #"(?iu)srpnov(ou|ými|é|á|ý|í)|srp(nama|nech|nům|num|nů|nem|na|ne|en|nu|ny)"
  (month 8)

  "named-month"
  #"(?iu)žářij?ov(ou|ými|é|á|ý|í)|zář(íma|ích|ími|ím|í)"
  (month 9)

  "named-month"
  #"(?iu)říjnov(ou|ými|é|á|ý|í)|říj(nama|nech|nům|num|nů|nem|na|ne|en|nu|ny)"
  (month 10)

  "named-month"
  #"(?iu)listopadov(ou|ými|é|á|ý|í)|listop(adama|adům|adech|adem|adum|adů|ade|adu|ady|ad)"
  (month 11)

  "named-month"
  #"(?iu)prosincov(ou|ými|é|á|ý|í)|prosin(cích|cům|cema|cum|ců|cem|ec|ce|ci)"
  (month 12)

  ;; month adjectives
  "month adjective"
  #"(?iu)lednov(ou|ými|é|á|ý|í)"
  {:form :month :month 1 :month-adjective true}

  "month adjective"
  #"(?iu)únorov(ou|ými|é|á|ý|í)"
  {:form :month :month 2 :month-adjective true}

  "month adjective"
  #"(?iu)březnov(ou|ými|é|á|ý|í)"
  {:form :month :month 3 :month-adjective true}

  "month adjective"
  #"(?iu)dubnov(ou|ými|é|á|ý|í)"
  {:form :month :month 4 :month-adjective true}

  "month adjective"
  #"(?iu)květnov(ou|ými|é|á|ý|í)"
  {:form :month :month 5 :month-adjective true}

  "month adjective"
  #"(?iu)červnov(ou|ými|é|á|ý|í)"
  {:form :month :month 6 :month-adjective true}

  "month adjective"
  #"(?iu)červencov(ou|ými|é|á|ý|í)"
  {:form :month :month 7 :month-adjective true}

  "month adjective"
  #"(?iu)srpnov(ou|ými|é|á|ý|í)"
  {:form :month :month 8 :month-adjective true}

  "month adjective"
  #"(?iu)žářij?ov(ou|ými|é|á|ý|í)"
  {:form :month :month 9 :month-adjective true}

  "month adjective"
  #"(?iu)říjnov(ou|ými|é|á|ý|í)"
  {:form :month :month 10 :month-adjective true}

  "month adjective"
  #"(?iu)listopadov(ou|ými|é|á|ý|í)"
  {:form :month :month 11 :month-adjective true}

  "month adjective"
  #"(?iu)prosincov(ou|ými|é|á|ý|í)"
  {:form :month :month 12 :month-adjective true}

  ; Holiday TODO: check online holidays
  ; or define dynamic rule (last thursday of october..)

 ;  "christmas"
 ;  #"(?iu)((Ś|ś|s)wi(e|ę)ta)? ?bo(z|ž)(ym|ego|e) narodzeni(e|a|u)"
 ; (month-day 12 25)

  "christmas eve"
  #"(?iu)Ván(ocích|ocema|ocemi|ocům|oce|oci|oc)"
  (month-day 12 24)

  "new year's eve"
  #"(?iu)Silvest(rové|rovi|rama|rech|rům|rum|ři|rem|rů|ře|ra|re|ru|ry|r)|nový rok"
  (month-day 12 31)

  "valentine's day"
  #"(?iu)Valentý(nové|nům|novi|nama|nech|nem|num|nů|na|ne|ni|nu|ny|n)"
  (month-day 2 14)

  "halloween day"
  #"(?iu)hall?owe?e(nama|nům|nech|nem|num|nů|ne|nu|ny|n)"
  (month-day 10 31)

  "absorption of , after named day"
  [{:form :day-of-week} #","]
  %1

  "now"
  #"(?iu)teď|nyní|okamžitě|hned|co nejdříve?"
  (cycle-nth :second 0)

  "today"
  #"(?iu)dnes(ka)?|dneš(kách|cích|kům|kama|kem|ků|kum|ka|ek|ku|ky)"
  (cycle-nth :day 0)

  "tomorrow"
  #"(?iu)zejtra|zítra|zítř(kách|cích|kům|kama|kem|ků|kum|ka|ek|ku|ky)"
 (cycle-nth :day 1)

 "day-after-tomorrow (single-word)"
 #"(?iu)pozítří|pozítř(cích|kách|kama|kům|kem|ků|kum|ek|ku|ky)"
 (cycle-nth :day 2)

 "day-before-yesterday (single-word)"
 #"(?iu)předevčír(em|u)?"
 (cycle-nth :day -2)

  "yesterday"
  #"(?iu)včera|včerejš(kách|cích|kům|kama|kem|ků|kum|ka|ek|ku|ky)|před dnem|den (zpátky|zpět)|předchozí den|den před(chozí)?"
  (cycle-nth :day -1)

  "EOM|End of month"
  #"(?iu)((ve?|na|ze?) )kon(cích|cům|cema|cum|ců|cem|ec|ce|ci) měsí(cích|cema|cům|cem|cum|ců|ce|ci|c)"
  (cycle-nth :month 1)

  "EOY|End of year"
  #"(?iu)((ve?|na|ze?) )kon(cích|cům|cema|cum|ců|cem|ec|ce|ci) (rok(ama|ách|em|um|ům|ův|y|a|u|ů)?)"
  (cycle-nth :year 1)

  ;;
  ;; This, Next, Last

  ;; assumed to be strictly in the future:
  ;; "this Monday" => next week if today is Monday
  "this|next <day-of-week>"
  [#"(?iu)t(ěmihle|ěmahle|ěchhle|ěmhle|ohohle|omuhle|ímhle|ímdle|ýhle|éhle|ýdle|oudle|enhle|ěhle|ouhle|omhle|ahle|yhle|uhle|ohle|odle|ihle|omle|ěmito|ěchto|ěmato|ohoto|omuto|ímto|ěmto|ento|omto|outo|éto|ato|ito|oto|uto|yto)" {:form :day-of-week}]
  (pred-nth-not-immediate %2 0)

  ;; for other preds, it can be immediate:
  ;; "this month" => now is part of it
  ; See also: cycles in en.cycles.clj
  "this <time>"
  [#"(?iu)t(ěmihle|ěmahle|ěchhle|ěmhle|ohohle|omuhle|ímhle|ímdle|ýhle|éhle|ýdle|oudle|enhle|ěhle|ouhle|omhle|ahle|yhle|uhle|ohle|odle|ihle|omle|ěmito|ěchto|ěmato|ohoto|omuto|ímto|ěmto|ento|omto|outo|éto|ato|ito|oto|uto|yto)" (dim :time)]
  (pred-nth %2 0)

  "next <time>"
  [#"(?iu)příšt(ímu|ích|íma|ího|ími|ím|im|í)|nadcházejíc(ímu|ích|íma|ího|ími|ím|im|í)" (dim :time #(not (:latent %)))]
  (pred-nth-not-immediate %2 0)

  "last <time>"
  [#"(?iu)předchoz(ímu|ích|íma|ího|ími|ím|im|í)|minul(ýmu|ých|ýma|ýho|ými|ým|im|ý|ou|á|ému|é)|posledn(ímu|ích|íma|ího|ími|ím|im|í)" (dim :time)]
  (pred-nth %2 -1)

  "after next <time>"
  [#"(?iu)((po|v|na) )?(příšt(ímu|ích|íma|ího|ími|ím|im|í)|nadcházejíc(ímu|ích|íma|ího|ími|ím|im|í))" (dim :time)]
  (pred-nth-not-immediate %2 1)

   "before last <time> "
  [#"(?iu)předminul(ýmu|ých|ýma|ýho|ými|ým|im|ý|ou|á|ému|é)|předposledn(ímu|ích|íma|ího|ími|ím|im|í)" (dim :time)]
  (pred-nth %2 -2)

  "last <day-of-week> of <time>"
  [#"(?iu)posledn(ímu|ích|íma|ího|ími|ím|im|í)" {:form :day-of-week} #"(?iu)ve?|ze?" (dim :time)]
  (pred-last-of %2 %4)

  "last <day-of-week> <time>"
  [#"(?iu)posledn(ímu|ích|íma|ího|ími|ím|im|í)" {:form :day-of-week} (dim :time)]
  (pred-last-of %2 %3)

 "last <cycle> of <time>"
 [#"(?iu)posledn(ímu|ích|íma|ího|ími|ím|im|í)" (dim :cycle) #"(?iu)ve?|na|ze?" (dim :time)]
 (cycle-last-of %2 %4)

 "last <cycle> <time>"
 [#"(?iu)posledn(ímu|ích|íma|ího|ími|ím|im|í)" (dim :cycle) (dim :time)]
 (cycle-last-of %2 %3)

  ; Ordinals
 "nth <time> of <time>"
 [(dim :ordinal) (dim :time) #"(?iu)ve?|na|ze?" (dim :time)]
 (pred-nth (intersect %4 %2) (dec (:value %1)))

 "nth <time> <time>"
 [(dim :ordinal) (dim :time) (dim :time)]
 (pred-nth (intersect %3 %2) (dec (:value %1)))

  ;; "nth <time> of <time>"
  ;; [#"(?iu)the" (dim :ordinal) (dim :time) #"(?iu)of|in" (dim :time)]
  ;; (pred-nth (intersect %5 %3) (dec (:value %2)))

  "nth <time> after <time>"
  [(dim :ordinal) (dim :time) #"(?iu)po" (dim :time)]
  (pred-nth-after %2 %4 (dec (:value %1)))

  ;; "nth <time> after <time>"
  ;; [#"(?iu)the" (dim :ordinal) (dim :time) #"(?iu)after" (dim :time)]
  ;; (pred-nth-after %3 %5 (dec (:value %2)))

    ; Years
  ; Between 1000 and 2100 we assume it's a year
  ; Outside of this, it's safer to consider it's latent

  "year"
  (integer 1000 2100)
  (year (:value %1))

  "year (latent)"
  (integer -10000 -100)
  (assoc (year (:value %1)) :latent true)
  "year (latent)"
  (integer 50 999)
  (assoc (year (:value %1)) :latent true)

  "year (latent)"
  (integer 2101 10000)
  (assoc (year (:value %1)) :latent true)

  ; Relative years
  "this year"
  #"(?i)letos"
  (cycle-nth :year 0)

  "last year"
  #"(?i)loni|rok (zpět|zpátky)"
  (cycle-nth :year -1)

  "2 years ago"
  #"(?i)předloni"
  (cycle-nth :year -2)

    ; Day of month appears in the following context:
  ; - the nth
  ; - March nth
  ; - nth of March
  ; - mm/dd (and other numerical formats like yyyy-mm-dd etc.)
  ; In general we are flexible and accept both ordinals (3rd) and numbers (3)

  ;; "the <day-of-month> (ordinal)" ; this one is not latent
  ;; [#"(?iu)the" (dim :ordinal #(<= 1 (:value %) 31))]
  ;; (day-of-month (:value %2))

  "<day-of-month> (ordinal)" ; this one is latent
  [(dim :ordinal #(and (:date-inflection %) (<= 1 (:value %) 31)))]
  (assoc (day-of-month (:value %1)) :latent true)

  ;; "the <day-of-month> (non ordinal)" ; this one is latent
  ;; [#"(?iu)the" (integer 1 31)]
  ;; (assoc (day-of-month (:value %2)) :latent true)

  "<named-month> <day-of-month> (ordinal)" ; march 12th
  [{:form :month} (dim :ordinal #(<= 1 (:value %) 31))]
  (intersect %1 (day-of-month (:value %2)))

  "<named-month> <day-of-month> (non ordinal)" ; march 12
  [{:form :month} (integer 1 31)]
  (intersect %1 (day-of-month (:value %2)))

  "<day-of-month> (ordinal) of <named-month>"
  [(dim :ordinal #(<= 1 (:value %) 31)) #"(?iu)of|in" {:form :month}]
  (intersect %3 (day-of-month (:value %1)))

  "<day-of-month> (non ordinal) of <named-month>"
  [(integer 1 31) #"(?iu)of|in" {:form :month}]
  (intersect %3 (day-of-month (:value %1)))

  "<day-of-month> (non ordinal) <named-month>" ; 12 mars
  [(integer 1 31) {:form :month}]
  (intersect %2 (day-of-month (:value %1)))

  "<day-of-month>(ordinal) <named-month>" ; 12nd mars
  [(dim :ordinal #(<= 1 (:value %) 31)) {:form :month}]
  (intersect %2 (day-of-month (:value %1)))

  "<day-of-month>(ordinal) <named-month> year" ; 12nd mars 12
  [(dim :ordinal #(<= 1 (:value %) 31)) {:form :month} #"(\d{2,4})"]
  (intersect %2 (day-of-month (:value %1)) (year (Integer/parseInt(first (:groups %3)))))

  ; "the ides of <named-month>" ; the ides of march 13th for most months, but on the 15th for March, May, July, and October
  ; [#"(?iu)the ides? of" {:form :month}]
  ; (intersect %2 (day-of-month (if (#{3 5 7 10} (:month %2)) 15 13)))

  ;; Hours and minutes (absolute time)
  "<integer> (latent time-of-day)"
  (integer 0 23)
  (assoc (hour (:value %1) true) :latent true)

  "<integer> with hour postfix"
  #"(?i)([1-9]|1[0-9]|2[0-4])\s*h(od|odin)?\b"
  (hour (Integer/parseInt(first (:groups %1))) true)

  "at <time-of-day>" ; o páté, v deset, na čtvrtou (hodinu)
  [#"(?iu)o|na|v|@" {:form :time-of-day}]
  (dissoc %2 :latent)


  "<time-of-day> o'clock"
  [{:form :time-of-day} #"(?iu)hod(inách|inami|inama|inám|ině|inou|ina|ino|inu|iny|in)"]
  (dissoc %1 :latent)

  "hh:mm"
  #"(?iu)((?:[01]?\d)|(?:2[0-3]))[:.]([0-5]\d)"
  (hour-minute (Integer/parseInt (first (:groups %1)))
               (Integer/parseInt (second (:groups %1)))
               true)

  "hh:mm:ss"
  #"(?iu)((?:[01]?\d)|(?:2[0-3]))[:.]([0-5]\d)[:.]([0-5]\d)"
  (hour-minute-second (Integer/parseInt (first (:groups %1)))
               (Integer/parseInt (second (:groups %1)))
               (Integer/parseInt (second (next (:groups %1))))
               true)


  "hhmm (military)"
  #"(?iu)((?:2[0-3])|(?:[01]?\d))([0-5]\d)"
  (-> (hour-minute (Integer/parseInt (first (:groups %1)))
                   (Integer/parseInt (second (:groups %1)))
                   false) ; not a 12-hour clock)
      (assoc :latent true)
      (assoc :military-time true))

  "hhmm (military) am|pm" ; hh only from 00 to 12
  [#"(?iu)((?:1[012]|0?\d))([0-5]\d)" #"(?iu)([ap])\.?m?\.?"]
  ; (-> (hour-minute (Integer/parseInt (first (:groups %1)))
  ;                  (Integer/parseInt (second (:groups %1)))
  ;                  false) ; not a 12-hour clock)
  ;     (assoc :latent true))
  (let [[p meridiem] (if (= "a" (-> %2 :groups first .toLowerCase))
                       [[(hour 0) (hour 12) false] :am]
                       [[(hour 12) (hour 0) false] :pm])]
    (-> (intersect
          (hour-minute (Integer/parseInt (first (:groups %1)))
                       (Integer/parseInt (second (:groups %1)))
                   true)
          (apply interval p))
        (assoc :form :time-of-day)))

 ;  "<time-of-day> před polednem/ráno/dopoledne"
 ;  [{:form :time-of-day} #"(?iu)(před polednem|(z )?rá(nama|nům|nech|num|nem|na|no|nu|ny|n)|ranní|dopoledn(ách|ích|ím|ema|em|í|e|i|y)|dopo)"]
 ; (let [[p meridiem]
 ;        [[(hour 0) (hour 12) false] :am]]
 ;    (-> (intersect %1 (apply interval p))
 ;        (assoc :form :time-of-day)))

 ; "<time-of-day> po poledni/odpoledne"
 ; [{:form :time-of-day} #"(?iu)(po poledni|odpoledn(ách|ích|ím|ema|em|í|e|i|y))"]
 ; (let [[p meridiem]
 ;       [[(hour 12) (hour 0) false] :pm]]
 ;   (-> (intersect %1 (apply interval p))
 ;       (assoc :form :time-of-day)))

 ; "<time-of-day> na večer/v noci"
 ; [{:form :time-of-day} #"(?iu)(na )?več(erům|erama|erech|erum|erem|erů|era|ere|eru|ery|ír|er)|(v )?no(cích|cemi|cema|cím|cech|cem|cí|ce|ci|c)"]
 ; (let [[p meridiem]
 ;       [[(hour 6) (hour 12) false]]]
 ;   (-> (intersect %1 (apply interval p))
 ;       (assoc :form :time-of-day)))

 "<ordinal> (as hour)"
 [(dim :ordinal #(and (not (:date-inflection %)) (<= 1 (:value %) 24)))]
 (assoc (hour (:value %1) true) :latent true)

  "noon"
  #"(?iu)poledn(ách|ích|ím|ema|em|í|e|y)" ; removed "i" to ignore "po poledni"
  (hour 12 false)

  ;; "midnight|EOD|end of day"
  ;; #"(?iu)północ|polnoc|koniec dnia"
  ;; (hour 0 false)

  "quarter (relative minutes)"
  #"(?iu)čtvr(tě|ti|t)"
  {:relative-minutes 15}

  "half (relative minutes)"
  #"půl"
  {:relative-minutes 30}

  "number (as relative minutes)"
  (integer 1 59)
  {:relative-minutes (:value %1) :latent true}

  "<hour-of-day> <integer> (as relative minutes)"
  [(dim :time :full-hour) #(:relative-minutes %)]
  (hour-relativemin (:full-hour %1) (:relative-minutes %2) true)

  "relative minutes <integer> (hour-of-day)"
  [#(and (:relative-minutes %) (not (:latent %))) (dim :time :full-hour)]
  (hour-relativemin (:full-hour %2) (- (:relative-minutes %1)) true)

  "relative minutes to|till|before <integer> (hour-of-day)"
  [#(:relative-minutes %) #"(?iu)do|před" (dim :time :full-hour)]
  (hour-relativemin (:full-hour %3) (- (:relative-minutes %1)) true)

  "relative minutes after|past <integer> (hour-of-day)"
  [#(:relative-minutes %) #"(?iu)po" (dim :time :full-hour)]
  (hour-relativemin (:full-hour %3) (:relative-minutes %1) true)

  ;; Formatted dates and times

  "yyyy-mm-dd"
  #"(\d{2,4})-(0?[1-9]|1[0-2])-(3[01]|[12]\d|0?[1-9])"
  (parse-dmy (nth (:groups %1) 2) (second (:groups %1)) (first (:groups %1)) true)

  "dd/mm/yyyy"
  #"(3[01]|[12]\d|0?[1-9]) ?[./-] ?(0?[1-9]|1[0-2]) ?[.-/] ?(\d{2,4})"
  (parse-dmy (first (:groups %1)) (second (:groups %1)) (nth (:groups %1) 2) true)

  "dd/mm"
  #"(3[01]|[12]\d|0?[1-9]) ?[/.] ?(0?[1-9]|1[0-2]) ?\.?"
  (parse-dmy (first (:groups %1)) (second (:groups %1)) nil true)


  ; Part of day (morning, evening...). They are intervals.

  "morning"
  [#"(?iu)(z )?rá(nama|nům|nech|num|nem|na|no|nu|ny|n)|ranní|po půlnoci"]
  (assoc (interval (hour 0 false) (hour 12 false) false) :form :part-of-day :latent true)

  "afternoon"
  [#"(?iu)odpoledn(ách|ích|ím|ema|em|í|e|i|y)|odpo|po oběd[uě]|po poledni"]
  (assoc (interval (hour 12 false) (hour 23 false) false) :form :part-of-day :latent true)

  "evening"
  [#"(?iu)več(erní|erům|erama|erech|erum|erem|erů|era|ere|eru|ery|ír|er)( hodina)?"]
  (assoc (interval (hour 17 false) (hour 0 false) false) :form :part-of-day :latent true)

  "night"
  [#"(?iu)no(cích|cemi|cema|cím|cech|cem|cí|ce|ci|c)"]
  (assoc (interval (hour 19 false) (hour 5 false) false) :form :part-of-day :latent true)

  "lunch"
  [#"(?iu)obě(dama|dům|dech|dum|dem|dě|dů|da|de|du|dy|d)"]
  (assoc (interval (hour 12 false) (hour 14 false) false) :form :part-of-day :latent true)

  "in|during the <part-of-day>" ;; removes latent
  [#"(?iu)(v|na) ?(čase?)" {:form :part-of-day}]
  (dissoc %2 :latent)

  "this <part-of-day>"
  [#"(?iu)t(ěmihle|ěmahle|ěchhle|ěmhle|ohohle|omuhle|ímhle|ímdle|ýhle|éhle|ýdle|oudle|enhle|ěhle|ouhle|omhle|ahle|yhle|uhle|ohle|odle|ihle|omle)" {:form :part-of-day}]
  (assoc (intersect (cycle-nth :day 0) %2) :form :part-of-day) ;; removes :latent

  ;; "tonight"
  ;; #"(?iu)toni(ght|gth|te)"
  ;; (assoc (intersect (cycle-nth :day 0)
  ;;                   (interval (hour 18 false) (hour 0 false) false))
  ;;        :form :part-of-day) ; no :latent

  ;; "after lunch"
  ;; #"(?iu)after(-|\s)?lunch"
  ;; (assoc (intersect (cycle-nth :day 0)
  ;;                   (interval (hour 13 false) (hour 17 false) false))
  ;;        :form :part-of-day) ; no :latent


  ;; "after work"
  ;; #"(?iu)after(-|\s)?work"
  ;; (assoc (intersect (cycle-nth :day 0)
  ;;                   (interval (hour 17 false) (hour 21 false) false))
  ;;        :form :part-of-day) ; no :latent

  "<time> <part-of-day>" ; since "morning" "evening" etc. are latent, general time+time is blocked
  [(dim :time) {:form :part-of-day}]
  (intersect %2 %1)

  ;; "<part-of-day> of <time>" ; since "morning" "evening" etc. are latent, general time+time is blocked
  ;; [{:form :part-of-day} #"(?iu)of" (dim :time)]
  ;; (intersect %1 %3)


  ; Other intervals: week-end, seasons

  "week-end" ; from Friday 6pm to Sunday midnight
  #"(?iu)víken(dama|dům|dech|dem|dum|dů|de|du|dy|d)"
  (interval (intersect (day-of-week 5) (hour 18 false))
            (intersect (day-of-week 1) (hour 0 false))
            false)

  "season"
  #"(?iu)l(étům|étama|étech|étum|étem|étě|éta|éto|étu|éty|etě|ét)"
  (interval (month-day 6 21) (month-day 9 23) false)

  "season"
  #"(?iu)podzi(mům|mama|mech|mum|mem|mů|ma|me|mu|my|m)"
  (interval (month-day 9 23) (month-day 12 21) false)

  "season"
  #"(?iu)zi(mách|mami|mama|mám|mě|mou|ma|mo|mu|my|m)"
  (interval (month-day 12 21) (month-day 3 20) false)

  "season"
  #"(?iu)ja(rama|rech|rům|rum|rem|ře|ra|ro|ru|ry|r)"
  (interval (month-day 3 20) (month-day 6 21) false)

  ; Time zones

  "timezone"
  #"(?iu)(YEKT|YEKST|YAPT|YAKT|YAKST|WT|WST|WITA|WIT|WIB|WGT|WGST|WFT|WEZ|WET|WESZ|WEST|WAT|WAST|VUT|VLAT|VLAST|VET|UZT|UYT|UYST|UTC|ULAT|TVT|TMT|TLT|TKT|TJT|TFT|TAHT|SST|SRT|SGT|SCT|SBT|SAST|SAMT|RET|PYT|PYST|PWT|PT|PST|PONT|PMST|PMDT|PKT|PHT|PHOT|PGT|PETT|PETST|PET|PDT|OMST|OMSST|NZST|NZDT|NUT|NST|NPT|NOVT|NOVST|NFT|NDT|NCT|MYT|MVT|MUT|MST|MSK|MSD|MMT|MHT|MEZ|MESZ|MDT|MAWT|MART|MAGT|MAGST|LINT|LHST|LHDT|KUYT|KST|KRAT|KRAST|KGT|JST|IST|IRST|IRKT|IRKST|IRDT|IOT|IDT|ICT|HOVT|HNY|HNT|HNR|HNP|HNE|HNC|HNA|HLV|HKT|HAY|HAT|HAST|HAR|HAP|HAE|HADT|HAC|HAA|GYT|GST|GMT|GILT|GFT|GET|GAMT|GALT|FNT|FKT|FKST|FJT|FJST|ET|EST|EGT|EGST|EET|EEST|EDT|ECT|EAT|EAST|EASST|DAVT|ChST|CXT|CVT|CST|COT|CLT|CLST|CKT|CHAST|CHADT|CET|CEST|CDT|CCT|CAT|CAST|BTT|BST|BRT|BRST|BOT|BNT|AZT|AZST|AZOT|AZOST|AWST|AWDT|AST|ART|AQTT|ANAT|ANAST|AMT|AMST|ALMT|AKST|AKDT|AFT|AEST|AEDT|ADT|ACST|ACDT)"
  {:dim :timezone
   :value (-> %1 :groups first .toUpperCase)}

  "<time> timezone"
  [(dim :time) (dim :timezone)]
  (set-timezone %1 (:value %2))


  ; Precision
  ; FIXME
  ; - should be applied to all dims not just time-of-day
  ;-  shouldn't remove latency, except maybe -ish

  "<time-of-day> approximately" ; 7ish
  [{:form :time-of-day} #"(?iu)((nebo )?něco )?kolem|zhruba|(nebo )?podobně"]
  (-> %1
    (dissoc :latent)
    (merge {:precision "approximate"}))

  "<time-of-day> sharp" ; sharp
  [{:form :time-of-day} #"(?iu)přesně"]
  (-> %1
    (dissoc :latent)
    (merge {:precision "exact"}))

  "about <time-of-day>" ; about
  [#"v?okolo|kolem|o|plus ?m[ií]nus|zhruba|tak o" {:form :time-of-day}]
  (-> %2
    (dissoc :latent)
    (merge {:precision "approximate"}))

  "exactly <time-of-day>" ; sharp
  [#"(?iu)přesně( v)?" {:form :time-of-day} ]
  (-> %2
    (dissoc :latent)
    (merge {:precision "exact"}))


  ; Intervals

  "<month> dd-dd (interval)"
  [{:form :month} #"(3[01]|[12]\d|0?[1-9])" #"\-|do|po|a[žz] do|a[žz] po" #"(3[01]|[12]\d|0?[1-9])"]
  (interval (intersect %1 (day-of-month (Integer/parseInt (-> %2 :groups first))))
            (intersect %1 (day-of-month (Integer/parseInt (-> %4 :groups first))))
            true)

  ; Blocked for :latent time. May need to accept certain latents only, like hours

  "<datetime> - <datetime> (interval)"
  [(dim :time #(not (:latent %))) #"\-|do|po|a[žz] do|a[žz] po" (dim :time #(not (:latent %)))]
  (interval %1 %3 true)

  "from <datetime> - <datetime> (interval)"
  [#"(?iu)od" (dim :time) #"\-|do|po|a[žz] [pd]o|(ale )?před" (dim :time)]
  (interval %2 %4 true)

  "between <datetime> and <datetime> (interval)"
  [#"(?iu)mezi" (dim :time) #"a" (dim :time)]
  (interval %2 %4 true)

  ; Specific for time-of-day, to help resolve ambiguities

  "<time-of-day> - <time-of-day> (interval)"
  [#(and (= :time-of-day (:form %)) (not (:latent %))) #"\-|:|do|po|až do|az do|až po|az po" {:form :time-of-day}] ; Prevent set alarm 1 to 5pm
  (interval %1 %3 true)

  "from <time-of-day> - <time-of-day> (interval)"
  [#"(?iu)od" {:form :time-of-day} #"((ale )?před)|\-|do|po|až do|az do|až po|az po" {:form :time-of-day}]
  (interval %2 %4 true)

  "between <time-of-day> and <time-of-day> (interval)"
  [#"(?iu)mezi" {:form :time-of-day} #"a|i" {:form :time-of-day}]
  (interval %2 %4 true)

  ; ; Specific for within duration... Would need to be reworked
  ; "within <duration>"
  ; [#"(?iu)(w )?ci(a|ą)gu|zakresie|obrębie|obrebie" (dim :duration)]
  ; (interval (cycle-nth :second 0) (in-duration (:value %2)) false)

  "by <time>"; if time is interval, take the start of the interval (by tonight = by 6pm)
  [#"(?iu)(a[zž] )?do" (dim :time)]
  (interval (cycle-nth :second 0) %2 false)

  "by the end of <time>"; in this case take the end of the time (by the end of next week = by the end of next sunday)
  [#"(?iu)do (konce )?(tohoto|této)?" (dim :time)]
  (interval (cycle-nth :second 0) %2 true)

  ; One-sided Intervals

  "until <time-of-day>"
  [#"(?iu)(a[žz] )?do|před" (dim :time)]
  (merge %2 {:direction :before})

  "after <time-of-day>"
  [#"(?iu)po" (dim :time)]
  (merge %2 {:direction :after})

  ;; In this special case, the upper limit is exclusive
  "<hour-of-day> - <hour-of-day> (interval)"
  [{:form :time-of-day} #"-|do|až po|po" #(and (= :time-of-day (:form %))
  									  (not (:latent %)))]
  (interval %1 %3 :exclusive)

  "from <hour-of-day> - <hour-of-day> (interval)"
  [#"(?iu)od" {:form :time-of-day} #"-|do" #(and (= :time-of-day (:form %))
  									              (not (:latent %)))]
  (interval %2 %4 :exclusive)

  ;; "time => time2 (experiment)"
  ;; (dim :time)
  ;; (assoc %1 :dim :time2)

)
