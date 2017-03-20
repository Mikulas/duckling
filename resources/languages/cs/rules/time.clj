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

  "on <date>" ; ve st[řr]edu, v [úu]ter[ýy], na ned[ěe]li, o v[íi]kendu
  [#"(?iu)ve?|na|o" (dim :time)]
  %2 ; does NOT dissoc latent

  "on a named-day" ; on a sunday
  [#"(?iu)ve?|na" {:form :day-of-week}]
  %2 ; does NOT dissoc latent

  ;;;;;;;;;;;;;;;;;;;
  ;; Named things

  "named-day"
  #"(?iu)pond[ěe]ln([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|[íi])|pond[ěe]l([íi]ma|[íi]ch|[íi]mi|[íi]m|[íi]|k[áa]ch|c[íi]ch|k[ůu]m|kama|kem|k[ůu]|kum|ka|ek|ku|ky)|pon?\.?"
  (day-of-week 1)

  "named-day"
  #"(?iu)[úu]tern([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|[íi])|[úu]ter([ýy]ma|[ýy]ch|[ýy]m|[ýy]|k[áa]ch|c[íi]ch|k[ůu]m|kama|kem|k[ůu]|kum|ka|ek|ku|ky)|[úu]t\.?"
  (day-of-week 2)

  "named-day"
  #"(?iu)st[řr]ede[čc]n([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|[íi])|st[řr](ed[áa]ch|edami|edama|ed[áa]m|ed[ěe]|edou|eda|edo|edu|edy|ed)|st\.?"
  (day-of-week 3)

  "named-day"
  #"(?iu)[čc]tvrte[čc]n([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|[íi])|[čc]tvrt(k[áa]ch|c[íi]ch|k[ůu]m|kama|kem|k[ůu]|kum|ka|ek|ku|ky)|[čc]tv?\.?"
  (day-of-week 4)

  "named-day"
  #"(?iu)p[áa]te[čc]n([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|[íi])|p[áa]t(c[íi]ch|k[áa]ch|k[ůu]m|kama|kem|k[ůu]|kum|ka|ek|ku|ky)|p[áa]t?\.?"
  (day-of-week 5)

  "named-day"
  #"(?iu)sobotn([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|[íi])|sob(ot[áa]ch|otami|otama|ot[áa]m|ot[ěe]|otou|ota|oto|otu|oty|ot)|sob?\.?"
  (day-of-week 6)

  "named-day"
  #"(?iu)ned[ěe]ln([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|[íi])|ned[ěe](l[íi]ch|lema|lemi|l[íi]m|l[íi]|le|li|l)|ne\.?"
  (day-of-week 7)

  "named-month"
  #"(?iu)lednov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])|led(nama|nech|n[ůu]m|num|n[ůu]|nem|na|ne|en|nu|ny)"
  (month 1)

  "named-month"
  #"(?iu)[úu]norov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])|[úu]no(r[ůu]m|rama|rech|rum|rem|r[ůu]|ra|re|ru|ry|r)"
  (month 2)

  "named-month"
  #"(?iu)b[řr]eznov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])|b[řr]ez(nama|nech|n[ůu]m|num|n[ůu]|nem|na|ne|en|nu|ny)"
  (month 3)

  "named-month"
  #"(?iu)dubnov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])|dub(nama|nech|n[ůu]m|num|n[ůu]|nem|na|ne|en|nu|ny)"
  (month 4)

  "named-month"
  #"(?iu)kv[ěe]tnov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])|kv[ěe]t(nama|nech|n[ůu]m|num|n[ůu]|nem|na|ne|en|nu|ny)"
  (month 5)

  "named-month"
  #"(?iu)[čc]ervnov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])|[čc]erv(nama|nech|n[ůu]m|num|n[ůu]|nem|na|ne|en|nu|ny)"
  (month 6)

  "named-month"
  #"(?iu)[čc]ervencov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])|[čc]erven(c[íi]ch|c[ůu]m|cema|cum|c[ůu]|cem|ec|ce|ci)"
  (month 7)

  "named-month"
  #"(?iu)srpnov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])|srp(nama|nech|n[ůu]m|num|n[ůu]|nem|na|ne|en|nu|ny)"
  (month 8)

  "named-month"
  #"(?iu)[žz][áa][řr]ij?ov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])|z[áa][řr]([íi]ma|[íi]ch|[íi]mi|[íi]m|[íi])"
  (month 9)

  "named-month"
  #"(?iu)[řr][íi]jnov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])|[řr][íi]j(nama|nech|n[ůu]m|num|n[ůu]|nem|na|ne|en|nu|ny)"
  (month 10)

  "named-month"
  #"(?iu)listopadov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])|listop(adama|ad[ůu]m|adech|adem|adum|ad[ůu]|ade|adu|ady|ad)"
  (month 11)

  "named-month"
  #"(?iu)prosincov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])|prosin(c[íi]ch|c[ůu]m|cema|cum|c[ůu]|cem|ec|ce|ci)"
  (month 12)

  ;; month adjectives
  "month adjective"
  #"(?iu)lednov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])"
  {:form :month :month 1 :month-adjective true}

  "month adjective"
  #"(?iu)[úu]norov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])"
  {:form :month :month 2 :month-adjective true}

  "month adjective"
  #"(?iu)b[řr]eznov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])"
  {:form :month :month 3 :month-adjective true}

  "month adjective"
  #"(?iu)dubnov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])"
  {:form :month :month 4 :month-adjective true}

  "month adjective"
  #"(?iu)kv[ěe]tnov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])"
  {:form :month :month 5 :month-adjective true}

  "month adjective"
  #"(?iu)[čc]ervnov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])"
  {:form :month :month 6 :month-adjective true}

  "month adjective"
  #"(?iu)[čc]ervencov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])"
  {:form :month :month 7 :month-adjective true}

  "month adjective"
  #"(?iu)srpnov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])"
  {:form :month :month 8 :month-adjective true}

  "month adjective"
  #"(?iu)[žz][áa][řr]ij?ov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])"
  {:form :month :month 9 :month-adjective true}

  "month adjective"
  #"(?iu)[řr][íi]jnov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])"
  {:form :month :month 10 :month-adjective true}

  "month adjective"
  #"(?iu)listopadov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])"
  {:form :month :month 11 :month-adjective true}

  "month adjective"
  #"(?iu)prosincov(ou|[ýy]mi|[ée]|[áa]|[ýy]|[íi])"
  {:form :month :month 12 :month-adjective true}

  ; Holiday TODO: check online holidays
  ; or define dynamic rule (last thursday of october..)

  "christmas eve"
  #"(?iu)V[áa]n(oc[íi]ch|ocema|ocemi|oc[ůu]m|oce|oci|oc)|štěd(rému|rými|rých|rého|rýma|rým|ří|rém|rý|rou|rá|ré) d(enama|enům|nové|enech|nům|nech|nův|ním|enů|enum|enem|ene|eny|enu|nem|ní|nů|en|ny|nu|ne|ni)"
  (month-day 12 24)

  "new year's eve"
  #"(?iu)Silvest(rov[ée]|rovi|rama|rech|r[ůu]m|rum|[řr]i|rem|r[ůu]|[řr]e|ra|re|ru|ry|r)|nov[ýy] rok"
  (month-day 12 31)

  "valentine's day"
  #"(?iu)Valent[ýy](nov[ée]|n[ůu]m|novi|nama|nech|nem|num|n[ůu]|na|ne|ni|nu|ny|n)"
  (month-day 2 14)

  "halloween day"
  #"(?iu)hall?owe?e(nama|n[ůu]m|nech|nem|num|n[ůu]|ne|nu|ny|n)"
  (month-day 10 31)

  "absorption of , after named day"
  [{:form :day-of-week} #","]
  %1

  "now"
  #"(?iu)te[ďd]|nyn[íi]|okam[žz]it[ěe]|hned|co nejd[řr][íi]ve?"
  (cycle-nth :second 0)

  "today"
  #"(?iu)dnes(ka)?|dne[šs](k[áa]ch|c[íi]ch|k[ůu]m|kama|kem|k[ůu]|kum|ka|ek|ku|ky)"
  (cycle-nth :day 0)

  "tomorrow"
  #"(?iu)zejtra|z[íi]tra|z[íi]t[řr](k[áa]ch|c[íi]ch|k[ůu]m|kama|kem|k[ůu]|kum|ka|ek|ku|ky)"
 (cycle-nth :day 1)

 "day-after-tomorrow (single-word)"
 #"(?iu)poz[íi]t[řr][íi]|poz[íi]t[řr](c[íi]ch|k[áa]ch|kama|k[ůu]m|kem|k[ůu]|kum|ek|ku|ky)"
 (cycle-nth :day 2)

 "two-days-after-tomorrow (single-word)"
 #"(?iu)popoz[íi]t[řr][íi]|popoz[íi]t[řr](c[íi]ch|k[áa]ch|kama|k[ůu]m|kem|k[ůu]|kum|ek|ku|ky)"
 (cycle-nth :day 3)

 "day-before-yesterday (single-word)"
 #"(?iu)p[řr]edev[čc][íi]r(em|u)?"
 (cycle-nth :day -2)

  "yesterday"
  #"(?iu)v[čc]era|v[čc]erej[šs](k[áa]ch|c[íi]ch|k[ůu]m|kama|kem|k[ůu]|kum|ka|ek|ku|ky)|p[řr]ed dnem|den (zp[áa]tky|zp[ěe]t)|p[řr]edchoz[íi] den|den p[řr]ed(choz[íi])?"
  (cycle-nth :day -1)

  "EOM|End of month"
  #"(?iu)((ve?|na|ze?) )kon(c[íi]ch|c[ůu]m|cema|cum|c[ůu]|cem|ec|ce|ci) m[ěe]s[íi](c[íi]ch|cema|c[ůu]m|cem|cum|c[ůu]|ce|ci|c)"
  (cycle-nth :month 1)

  "EOY|End of year"
  #"(?iu)((ve?|na|ze?) )kon(c[íi]ch|c[ůu]m|cema|cum|c[ůu]|cem|ec|ce|ci) (rok(ama|[áa]ch|em|um|[ůu]m|[ůu]v|y|a|u|[ůu])?)"
  (cycle-nth :year 1)

  ;;
  ;; This, Next, Last

  ;; assumed to be strictly in the future:
  ;; "this Monday" => next week if today is Monday
  "this|next <day-of-week>"
  [#"(?iu)t([ěe]mihle|[ěe]mahle|[ěe]chhle|[ěe]mhle|ohohle|omuhle|[íi]mhle|[íi]mdle|[ýy]hle|[ée]hle|[ýy]dle|oudle|enhle|[ěe]hle|ouhle|omhle|ahle|yhle|uhle|ohle|odle|ihle|omle|[ěe]mito|[ěe]chto|[ěe]mato|ohoto|omuto|[íi]mto|[ěe]mto|ento|omto|outo|[ée]to|ato|ito|oto|uto|yto)" {:form :day-of-week}]
  (pred-nth-not-immediate %2 0)

  ;; for other preds, it can be immediate:
  ;; "this month" => now is part of it
  ; See also: cycles in en.cycles.clj
  "this <time>"
  [#"(?iu)t([ěe]mihle|[ěe]mahle|[ěe]chhle|[ěe]mhle|ohohle|omuhle|[íi]mhle|[íi]mdle|[ýy]hle|[ée]hle|[ýy]dle|oudle|enhle|[ěe]hle|ouhle|omhle|ahle|yhle|uhle|ohle|odle|ihle|omle|[ěe]mito|[ěe]chto|[ěe]mato|ohoto|omuto|[íi]mto|[ěe]mto|ento|omto|outo|[ée]to|ato|ito|oto|uto|yto)" (dim :time)]
  (pred-nth %2 0)

  "next <time>"
  [#"(?iu)p[řr][íi][šs]t([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|im|[íi])|nadch[áa]zej[íi]c([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|im|[íi])" (dim :time #(not (:latent %)))]
  (pred-nth-not-immediate %2 0)

  "last <time>"
  [#"(?iu)p[řr]edchoz([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|im|[íi])|minul([ýy]mu|[ýy]ch|[ýy]ma|[ýy]ho|[ýy]mi|[ýy]m|im|[ýy]|ou|[áa]|[ée]mu|[ée])|posledn([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|im|[íi])" (dim :time)]
  (pred-nth %2 -1)

  "after next <time>"
  [#"(?iu)((po|v|na) )?(p[řr][íi][šs]t([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|im|[íi])|nadch[áa]zej[íi]c([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|im|[íi]))" (dim :time)]
  (pred-nth-not-immediate %2 1)

   "before last <time> "
  [#"(?iu)p[řr]edminul([ýy]mu|[ýy]ch|[ýy]ma|[ýy]ho|[ýy]mi|[ýy]m|im|[ýy]|ou|[áa]|[ée]mu|[ée])|p[řr]edposledn([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|im|[íi])" (dim :time)]
  (pred-nth %2 -2)

  "last <day-of-week> of <time>"
  [#"(?iu)posledn([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|im|[íi])" {:form :day-of-week} #"(?iu)ve?|ze?" (dim :time)]
  (pred-last-of %2 %4)

  "last <day-of-week> <time>"
  [#"(?iu)posledn([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|im|[íi])" {:form :day-of-week} (dim :time)]
  (pred-last-of %2 %3)

 "last <cycle> of <time>"
 [#"(?iu)posledn([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|im|[íi])" (dim :cycle) #"(?iu)ve?|na|ze?" (dim :time)]
 (cycle-last-of %2 %4)

 "last <cycle> <time>"
 [#"(?iu)posledn([íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|im|[íi])" (dim :cycle) (dim :time)]
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
  #"(?i)loni|rok (zp[ěe]t|zp[áa]tky)"
  (cycle-nth :year -1)

  "2 years ago"
  #"(?i)p[řr]edloni"
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
  [(integer 0 23)]
  (assoc (hour (:value %1) true) :latent true)

  "<integer> with hour postfix"
  #"(?i)([1-9]|1[0-9]|2[0-4])h(od|odin)?\b"
  (hour (Integer/parseInt(first (:groups %1))) true)

  "at <time-of-day>" ; o p[áa]t[ée], v deset, na [čc]tvrtou (hodinu)
  [#"(?iu)o|na|v|@" {:form :time-of-day}]
  (dissoc %2 :latent)


  "<time-of-day> o'clock"
  [{:form :time-of-day} #"(?iu)hod(in[áa]ch|inami|inama|in[áa]m|in[ěe]|inou|ina|ino|inu|iny|in)"]
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

 ;  "<time-of-day> p[řr]ed polednem/r[áa]no/dopoledne"
 ;  [{:form :time-of-day} #"(?iu)(p[řr]ed polednem|(z )?r[áa](nama|n[ůu]m|nech|num|nem|na|no|nu|ny|n)|rann[íi]|dopoledn([áa]ch|[íi]ch|[íi]m|ema|em|[íi]|e|i|y)|dopo)"]
 ; (let [[p meridiem]
 ;        [[(hour 0) (hour 12) false] :am]]
 ;    (-> (intersect %1 (apply interval p))
 ;        (assoc :form :time-of-day)))

 ; "<time-of-day> po poledni/odpoledne"
 ; [{:form :time-of-day} #"(?iu)(po poledni|odpoledn([áa]ch|[íi]ch|[íi]m|ema|em|[íi]|e|i|y))"]
 ; (let [[p meridiem]
 ;       [[(hour 12) (hour 0) false] :pm]]
 ;   (-> (intersect %1 (apply interval p))
 ;       (assoc :form :time-of-day)))

 ; "<time-of-day> na ve[čc]er/v noci"
 ; [{:form :time-of-day} #"(?iu)(na )?ve[čc](er[ůu]m|erama|erech|erum|erem|er[ůu]|era|ere|eru|ery|[íi]r|er)|(v )?no(c[íi]ch|cemi|cema|c[íi]m|cech|cem|c[íi]|ce|ci|c)"]
 ; (let [[p meridiem]
 ;       [[(hour 6) (hour 12) false]]]
 ;   (-> (intersect %1 (apply interval p))
 ;       (assoc :form :time-of-day)))

 "<ordinal> (as hour)"
 [(dim :ordinal #(and (not (:date-inflection %)) (<= 1 (:value %) 24)))]
 (assoc (hour (:value %1) true) :latent true)

  "noon"
  #"(?iu)poledn([áa]ch|[íi]ch|[íi]m|ema|em|[íi]|e|y)" ; removed "i" to ignore "po poledni"
  (hour 12 false)

  "midnight|EOD|end of day"
  #"(?iu)p[ůu]lno(c[íi]ch|cemi|cema|c[íi]m|cech|cem|c[íi]|ce|ci|c)"
  (hour 0 false)

  "quarter (relative minutes)"
  #"(?iu)[čc]tvr(t[ěe]|ti|t)( hodiny)?"
  {:relative-minutes 15}

  "half (relative minutes)"
  #"p[ůu]l( hodiny)?"
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
  [#(:relative-minutes %) #"(?iu)do|p[řr]ed" (dim :time :full-hour)]
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
  [#"(?iu)(z )?r[áa](nn[íi]|nama|n[ůu]m|nech|num|nem|na|no|nu|ny|n)|po p[ůu]lnoci"]
  (assoc (interval (hour 0 false) (hour 12 false) false) :form :part-of-day :latent true)

  "before noon (one word)"
  [#"(?iu)dopoledn([áa]ch|[íi]ch|[íi]m|ema|em|[íi]|e|i|y)|dopo"]
  (assoc (interval (hour 7 false) (hour 12 false) false) :form :part-of-day :latent true)

  "afternoon"
  [#"(?iu)odpoledn([áa]ch|[íi]ch|[íi]m|ema|em|[íi]|e|i|y)|odpo|po ob[ěe]d[u[ěe]]|po poledni"]
  (assoc (interval (hour 12 false) (hour 23 false) false) :form :part-of-day :latent true)

  "evening"
  [#"(?iu)ve[čc](ern[íi]|er[ůu]m|erama|erech|erum|erem|er[ůu]|era|ere|eru|ery|[íi]r|er)( hodina)?"]
  (assoc (interval (hour 17 false) (hour 0 false) false) :form :part-of-day :latent true)

  "night"
  [#"(?iu)no(c[íi]ch|cemi|cema|c[íi]m|cech|cem|c[íi]|ce|ci|c)"]
  (assoc (interval (hour 19 false) (hour 5 false) false) :form :part-of-day :latent true)

  "lunch"
  [#"(?iu)ob[ěe](dama|d[ůu]m|dech|dum|dem|d[ěe]|d[ůu]|da|de|du|dy|d)"]
  (assoc (interval (hour 12 false) (hour 14 false) false) :form :part-of-day :latent true)

  "in|during the <part-of-day>" ;; removes latent
  [#"(?iu)(v|na) ?([čc]ase?)" {:form :part-of-day}]
  (dissoc %2 :latent)

  "this <part-of-day>"
  [#"(?iu)t([ěe]mihle|[ěe]mahle|[ěe]chhle|[ěe]mhle|ohohle|omuhle|[íi]mhle|[íi]mdle|[ýy]hle|[ée]hle|[ýy]dle|oudle|enhle|[ěe]hle|ouhle|omhle|ahle|yhle|uhle|ohle|odle|ihle|omle)" {:form :part-of-day}]
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

  "<time> <part-of-day>"
  [#"(?iu)o" (dim :time) {:form :part-of-day}]
  (intersect %3 %2)

  ;; "<part-of-day> of <time>" ; since "morning" "evening" etc. are latent, general time+time is blocked
  ;; [{:form :part-of-day} #"(?iu)of" (dim :time)]
  ;; (intersect %1 %3)


  ; Other intervals: week-end, seasons

  "week-end" ; from Saturday midnight to Sunday midnight
  #"(?iu)v[íi]ken(dama|d[ůu]m|dech|dem|dum|d[ůu]|de|du|dy|d)"
  (interval (intersect (day-of-week 6) (hour 0 false))
            (intersect (day-of-week 1) (hour 0 false))
            false)

  "season"
  #"(?iu)l([ée]t[ůu]m|[ée]tama|[ée]tech|[ée]tum|[ée]tem|[ée]t[ěe]|[ée]ta|[ée]to|[ée]tu|[ée]ty|et[ěe]|[ée]t)"
  (interval (month-day 6 21) (month-day 9 23) false)

  "season"
  #"(?iu)podzi(m[ůu]m|mama|mech|mum|mem|m[ůu]|ma|me|mu|my|m)"
  (interval (month-day 9 23) (month-day 12 21) false)

  "season"
  #"(?iu)zi(m[áa]ch|mami|mama|m[áa]m|m[ěe]|mou|ma|mo|mu|my|m)"
  (interval (month-day 12 21) (month-day 3 20) false)

  "season"
  #"(?iu)ja(rama|rech|r[ůu]m|rum|rem|[řr]e|ra|ro|ru|ry|r)"
  (interval (month-day 3 20) (month-day 6 21) false)

  ; Other Named Intervals
  "summer holidays"
  #"(?iu)letn(ímu|ích|íma|ího|ími|ím|í) prázdn(inách|inama|inami|inám|iny|in)"
  (interval (month-day 7 1) (month-day 8 31) false)

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
  [{:form :time-of-day} #"(?iu)((nebo )?n[ěe]co )?kolem|zhruba|(nebo )?podobn[ěe]"]
  (-> %1
    (dissoc :latent)
    (merge {:precision "approximate"}))

  "<time-of-day> sharp" ; sharp
  [{:form :time-of-day} #"(?iu)p[řr]esn[ěe]"]
  (-> %1
    (dissoc :latent)
    (merge {:precision "exact"}))

  "about <time-of-day>" ; about
  [#"(?iu)v?okolo|kolem|plus ?m[i[íi]]nus|zhruba|tak o" {:form :time-of-day}]
  (-> %2
    (dissoc :latent)
    (merge {:precision "approximate"}))

  "exactly <time-of-day>" ; sharp
  [#"(?iu)p[řr]esn[ěe]( v)?" {:form :time-of-day} ]
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
  [(dim :time #(not (:latent %))) #"\-|do|a[žz] do|a[žz] po" (dim :time #(not (:latent %)))]
  (interval %1 %3 true)

  "from <ordinal> - <ordinal> (interval)"
  [#"(?iu)od" (dim :ordinal) #"\-|do|po|a[žz] [pd]o|(ale )?p[řr]ed" (dim :ordinal)]
  (interval (day-of-month (:value %2)) (day-of-month (:value %4)) true)

  "from <number> - <number> (interval)"
  [#"(?iu)od" (dim :number) #"\-|do|po|a[žz] [pd]o|(ale )?p[řr]ed" (dim :number)]
  (interval (day-of-month (:value %2)) (day-of-month (:value %4)) true)

  "from <datetime> - <datetime> (interval)"
  [#"(?iu)od" (dim :time #(not= :hour (:grain %))) #"\-|do|po|a[žz] [pd]o|(ale )?p[řr]ed" (dim :time)]
  (interval %2 %4 true)

  "from <hour> - <datetime> (interval)" ; exclude ending hour from interval
  [#"(?iu)od" (dim :time :full-hour) #"\-|do|po|a[žz] [pd]o|(ale )?p[řr]ed" (dim :time)]
  (interval (intersect %2 (minute 30)) (intersect %4 (minute 0)) true)

  "between <datetime> and <datetime> (interval)"
  [#"(?iu)mezi" (dim :time #(not= :hour (:grain %))) #"a" (dim :time)]
  (interval %2 %4 true)

  "between <hour> and <datetime> (interval)" ; exclude ending hour from interval
  [#"(?iu)mezi" (dim :time :full-hour) #"a" (dim :time)]
  (interval (intersect %2 (minute 0)) (intersect %4 (minute 0)) true)

  "<interval> month"
  [(dim :time) {:form :month}]
  (intersect %1 %2)

  ; Specific for time-of-day, to help resolve ambiguities

  "<time-of-day> - <time-of-day> (interval)"
  [#(and (= :time-of-day (:form %)) (not (:latent %)))
    #"\-|:|do|a[žz] do|az do|a[žz] po|az po"
    #(and (= :time-of-day (:form %)) (not (:latent %)))
  ]
  (interval %1 %3 true)

  "from <time-of-day> - <time-of-day> (interval)"
  [#"(?iu)(od|po)" {:form :time-of-day} #"((ale )?p[řr]ed)|\-|do|po|a[žz] do|az do|a[žz] po|az po" {:form :time-of-day}]
  (interval %2 %4 true)

  "between <time-of-day> and <time-of-day> (interval)"
  [#"(?iu)mezi" {:form :time-of-day} #"a|i" {:form :time-of-day}]
  (interval %2 %4 true)

  ; ; Specific for within duration... Would need to be reworked
  ; "within <duration>"
  ; [#"(?iu)(w )?ci(a|[ąa])gu|zakresie|obr[ęe]bie|obrebie" (dim :duration)]
  ; (interval (cycle-nth :second 0) (in-duration (:value %2)) false)

  "by <time>"; if time is interval, take the start of the interval (by tonight = by 6pm)
  [#"(?iu)(a[z[žz]] )?do" (dim :time)]
  (interval (cycle-nth :second 0) %2 false)

  "by the end of <time>"; in this case take the end of the time (by the end of next week = by the end of next sunday)
  [#"(?iu)do (konce )?(tohoto|t[ée]to)?" (dim :time)]
  (interval (cycle-nth :second 0) %2 true)

  ; One-sided Intervals

  "until <time-of-day>"
  [#"(?iu)(a[žz] )?do|p[řr]ed" (dim :time)]
  (merge %2 {:direction :before})

  "after <time-of-day>"
  [#"(?iu)po" (dim :time)]
  (merge %2 {:direction :after})

  ;; In this special case, the upper limit is exclusive
  "<hour-of-day> - <hour-of-day> (interval)"
  [{:form :time-of-day} #"(?iu)-|do|a[žz] po" #(and (= :time-of-day (:form %))
  									  (not (:latent %)))]
  (interval %1 %3 :exclusive)

  "from <hour-of-day> - <hour-of-day> (interval)"
  [#"(?iu)od" {:form :time-of-day} #"-|a[žz] po|do|po" #(and (= :time-of-day (:form %))
  									              (not (:latent %)))]
  (interval %2 %4 :exclusive)

  ;; "time => time2 (experiment)"
  ;; (dim :time)
  ;; (assoc %1 :dim :time2)

)
