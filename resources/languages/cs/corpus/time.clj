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
  (datetime 2013 2 19)

  "tohle úterý"
  (datetime 2013 2 12)

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

;  "příští úterý"
;  "úterý za týden"
;  "příštím úterku"
;  "úterý příští týden"
;  "úterý v nadcházejícím týdnu"
;  "úterý v příšťím týdnu"
;  (datetime 2013 2 19 :day-of-week 2)

;  "příští březen"
;  (datetime 2013 3)

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

;  ;; ;   ;; Cycles

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
 "tento úterek"
 "toto úterý"
  (datetime 2013 2 12 :day-of-week 2)

  "tahle středa"
  "tato středa"
  "středa tento týden"
  (datetime 2013 2 13 :day-of-week 3)

  ; "poslední pondělí"
  "minulé pondělí"
  (datetime 2013 2 11 :day-of-week 1)

 "pozítří"
 (datetime 2013 2 14)

  "předevčírem"
  (datetime 2013 2 10)

  ; "poslední pondělí v březnu"
  ; "poslední březnové pondělí"
  ; "poslední březnový pondělek"
  ; (datetime 2013 3 25 :day-of-week 1)

  ; "poslední květnový pátek"
  ; (datetime 2013 5 25 :day-of-week 1)

 ; "poslední neděle v březnu 2014"
 ; "poslední březnová neděle v roce 2014"
 ; "poslední březnová neděle roku 2014"
 ;  (datetime 2014 3 30 :day-of-week 7)

 "třetí den října"
 "třetí den v říjnu"
 (datetime 2013 10 3)

 "první týden v říjnu 2014"
 "první týden října 2014"
 (datetime 2014 10 6 :grain :week)

;  "poslední den v říjnu 2015"
;  "poslední den října 2015"
;  "poslední říjnový den 2015"
;  (datetime 2015 10 31)

;  "poslední týden v září 2014"
;  "poslední týden září 2014"
;  "poslední zářijový týden roku 2014"
;  (datetime 2014 9 22 :grain :week)


  ;; nth of
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

; ;; Hours

 "ve 3 ráno"
 "3 z rána"
 "o třetí ráno"
 "třetí ranní"
 (datetime 2013 2 12 3 :hour 3)

 "3 v noci"
 "3 po půlnoci"
 "o třetí v noci"
 (datetime 2013 2 12 3)

 "3:18 ráno"
 "3:18 po půlnoci"
 (datetime 2013 2 12 3 18)

 "o třetí"
 "o 3. po poledni"
 "3 po poledni"
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
 "18h"
 (datetime 2013 2 12 18 :hour 6 :meridiem :pm)

 "18.00"
 "18:00"
 "1800"
 (datetime 2013 2 12 18 0 :hour 6 :minute 0 :meridiem :pm)

 "7 po poledni"
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

;  "dziesiąta wieczorem"
;  "dziesiata popołudniu"
;  "dziesiata po południu"
;  "dziesiata wieczorem"
;  "dziesiata nocą"
;  "10 w nocy"
;  "o dziesiatej w nocy"
;  "o dwudziestej drugiej"
;  (datetime 2013 2 12 22 :hour 10 :meridiem :pm)

;  "jedenasta wieczorem"
;  "jedenasta w nocy"
;  "11 w nocy"
;  "11 wieczorem"
;  "o jedenastej wieczorem"
;  "o dwudziestejtrzeciej"
;  (datetime 2013 2 12 23 :hour 11 :meridiem :pm)

;  "jutro o drugiej"
;  (datetime 2013 2 13 2)

;  "po jutrze o drugiej"
;  (datetime 2013 2 14 2)

;  ;;   "3ish pm" ;; FIXME pm overrides precision
;  ;;   "3pm approximately"
;  "około 3 po południu"
;  "około trzeciej"
;  "koło trzeciej"
;  "o koło trzeciej"
;  "mniej wiecej o 3"
;  "tak o 15stej"
;  ;;   "at about 3pm"
;  (datetime 2013 2 12 15 :hour 3 :meridiem :pm) ;; :precision "approximate"

