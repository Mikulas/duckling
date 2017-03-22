(
  ; Context map
  ; Tuesday Feb 12, 2013 at 4:30am is the "now" for the tests
  {:reference-time (time/t -2 2013 2 12 4 30 0)
   :min (time/t -2 1900)
   :max (time/t -2 2100)}

  "ted"
  "nyni"
  "co nejdrive"
  "okamzite"
  "hned"
  "cim driv tim lip"
  (datetime 2013 2 12 4 30 00)

  "dnes"
  "dneska"
  (datetime 2013 2 12)

  "vcera"
  "pred dnem"
  "den zpatky"
  "den zpet"
  (datetime 2013 2 11)

  "zitra"
  (datetime 2013 2 13)
  "o den pozdeji"
  (datetime 2013 2 13 4)

  "pozitri"
  (datetime 2013 2 14)
  "o dva dny pozdeji"
  (datetime 2013 2 14 4)

  "pondeli"
  "pristi pondeli"
  "pondelek"
  "po"
  (datetime 2013 2 18 :day-of-week 1)

  "Pondeli, 18. unora"
  "Pondeli, Unor 18"
  "Pondeli 18teho Unora"
  "Pondeli 18-ty unor"
  "Pondeli, 18-teho Unora"
  "pondelek, 18teho unora"
  "po, 18 unor"
  (datetime 2013 2 18 :day-of-week 1 :day 18 :month 2)

  "Sobota, druheho unora"
  (datetime 2013 2 2 :day-of-week 2 :day 2 :month 2)

  "Utery"
  "ut"
  "tohle utery"
  "tento uterek"
  "toto utery"
  (datetime 2013 2 19)

  "ctvrtek"
  "tento ctvrtek"
  "ct"
  (datetime 2013 2 14)

  "patek"
  "tento patek"
  "tenhle patek"
  "pa"
  "pa."
  (datetime 2013 2 15)

  "sobota"
  "tahle sobota"
  "so"
  "so."
  (datetime 2013 2 16)

  "nedele"
  "ne"
  "ne."
  (datetime 2013 2 17)

  "prvniho brezna"
  "prvni brezen"
  "brezen prvniho"
  "1. brezen"
  "1. brezna"
  (datetime 2013 3 1 :day 1 :month 3)

  "tretiho brezna"
  "brezen 3."
  "brezen treti"
  (datetime 2013 3 3 :day 3 :month 3)

  ;; ;;coto
  ;; "the ides of march"
  ;; (datetime 2013 3 15 :month 3)

  "3. brezna 2015"
  "brezen 3. 2015"
  "3 brezen 2015"
  "brezen 3 2015"
  "treti brezen 2015"
  "3/3/2015"
  "3/3/15"
  "2015-3-3"
  "2015-03-03"
  "3.3.2015"
  "3. 3. 2015"
  (datetime 2015 3 3 :day 3 :month 3 :year 2015)

  "15. unor"
  "15teho unora"
  "Unor 15"
  "15-teho Unora"
  "15/2"
  "15. 2."
  "15.2."
  "patnacteho unora"
  "patnacty unor"
  "Unor patnacteho"
  (datetime 2013 2 15 :day 15 :month 2)

  "Srpen 8"
  "Srpna 8"
  "8 srpen"
  "osmeho srpna"
  "osmyho srpna"
  (datetime 2013 8 8 :day 8 :month 8)

  "rijen 2014"
  "rijna 2014"
  (datetime 2014 10 :year 2014 :month 10)

  "31/10/1974"
  "31. 10. 1974"
  "1974-10-31"
  "31. 10.1974"
  "31.10.1974"
  (datetime 1974 10 31 :day 31 :month 10 :year 1974)

  "14duben 2015"
  "Duben 14, 2015"
  "14teho dubna 15"
  "14-teho dubna 15"
  "14-ty Duben 15"
  "ctrnacteho dubna 15"
  "ctrnacteho dubna 2015"
  (datetime 2015 4 14 :day 14 :month 4 :years 2015)

  "pristi utery"
  "utery za tyden"
  "pristim uterku"
  "utery pristi tyden"
  "utery v nadchazejicim tydnu"
  "utery v pristim tydnu"
  (datetime 2013 2 19 :day-of-week 2)

  "pristi brezen"
  (datetime 2013 3)

  "Nedele, 10 unora"
  "Nedele, unora 10"
  "Nedele, 10teho unora"
  "Nedele, 10-teho unora"
  "Nedele, 10-ty unor"
  "Nedele, 10. unora"
  (datetime 2013 2 10 :day-of-week 7 :day 10 :month 2)

  "st., Unor13"
  "streda, 13Unora"
  "streda, 13unor"
  "st 13teho Unora"
  "St, 13unora"
  "streda trinacteho unora"
  (datetime 2013 2 13 :day-of-week 3 :day 13 :month 2)

  "Pondeli, unor 18"
  "Pondeli, 18 unora"
  "Pondeli, 18. unora"
  "Pondelek, unor 18"
  "Pondelek, 18 unora"
  "Pondelek, 18. unora"
  "Po, unor 18"
  (datetime 2013 2 18 :day-of-week 1 :day 18 :month 2)

  "tento tyden"
  "tenhle tyden"
  "v tomto tydnu"
  (datetime 2013 2 11 :grain :week)

  "minuly tyden"
  "v minulem tydnu"
  "predchozi tyden"
  "v predchozim tydnu"
  "tyden pred"
  "pred tydnem"
  (datetime 2013 2 4 :grain :week)

  "pristi tyden"
  "nasledujici tyden"
  "tyden po"
  (datetime 2013 2 18 :grain :week)

  "minuly mesic"
  "minuleho mesice"
  "predchozi mesic"
  "predchoziho mesice"
  "po predchozim mesice"
  (datetime 2013 1)

  "nasledujici mesic"
  "nadchazejici mesic"
  (datetime 2013 3)

  "tohle ctvrtleti"
  "tento kvartal"
  (datetime 2013 1 1 :grain :quarter)

  "nasledujici ctvrtleti"
  "v nasledujicim ctvrtleti"
  "v pristim kvartalu"
  "nasledujici kvartal"
  (datetime 2013 4 1 :grain :quarter)

  "treti ctvrtleti"
  "treti kvartal"
  (datetime 2013 7 1 :grain :quarter)

  "4. kvartal 2018"
  "4. ctvrtleti 2018"
  (datetime 2018 10 1 :grain :quarter)

  "predloni"
  "predpredchozi rok"
  (datetime 2011)

  "dva roky zpet"
  "dva roky zpatky"
  "pred dvema lety"
  (datetime 2011 2)

  "pred peti lety"
  "pred peti roky"
  (datetime 2008 2)

  "predchozi rok"
  "minuly rok"
  "loni"
  (datetime 2012)

  "rok zpet"
  "rok zpatky"
  (datetime 2012)

  "jeden rok zpet"
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

  "pristi rok"
  "nasledujici rok"
  "nadchazejici rok"
  "pristi rok"
  (datetime 2014)

  "nedele minuly tyden"
  "nedele v minulem tydnu"
  "minula nedele"
  "posledni nedele"
  (datetime 2013 2 10 :day-of-week 7)

  "minule utery"
  "posledni utery"
  (datetime 2013 2 5 :day-of-week 2)

  "pristi utery" ; today is tuesday, next tuesday is after a week
  (datetime 2013 2 19 :day-of-week 2)

  "pristi streda" ; today is tuesday, next wednesday is tomorrow
  (datetime 2013 2 13 :day-of-week 3)

  "streda pristi tyden"
  "streda v pristim tydnu"
  "streda za tyden"
  (datetime 2013 2 20 :day-of-week 3)

  "patek pristi tyden"
  (datetime 2013 2 22 :day-of-week 5)

  "pondeli tento tyden"
  (datetime 2013 2 11 :day-of-week 1)

  "utery tento tyden"
  "uterek v tomto tydni"
  (datetime 2013 2 12 :day-of-week 2)

  "tahle streda"
  "tato streda"
  "streda tento tyden"
  (datetime 2013 2 13 :day-of-week 3)

  "minule pondeli"
  (datetime 2013 2 11 :day-of-week 1)

  "pozitri"
  (datetime 2013 2 14)

  "popozitri"
  (datetime 2013 2 15)

  "predevcirem"
  (datetime 2013 2 10)

  "treti den rijna"
  "treti den v rijnu"
  (datetime 2013 10 3)

  "prvni tyden v rijnu 2014"
  "prvni tyden rijna 2014"
  (datetime 2014 10 6 :grain :week)

  ;  "prvni utery v rijnu"
  ;  "prvni rijnove utery"
  ;  (datetime 2013 10 1)

  ; "treti utery v zari 2014"
  ; "treti zarijove utery 2014"
  ; "o tretim zarijovem utery 2014"
  ;  (datetime 2014 9 16)

  ; "prvni streda v rijnu 2014"
  ; "prvni rijnova streda 2014"
  ; "prvni rijnove stredy 2014"
  ; (datetime 2014 10 1)

  ; "druha streda v rijnu 2014"
  ; "druhou rijnovou stredu 2014"
  ; (datetime 2014 10 8)

  "v poledne"
  "o poledni"
  (datetime 2013 2 12 12 :hour 12)

  "o pulnoci"
  "v pulnoci"
  (datetime 2013 2 13 0 :hour 0)

  "ve 3 rano"
  "3 z rana"
  "o treti rano"
  "treti ranni"
  (datetime 2013 2 12 3 :hour 3)

  "3 v noci"
  ; "3 po pulnoci" ; ambiguous minutes
  "o treti v noci"
  (datetime 2013 2 12 3)

  "3:18 rano"
  "3:18 po pulnoci"
  (datetime 2013 2 12 3 18)

  "o treti"
  "o 3. po poledni"
  "3 po obede"
  "3 odpoledne"
  "3 odpoledni"
  "tri odpoledne"
  "o treti odpoledne"
  "treti hodina"
  "patnacta hodina"
  "o patnacte"
  "o 15te"
  "3h odpo"
  (datetime 2013 2 12 15 :hour 3 :meridiem :pm)

  "3 hodiny po poledni"
  (datetime 2013 2 12 15 0 :hour 3 :minute 0 :meridiem :pm)

  "sesta hodina"
  (datetime 2013 2 12 6 :hour 6)

  "6 odpoledne"
  "6 vecer"
  "sesta odpoledne"
  "o seste odpoledni"
  "o seste vecerni"
  "o 18te"
  "sest odpoledne"
  "sesta vecerni"
  "osmnacta hodina"
  "o osmnacte"
  "6 v podvecer"
  "18h"
  (datetime 2013 2 12 18 :hour 6 :meridiem :pm)

  "18.00"
  "18:00"
  "1800"
  (datetime 2013 2 12 18 0 :hour 6 :minute 0 :meridiem :pm)

  ;"7 po poledni" ; ambiguous: minutes or hours
  "7 odpoledne"
  "sedma odpoledni"
  "sedm odpoledne"
  "o sedme odpoledni"
  "o sedme vecer"
  "o devatenacte"
  "devatenacta hodina"
  "7h vecer"
  (datetime 2013 2 12 19 :hour 7 :meridiem :pm)

  "sedma hodina"
  (datetime 2013 2 12 7 :hour 7)

  "19:00"
  "19.00"
  "1900"
  (datetime 2013 2 12 19 0 :hour 7 :minute 0 :meridiem :pm)

  "osm v noci"
  (datetime 2013 2 11 20 :hour 8 :meridiem :pm)

  "8 vecer"
  "8 odpoledne"
  "osm vecer"
  "8h vecer"
  (datetime 2013 2 12 20 :hour 8 :meridiem :pm)

  "8. hodina"
  "osma hodina"
  (datetime 2013 2 12 8 :hour 8)

  "20:00"
  "20.00"
  "2000"
  (datetime 2013 2 12 20 0 :hour 8 :minute 0 :meridiem :pm)

  "9.hodina"
  "kolem devaty"
  (datetime 2013 2 12 9 :hour 9)

  "9 v noci"
  (datetime 2013 2 11 21 :hour 9 :meridiem :pm)

  "devateho vecer"
  (datetime-interval [2013 3 9 17] [2013 3 10 0])

  "devata vecer"
  "9. odpoledne"
  "9 vecer"
  "21. hodina"
  "devata vecerni hodina"
  (datetime 2013 2 12 21 :hour 9 :meridiem :pm)

  "21:00"
  "21.00"
  "2100"
  (datetime 2013 2 12 21 0 :hour 9 :minute 0 :meridiem :pm)

  "20 po 3"
  "3:20"
  "3:20 odpoledne"
  "tri dvacet"
  (datetime 2013 2 12 15 20 :hour 3 :minute 20 :meridiem :pm)

  "v pul sestnacte"
  "o pul ctvrte"
  "15:30"
  (datetime 2013 2 12 15 30 :hour 3 :minute 30 :meridiem :pm)

  "15:23:24"
  (datetime 2013 2 12 15 23 24 :hour 15 :minute 23 :second 24)

  "ctvrt do poledne"
  "ctvrt hodiny pred polednem"
  "ctvrt do dvanacte"
  "11:45"
  (datetime 2013 2 12 11 45 :hour 11 :minute 45)

  "8 vecer vcera"
  (datetime 2013 2 11 20)

  "o 7:30 vecer patek, 20. zari"
  "o 7:30 vecer patek, zari 20"
  (datetime 2013 9 20 19 30 :hour 7 :minute 30 :meridiem :pm)

  "o 9 rano v sobotu"
  "v sobotu na 9tou rano"
  (datetime 2013 2 16 9 :day-of-week 6 :hour 9 :meridiem :am)

  "Pa, Cervenec 18, 2014 19:00"
  (datetime 2014 7 18 19 0 :day-of-week 5 :hour 7 :meridiem :pm)

  "za vterinu"
  "za sekundu"
  "ve vterine"
  "sekunda od ted"
  (datetime 2013 2 12 4 30 1)

  "v minute"
  "za jednu minutu"
  "po minute"
  (datetime 2013 2 12 4 31 0)

  "za 2 minuty"
  "ve dvou minutach"
  "2 minuty od ted"
  (datetime 2013 2 12 4 32 0)

  "za 60 minut"
  (datetime 2013 2 12 5 30 0)

  "za pul hodiny"
  (datetime 2013 2 12 5 0 0)

  "za 2.5 hodiny"
  "za dve a pul hodiny"
  (datetime 2013 2 12 7 0 0)

  "za hodinu"
  "za jednu hodinu"
  "za 1h"
  (datetime 2013 2 12 5 30)

  "za tri hodiny"
  (datetime 2013 2 12 7 30)

  "za 24 hodin"
  (datetime 2013 2 13 4 30)

  "za jeden den"
  "den od ted"
  "za den od ted"
  (datetime 2013 2 13 4)

  "3 roky od dnes"
  "3 roky od dneska"
  "3 leta ode dnes"
  (datetime 2016 2)

  "za 7 dni"
  (datetime 2013 2 19 4)

  "za jeden tyden"
  ; "za tyden"
  (datetime 2013 2 19)

  "7 dni zpatky"
  (datetime 2013 2 5 4)

  "14 dni zpet"
  (datetime 2013 1 29 4)

  ; "tyden zpatky"
  "jeden tyden zpet"
  "1 tyden zpet"
  (datetime 2013 2 5)

  "pred tremi tydny"
  (datetime 2013 1 22)

  "tri mesice zpet"
  (datetime 2012 11 12)

  "dva roky zpet"
  (datetime 2011 2)

  "7 dni pozdeji"
  (datetime 2013 2 19 4)

  "tohle leto"
  "v lete"
  (datetime-interval [2013 6 21] [2013 9 24])

  "v zime"
  "na zimu"
  (datetime-interval [2012 12 21] [2013 3 21])

  "devata vecer na stedry den"
  (datetime 2013 12 24 21 :meridiem :pm)

  "mezi osmou rano a devatou vecer na stedry den"
  (datetime-interval [2013 12 24 8 :meridiem :am] [2013 12 24 21 :meridiem :pm])

  "vecer"
  "dnes vecer"
  (datetime-interval [2013 2 12 17] [2013 2 13 00])

  "tenhle vikend"
  "o vikendu"
  (datetime-interval [2013 2 16 00] [2013 2 18 00])

  "o letnich prazdninach"
  (datetime-interval [2013 7 1] [2013 9 1])

  "mezi osmou a devatou"
  "mezi osmou rano a devatou"
  "mezi osmou a devatou rano"
  (datetime-interval [2013 2 12 8] [2013 2 12 9])

  "Cervenec 13-15"
  "od 13. do 15. Cervence"
  "od 13 do 15 Cervence"
  "Cervenec 13 - Cervenec 15"
  (datetime-interval [2013 7 13] [2013 7 16])

  "Srpen 8 - Srpen 12"
  "8 - 12 Srpna"
  "8. az 12. Srpna"
  "od 8. az 12. Srpen"
  (datetime-interval [2013 8 8] [2013 8 13])

  "9:30 - 11:00"
  (datetime-interval [2013 2 12 9 30] [2013 2 12 11 0])

  "od 9:30 - 11:00 ve ctvrtek"
  "mezi 9:30 a 11:00 ve ctvrtek"
  "9:30 - 11:00 ve ctvrtek"
  "po 9:30 ale pred 11:00 ve ctvrtek"
  "ctvrtek od 9:30 do 11:00"
  (datetime-interval [2013 2 14 9 30] [2013 2 14 11 0])

  "v nedeli dopo"
  "v nedeli dopoledne"
  (datetime-interval [2013 2 17 7] [2013 2 17 12])

  "ctvrtek od 9 rano do 11 rano"
  (datetime-interval [2013 2 14 9] [2013 2 14 11])

  "11:30-1:30"
  (datetime-interval [2013 2 12 11 30] [2013 2 12 13 30])

  "10:30"
  (datetime 2013 2 12 10 30)

)
