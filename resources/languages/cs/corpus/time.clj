(
  ; Context map
  ; Tuesday Feb 12, 2013 at 4:30am is the "now" for the tests
  {:reference-time (time/t -2 2013 2 12 4 30 0)
   :min (time/t -2 1900)
   :max (time/t -2 2100)}

  "teď"
  "nyní"
  "co nejdříve"
  "okamžitě"
  "hned"
  "čim dřív tim líp"
  (datetime 2013 2 12 4 30 00)

  "dnes"
  "dneska"
  (datetime 2013 2 12)

  "včera"
  "před dnem"
  "den zpátky"
  "den zpět"
  (datetime 2013 2 11)

  "zítra"
  (datetime 2013 2 13)
  "o den později"
  (datetime 2013 2 13 4)

  "pozítří"
  (datetime 2013 2 14)
  "o dva dny později"
  (datetime 2013 2 14 4)

  "pondělí"
  "příští pondělí"
  "pondělek"
  "po"
  (datetime 2013 2 18 :day-of-week 1)

  "Pondělí, 18. února"
  "Pondělí, Únor 18"
  "Pondělí 18tého Února"
  "Pondělí 18-tý únor"
  "Pondělí, 18-tého Února"
  "pondělek, 18tého února"
  "po, 18 únor"
  (datetime 2013 2 18 :day-of-week 1 :day 18 :month 2)

  "Sobota, druhého února"
  (datetime 2013 2 2 :day-of-week 2 :day 2 :month 2)

  "Úterý"
  "út"
  "tohle úterý"
  "tento úterek"
  "toto úterý"
  (datetime 2013 2 19)

  "čtvrtek"
  "tento čtvrtek"
  "čt"
  (datetime 2013 2 14)

  "pátek"
  "tento pátek"
  "tenhle pátek"
  "pá"
  "pá."
  (datetime 2013 2 15)

  "sobota"
  "tahle sobota"
  "so"
  "so."
  (datetime 2013 2 16)

  "neděle"
  "ne"
  "ne."
  (datetime 2013 2 17)

  "prvního března"
  "první březen"
  "březen prvního"
  "1. březen"
  "1. března"
  (datetime 2013 3 1 :day 1 :month 3)

  "třetího března"
  "březen 3."
  "březen třetí"
  (datetime 2013 3 3 :day 3 :month 3)

  ;; ;;coto
  ;; "the ides of march"
  ;; (datetime 2013 3 15 :month 3)

  "3. března 2015"
  "březen 3. 2015"
  "3 březen 2015"
  "březen 3 2015"
  "třetí březen 2015"
  "3/3/2015"
  "3/3/15"
  "2015-3-3"
  "2015-03-03"
  "3.3.2015"
  "3. 3. 2015"
  (datetime 2015 3 3 :day 3 :month 3 :year 2015)

  "15. únor"
  "15tého února"
  "Únor 15"
  "15-tého Února"
  "15/2"
  "15. 2."
  "15.2."
  "patnáctého února"
  "patnáctý únor"
  "Únor patnáctého"
  (datetime 2013 2 15 :day 15 :month 2)

  "Srpen 8"
  "Srpna 8"
  "8 srpen"
  "osmého srpna"
  "osmýho srpna"
  (datetime 2013 8 8 :day 8 :month 8)

  "říjen 2014"
  "října 2014"
  (datetime 2014 10 :year 2014 :month 10)

  "31/10/1974"
  "31. 10. 1974"
  "1974-10-31"
  "31. 10.1974"
  "31.10.1974"
  (datetime 1974 10 31 :day 31 :month 10 :year 1974)

  "14duben 2015"
  "Duben 14, 2015"
  "14tého dubna 15"
  "14-tého dubna 15"
  "14-tý Duben 15"
  "čtrnáctého dubna 15"
  "čtrnáctého dubna 2015"
  (datetime 2015 4 14 :day 14 :month 4 :years 2015)

  "příští úterý"
  "úterý za týden"
  "příštím úterku"
  "úterý příští týden"
  "úterý v nadcházejícím týdnu"
  "úterý v příštím týdnu"
  (datetime 2013 2 19 :day-of-week 2)

  "příští březen"
  (datetime 2013 3)

  "Neděle, 10 února"
  "Neděle, února 10"
  "Neděle, 10tého února"
  "Neděle, 10-tého února"
  "Neděle, 10-tý únor"
  "Neděle, 10. února"
  (datetime 2013 2 10 :day-of-week 7 :day 10 :month 2)

  "st., Únor13"
  "středa, 13Února"
  "středa, 13únor"
  "st 13tého Února"
  "St, 13února"
  "středa třináctého února"
  (datetime 2013 2 13 :day-of-week 3 :day 13 :month 2)

  "Pondělí, únor 18"
  "Pondělí, 18 února"
  "Pondělí, 18. února"
  "Pondělek, únor 18"
  "Pondělek, 18 února"
  "Pondělek, 18. února"
  "Po, únor 18"
  (datetime 2013 2 18 :day-of-week 1 :day 18 :month 2)

  "tento týden"
  "tenhle týden"
  "v tomto týdnu"
  (datetime 2013 2 11 :grain :week)

  "minulý týden"
  "v minulém týdnu"
  "předchozí týden"
  "v předchozím týdnu"
  "týden před"
  "před týdnem"
  (datetime 2013 2 4 :grain :week)

  "příští týden"
  "následující týden"
  "týden po"
  (datetime 2013 2 18 :grain :week)

  "minulý měsíc"
  "minulého měsíce"
  "předchozí měsíc"
  "předchozího měsíce"
  "po předchozím měsíce"
  (datetime 2013 1)

  "následující měsíc"
  "nadcházející měsíc"
  (datetime 2013 3)

  "tohle čtvrtletí"
  "tento kvartál"
  (datetime 2013 1 1 :grain :quarter)

  "následující čtvrtletí"
  "v následujícím čtvrtletí"
  "v příštím kvartálu"
  "následující kvartál"
  (datetime 2013 4 1 :grain :quarter)

  "třetí čtvrtletí"
  "třetí kvartál"
  (datetime 2013 7 1 :grain :quarter)

  "4. kvartál 2018"
  "4. čtvrtletí 2018"
  (datetime 2018 10 1 :grain :quarter)

  "předloni"
  "předpředchozí rok"
  (datetime 2011)

  "dva roky zpět"
  "dva roky zpátky"
  "před dvěma lety"
  (datetime 2011 2)

  "před půl rokem"
  (datetime 2012 8)

  "za půl roku"
  (datetime 2013 8)

  "před pěti lety"
  "před pěti roky"
  (datetime 2008 2)

  "předchozí rok"
  "minulý rok"
  "loni"
  (datetime 2012)

  "rok zpět"
  "rok zpátky"
  (datetime 2012)

  "jeden rok zpět"
  (datetime 2012 2)

  "za rok"
  "za jeden rok"
  (datetime 2014 2)

  "napřesrok"
  (datetime 2014)

  "za dva roky"
  "za 2 roky"
  (datetime 2015 2)

  "tento rok"
  "letos"
  (datetime 2013)

  "příští rok"
  "následující rok"
  "nadcházející rok"
  "příští rok"
  (datetime 2014)

  "neděle minulý týden"
  "neděle v minulém týdnu"
  "minulá neděle"
  "poslední neděle"
  (datetime 2013 2 10 :day-of-week 7)

  "minulé úterý"
  "poslední úterý"
  (datetime 2013 2 5 :day-of-week 2)

  "příští úterý" ; today is tuesday, next tuesday is after a week
  (datetime 2013 2 19 :day-of-week 2)

  "příští středa" ; today is tuesday, next wednesday is tomorrow
  (datetime 2013 2 13 :day-of-week 3)

  "středa příští týden"
  "středa v příštím týdnu"
  "středa za týden"
  (datetime 2013 2 20 :day-of-week 3)

  "pátek příští týden"
  (datetime 2013 2 22 :day-of-week 5)

  "pondělí tento týden"
  (datetime 2013 2 11 :day-of-week 1)

  "úterý tento týden"
  "úterek v tomto týdni"
  (datetime 2013 2 12 :day-of-week 2)

  "tahle středa"
  "tato středa"
  "středa tento týden"
  (datetime 2013 2 13 :day-of-week 3)

  "minulé pondělí"
  (datetime 2013 2 11 :day-of-week 1)

  "pozítří"
  (datetime 2013 2 14)

  "popozítří"
  (datetime 2013 2 15)

  "předevčírem"
  (datetime 2013 2 10)

  "třetí den října"
  "třetí den v říjnu"
  (datetime 2013 10 3)

  "první týden v říjnu 2014"
  "první týden října 2014"
  (datetime 2014 10 6 :grain :week)

  ;  "první úterý v říjnu"
  ;  "první říjnové úterý"
  ;  (datetime 2013 10 1)

  ; "třetí úterý v září 2014"
  ; "třetí zářijové úterý 2014"
  ; "o třetím zářijovém úterý 2014"
  ;  (datetime 2014 9 16)

  ; "první středa v říjnu 2014"
  ; "první říjnová středa 2014"
  ; "první říjnové středy 2014"
  ; (datetime 2014 10 1)

  ; "druhá středa v říjnu 2014"
  ; "druhou říjnovou středu 2014"
  ; (datetime 2014 10 8)

  "v poledne"
  "o poledni"
  (datetime 2013 2 12 12 :hour 12)

  "o půlnoci"
  "v půlnoci"
  (datetime 2013 2 13 0 :hour 0)

  "ve 3 ráno"
  "3 z rána"
  "o třetí ráno"
  "třetí ranní"
  (datetime 2013 2 12 3 :hour 3)

  "3 v noci"
  ; "3 po půlnoci" ; ambiguous minutes
  "o třetí v noci"
  (datetime 2013 2 12 3)

  "3:18 ráno"
  "3:18 po půlnoci"
  (datetime 2013 2 12 3 18)

  "o třetí"
  "o 3. po poledni"
  "3 po obědě"
  "3 odpoledne"
  "3 odpolední"
  "tři odpoledne"
  "o třetí odpoledne"
  "třetí hodina"
  "patnáctá hodina"
  "o patnácté"
  "o 15té"
  "3h odpo"
  (datetime 2013 2 12 15 :hour 3 :meridiem :pm)

  "3 hodiny po poledni"
  (datetime 2013 2 12 15 0 :hour 3 :minute 0 :meridiem :pm)

  "šestá hodina"
  (datetime 2013 2 12 6 :hour 6)

  "6 odpoledne"
  "6 večer"
  "šestá odpoledne"
  "o šesté odpolední"
  "o šesté večerní"
  "o 18té"
  "šest odpoledne"
  "šestá večerní"
  "osmnáctá hodina"
  "o osmnácté"
  "6 v podvečer"
  "18h"
  (datetime 2013 2 12 18 :hour 6 :meridiem :pm)

  "18.00"
  "18:00"
  "1800"
  (datetime 2013 2 12 18 0 :hour 6 :minute 0 :meridiem :pm)

  ;"7 po poledni" ; ambiguous: minutes or hours
  "7 odpoledne"
  "sedmá odpolední"
  "sedm odpoledne"
  "o sedmé odpolední"
  "o sedmé večer"
  "o devatenácté"
  "devatenáctá hodina"
  "7h večer"
  (datetime 2013 2 12 19 :hour 7 :meridiem :pm)

  "sedmá hodina"
  (datetime 2013 2 12 7 :hour 7)

  "19:00"
  "19.00"
  "1900"
  (datetime 2013 2 12 19 0 :hour 7 :minute 0 :meridiem :pm)

  "osm v noci"
  (datetime 2013 2 11 20 :hour 8 :meridiem :pm)

  "8 večer"
  "8 odpoledne"
  "osm večer"
  "8h večer"
  (datetime 2013 2 12 20 :hour 8 :meridiem :pm)

  "8. hodina"
  "osmá hodina"
  (datetime 2013 2 12 8 :hour 8)

  "20:00"
  "20.00"
  "2000"
  (datetime 2013 2 12 20 0 :hour 8 :minute 0 :meridiem :pm)

  "9.hodina"
  "kolem devátý"
  (datetime 2013 2 12 9 :hour 9)

  "9 v noci"
  (datetime 2013 2 11 21 :hour 9 :meridiem :pm)

  "devátého večer"
  (datetime-interval [2013 3 9 17] [2013 3 10 0])

  "devátá večer"
  "9. odpoledne"
  "9 večer"
  "21. hodina"
  "devátá večerní hodina"
  (datetime 2013 2 12 21 :hour 9 :meridiem :pm)

  "21:00"
  "21.00"
  "2100"
  (datetime 2013 2 12 21 0 :hour 9 :minute 0 :meridiem :pm)

  "20 po 3"
  "3:20"
  "3:20 odpoledne"
  "tři dvacet"
  (datetime 2013 2 12 15 20 :hour 3 :minute 20 :meridiem :pm)

  "v půl šestnácté"
  "o půl čtvrté"
  "15:30"
  (datetime 2013 2 12 15 30 :hour 3 :minute 30 :meridiem :pm)

  "15:23:24"
  (datetime 2013 2 12 15 23 24 :hour 15 :minute 23 :second 24)

  "čtvrt do poledne"
  "čtvrt hodiny před polednem"
  "čtvrt do dvanácté"
  "11:45"
  (datetime 2013 2 12 11 45 :hour 11 :minute 45)

  "8 večer včera"
  (datetime 2013 2 11 20)

  "o 7:30 večer pátek, 20. září"
  "o 7:30 večer pátek, září 20"
  (datetime 2013 9 20 19 30 :hour 7 :minute 30 :meridiem :pm)

  "o 9 ráno v sobotu"
  "v sobotu na 9tou ráno"
  (datetime 2013 2 16 9 :day-of-week 6 :hour 9 :meridiem :am)

  "Pá, Červenec 18, 2014 19:00"
  (datetime 2014 7 18 19 0 :day-of-week 5 :hour 7 :meridiem :pm)

  "nový rok"
  (datetime 2013 12 31)

  "za vteřinu"
  "za sekundu"
  "ve vteřině"
  "sekunda od teď"
  (datetime 2013 2 12 4 30 1)

  "v minutě"
  "za jednu minutu"
  "po minutě"
  (datetime 2013 2 12 4 31 0)

  "za 2 minuty"
  "ve dvou minutách"
  "2 minuty od teď"
  (datetime 2013 2 12 4 32 0)

  "za 60 minut"
  (datetime 2013 2 12 5 30 0)

  "za půl hodiny"
  (datetime 2013 2 12 5 0 0)

  "za 2.5 hodiny"
  "za dvě a půl hodiny"
  (datetime 2013 2 12 7 0 0)

  "za hodinu"
  "za jednu hodinu"
  "za 1h"
  (datetime 2013 2 12 5 30)

  "za tři hodiny"
  (datetime 2013 2 12 7 30)

  "za 24 hodin"
  (datetime 2013 2 13 4 30)

  "za jeden den"
  "den od teď"
  "za den od teď"
  (datetime 2013 2 13 4)

  "3 roky od dnes"
  "3 roky od dneška"
  "3 léta ode dnes"
  (datetime 2016 2)

  "za 7 dní"
  (datetime 2013 2 19 4)

  "za jeden týden"
  "za jeden tejden"
  ; "za týden"
  (datetime 2013 2 19)

  "7 dní zpátky"
  (datetime 2013 2 5 4)

  "14 dní zpět"
  (datetime 2013 1 29 4)

  ; "týden zpátky"
  "jeden týden zpět"
  "1 týden zpět"
  (datetime 2013 2 5)

  "před třemi týdny"
  (datetime 2013 1 22)

  "tři měsíce zpět"
  (datetime 2012 11 12)

  "dva roky zpět"
  (datetime 2011 2)

  "7 dní později"
  (datetime 2013 2 19 4)

  "tohle léto"
  "v létě"
  (datetime-interval [2013 6 21] [2013 9 24])

  "v zimě"
  "na zimu"
  (datetime-interval [2012 12 21] [2013 3 21])

  "devátá večer na štědrý den"
  (datetime 2013 12 24 21 :meridiem :pm)

  "mezi osmou ráno a devátou večer na štědrý den"
  (datetime-interval [2013 12 24 8 :meridiem :am] [2013 12 24 21 :meridiem :pm])

  "večer"
  "dnes večer"
  (datetime-interval [2013 2 12 17] [2013 2 13 00])

  "tenhle víkend"
  "o víkendu"
  (datetime-interval [2013 2 16 00] [2013 2 18 00])

  "o letních prázdninách"
  (datetime-interval [2013 7 1] [2013 9 1])

  "mezi osmou a devátou"
  "mezi osmou ráno a devátou"
  "mezi osmou a devátou ráno"
  (datetime-interval [2013 2 12 8] [2013 2 12 9])

  "Červenec 13-15"
  "od 13. do 15. Července"
  "od 13 do 15 Července"
  "Červenec 13 - Červenec 15"
  (datetime-interval [2013 7 13] [2013 7 16])

  "Srpen 8 - Srpen 12"
  "8 - 12 Srpna"
  "8. až 12. Srpna"
  "od 8. až 12. Srpen"
  (datetime-interval [2013 8 8] [2013 8 13])

  "9:30 - 11:00"
  (datetime-interval [2013 2 12 9 30] [2013 2 12 11 0])

  "od 9:30 - 11:00 ve čtvrtek"
  "mezi 9:30 a 11:00 ve čtvrtek"
  "9:30 - 11:00 ve čtvrtek"
  "po 9:30 ale před 11:00 ve čtvrtek"
  "čtvrtek od 9:30 do 11:00"
  (datetime-interval [2013 2 14 9 30] [2013 2 14 11 0])

  "v neděli dopo"
  "v neděli dopoledne"
  (datetime-interval [2013 2 17 7] [2013 2 17 12])

  "čtvrtek od 9 ráno do 11 ráno"
  (datetime-interval [2013 2 14 9] [2013 2 14 11])

  "11:30-1:30"
  (datetime-interval [2013 2 12 11 30] [2013 2 12 13 30])

  "10:30"
  (datetime 2013 2 12 10 30)

  "na konci měsíce"
  (datetime-interval [2013 2 25] [2013 3 1])

  "na konci měsíce ledna"
  (datetime-interval [2014 1 25] [2014 2 1])

  "na konci roku"
  (datetime-interval [2013 11] [2014 1])

)