;  ;;   "tomorrow 5pm sharp" ;; FIXME precision is lost
;  "jutro równo o piątej popołudniu"
;  "jutro równo o 17-stej"
;  (datetime 2013 2 13 17 :hour 5 :meridiem :pm) ;; :precision "exact"

;  ;;   "at 15 past 3pm"
;  "piętnaście po trzeciej"
;  "15 po trzeciej"
;  "kwadrans po 3"
;  "trzecia piętnaście"
;  ;;   "3:15 in the afternon"
;  "15:15"
;  ;; "3:15pm"
;  ;; "3:15PM"
;  ;; "3:15p"
;  (datetime 2013 2 12 15 15 :hour 3 :minute 15 :meridiem :pm)

 "20 po 3"
 "3:20"
 "3:20 odpoledne"
 "tři dvacet"
 (datetime 2013 2 12 15 20 :hour 3 :minute 20 :meridiem :pm)

 ;;   "at half past three pm"
 "v půl šestnácté"
 "o půl čtvrté"
 "15:30"
 (datetime 2013 2 12 15 30 :hour 3 :minute 30 :meridiem :pm)

;   "3:30"
; ;;   "half three"
;  (datetime 2013 2 12 15 30 :hour 3 :minute 30)

  "15:23:24"
 (datetime 2013 2 12 15 23 24 :hour 15 :minute 23 :second 24)

 "čtvrt do poledne"
 "čtvrt hodiny před polednem"
 "čtvrt do dvanácté"
 "11:45"
 (datetime 2013 2 12 11 45 :hour 11 :minute 45)

  "8 večer včera"
  (datetime 2013 2 11 20)

;   ;; Mixing date and time

 "o 7:30 večer pátek, 20. září"
 "o 7:30 večer pátek, září 20"
 (datetime 2013 9 20 19 30 :hour 7 :minute 30 :meridiem :pm)

  "o 9 ráno v sobotu"
  "v sobotu na 9tou ráno"
  (datetime 2013 2 16 9 :day-of-week 6 :hour 9 :meridiem :am)

  "Pá, Červenec 18, 2014 19:00"
  (datetime 2014 7 18 19 0 :day-of-week 5 :hour 7 :meridiem :pm)


; ;; ; ;; Involving periods/durations

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
 ; "za týden"
 (datetime 2013 2 19)

 ; "za około pół godziny" ;; FIXME precision is lost
 ; "za jakieś pół godziny"
 ; (datetime 2013 2 12 5 0 0) ;; :precision "approximate"

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

;   "14 dni później"
;   ;;"a fortnight hence"
;   (datetime 2013 2 26 4)

;   "tydzień później"
;   "jeden tydzień później"
;   "1 tydzień później"
;   (datetime 2013 2 19)

;   "trzy tygodnie później"
;   (datetime 2013 3 5)

;   "trzy miesiące później"
;   (datetime 2013 5 12)

;   "dwa lata później"
;   (datetime 2015 2)

; ;;   ; Seasons

  "tohle léto"
  "v létě"
  (datetime-interval [2013 6 21] [2013 9 24])

  "v zimě"
  "na zimu"
  (datetime-interval [2012 12 21] [2013 3 21])

; ;;   ; US holidays (http://www.timeanddate.com/holidays/us/)
;   "Wigilia Bożego Narodzenia"
;   "Wigilia"
;   (datetime 2013 12 24)

;   "święta Bożego Narodzenia"
;   "boże narodzenie"
;   (datetime 2013 12 25)

;   "sylwester"
;   (datetime 2013 12 31)

;  "walentynki"
;   (datetime 2013 2 14)

; ;;   "memorial day"
; ;;   (datetime 2013 5 27)

;   "Dzień Mamy"
;   (datetime 2013 5 12)

;   "Dzień Taty"
;   (datetime 2013 6 16)

;  ;;   "memorial day week-end"
; ;;   (datetime-interval [2013 5 24 18] [2013 5 28 0])

; ;;   "independence day"
; ;;   "4th of July"
; ;;   "4 of july"
; ;;   (datetime 2013 7 4)

; ;;   "labor day"
; ;;   (datetime 2013 9 2)

;   "halloween"
;   (datetime 2013 10 31)

;   "dzień dziękczynienia"
;   "dziękczynienie"
;   (datetime 2013 11 28)

;  ;;   ; Part of day (morning, afternoon...)

 "večer"
 "dnes večer"
 (datetime-interval [2013 2 12 17] [2013 2 13 00])

;  "jutrzejszy wieczór"
;  "Środowy wieczór"
;  "jutrzejsza noc"
;  (datetime-interval [2013 2 13 18] [2013 2 14 00])

;  ;;   "tomorrow lunch"
;  ;;   "tomorrow at lunch"
;  ;;   (datetime-interval [2013 2 13 12] [2013 2 13 14])

;    "wczorajszy wieczór"
;    (datetime-interval [2013 2 11 18] [2013 2 12 00])

;  "ten week-end"
;  "ten weekend"
;  "ten wekend"
;  (datetime-interval [2013 2 15 18] [2013 2 18 00])

;   "poniedziałkowy poranek"
;   (datetime-interval [2013 2 18 4] [2013 2 18 12])


;  ;;  TODO
;  ;; "luty 15tego o poranku"
;  ;; "15 lutego o poranku"
;  ;; "poranek 15tego lutego"
;  ;; (datetime-interval [2013 2 15 4] [2013 2 15 12])


; ;;   ; Intervals involving cycles

;  "ostatnie 2 sekundy"
;  "ostatnie dwie sekundy"
;  (datetime-interval [2013 2 12 4 29 58] [2013 2 12 4 30 00])

;  "kolejne 3 sekundy"
;  "kolejne trzy sekundy"
;  (datetime-interval [2013 2 12 4 30 01] [2013 2 12 4 30 04])

;  "ostatnie 2 minuty"
;  "ostatnie dwie minuty"
;  (datetime-interval [2013 2 12 4 28] [2013 2 12 4 30])

;  "kolejne 3 minuty"
;  "nastepne trzy minuty"
;   (datetime-interval [2013 2 12 4 31] [2013 2 12 4 34])

;  "ostatnia 1 godzina"
;  "poprzednia jedna godzina"
;  (datetime-interval [2013 2 12 3] [2013 2 12 4])

;   "kolejne 3 godziny"
;   "kolejne trzy godziny"
;   (datetime-interval [2013 2 12 5] [2013 2 12 8])

;  "ostatnie 2 dni"
;  "ostatnie dwa dni"
;  "poprzednie 2 dni"
;  (datetime-interval [2013 2 10] [2013 2 12])

;   "nastepne 3 dni"
;   "nastepne trzy dni"
;   (datetime-interval [2013 2 13] [2013 2 16])

;   "nastepne kilka dni"
;   (datetime-interval [2013 2 13] [2013 2 16])

;   "ostatnie 2 tygodnie"
;   "ostatnie dwa tygodnie"
;   "poprzednie 2 tygodnie"
;   (datetime-interval [2013 1 28 :grain :week] [2013 2 11 :grain :week])

;   "nastepne 3 tygodnie"
;   "nastepne trzy tygodnie"
;   (datetime-interval [2013 2 18 :grain :week] [2013 3 11 :grain :week])

;   "ostatnie 2 miesiace"
;   "ostatnie dwa miesiące"
;   (datetime-interval [2012 12] [2013 02])

;   "nastepne trzy miesiące"
;   (datetime-interval [2013 3] [2013 6])

;   "ostatnie 2 lata"
;   "ostatnie dwa lata"
;   (datetime-interval [2011] [2013])

;  "nastepne 3 lata"
;  "kolejne trzy lata"
;  (datetime-interval [2014] [2017])


; ;;   ; Explicit intervals

 "Červenec 13-15"
 "od 13. do 15. Července"
 "od 13 do 15 Července"
 ;; "Lipca 13tego do 15tego" ;;FIX gives hours instaed of dates
 "Červenec 13 - Červenec 15"
 (datetime-interval [2013 7 13] [2013 7 16])

  "Srpen 8 - Srpen 12"
  (datetime-interval [2013 8 8] [2013 8 13])

  "9:30 - 11:00"
  (datetime-interval [2013 2 12 9 30] [2013 2 12 11 1])

  "od 9:30 - 11:00 ve čtvrtek"
  "mezi 9:30 a 11:00 ve čtvrtek"
  "9:30 - 11:00 ve čtvrtek"
  "po 9:30 ale před 11:00 ve čtvrtek"
  "čtvrtek od 9:30 do 11:00"
  (datetime-interval [2013 2 14 9 30] [2013 2 14 11 1])

  "čtvrtek od 9 ráno do 11 ráno"
  (datetime-interval [2013 2 14 9] [2013 2 14 12])

  "11:30-1:30" ; go train this rule!
  "11:30-1:30"
  "11:30-1:30"
  "11:30-1:30"
  "11:30-1:30"
  "11:30-1:30"
  "11:30-1:30"
  (datetime-interval [2013 2 12 11 30] [2013 2 12 13 31])

; ;;   "1:30 PM on Sat, Sep 21"
; ;;   (datetime 2013 9 21 13 30)

;  "w ciągu 2 tygodni"
;  "w ciągu dwóch tygodni"
;  (datetime-interval [2013 2 12 4 30 0] [2013 2 26])

;  "przed drugą po południu"
;  "przed drugą"
;  (datetime 2013 2 12 14 :direction :before)

;  ;;   "by 2:00pm"
;  ;;   (datetime-interval [2013 2 12 4 30 0] [2013 2 12 14])

;  ;;   "by EOD"
;  ;;   (datetime-interval [2013 2 12 4 30 0] [2013 2 13 0])

;  ;;   "by EOM"
;  ;;   (datetime-interval [2013 2 12 4 30 0] [2013 3 1 0])

;  ;;   "by the end of next month"
;  ;;   (datetime-interval [2013 2 12 4 30 0] [2013 4 1 0])
;  ;;   ; Timezones

;  ;;   "4pm CET"
;  ;;   (datetime 2013 2 12 16 :hour 4 :meridiem :pm :timezone "CET")

;  ;;   "Thursday 8:00 GMT"
;  ;;   (datetime 2013 2 14 8 00 :timezone "GMT")

;   ;; Bookface tests
;  "dziś o drugiej w południe"
;  "o drugiej popołudniu"
;  (datetime 2013 2 12 14)

;  "4/25 o 4 popołudniu"
;  "4/25 o 16"
;  "4/25 o szesnastej"
;  (datetime 2013 4 25 16)

;  "3 popoludniu jutro"
;  (datetime 2013 2 13 15)

;  "po drugiej po poludniu"
;  (datetime 2013 2 12 14 :direction :after)

;  "po pięciu dniach"
;  (datetime 2013 2 17 4 :direction :after)

;  "po drugiej po południu"
;  (datetime 2013 2 12 14 :direction :after)

;  "przed 11 rano"
;  (datetime 2013 2 12 11 :direction :before)

;  "jutro przed 11 rano" ;; FIXME this is actually not ambiguous. it's midnight to 11 am
;   (datetime 2013 2 13 11 :direction :before)

;   "w południe"
;   (datetime-interval [2013 2 12 12] [2013 2 12 19])

; ;;   "at 1:30pm"
; ;;   "1:30pm"
; ;;   (datetime 2013 2 12 13 30)

;  "w 15 minut"
;  "w piętnaście minut"
;  (datetime 2013 2 12 4 45 0)

; ;;   "after lunch"
; ;;   (datetime-interval [2013 2 12 13] [2013 2 12 17])

 "10:30"
 (datetime 2013 2 12 10 30)

; ;;   "morning" ;; how should we deal with fb mornings?
; ;;   (datetime-interval [2013 2 12 4] [2013 2 12 12])

;  "nastepny pon"
;  "kolejny poniedziałek"
;   (datetime 2013 2 18 :day-of-week 1)
)
