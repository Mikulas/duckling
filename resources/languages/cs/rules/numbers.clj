(

 "intersect"
 [(dim :number :grain #(> (:grain %) 1)) (dim :number)] ; grain 1 are taken care of by specific rule
 (compose-numbers %1 %2)

 "intersect (with and)"
 [(dim :number :grain #(> (:grain %) 1)) #"(?i)a" (dim :number)] ; grain 1 are taken care of by specific rule
 (compose-numbers %1 %3)

 ;;
 ;; Numeric
 ;;

  "integer (numeric)"
  #"(\d{1,18})"
  {:dim :number
   :integer true
   :value (Long/parseLong (first (:groups %1)))}


 ;;
 ;; Integers
 ;;

 "zero"
 #"(?i)(nu(lách|lami|lama|lám|lou|la|le|lo|lu|ly|l)|nic|žádn(ýho|ých|ými|ejch|ýma|ejma|ýmu|ému|ého|ým|ejm|ém|ym|ý|í|é|á|ou|ej))"
 {:dim :number :integer true :value 0 :grain 1}

 "one"
 #"(?i)(jednič(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky)|jed(na|en|noho|nomu|nom|ním|ny|něch|něm|němi|ni)|jediný)"
 {:dim :number :integer true :value 1 :grain 1}

 "two"
 #"(?i)(dvoj(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky)|dv(ouma|ěma|oum|ou|ě|a))"
 {:dim :number :integer true :value 2 :grain 1}

 "three"
 #"(?i)(troj(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky)|tř(ema|emi|ech|em|í|i))"
 {:dim :number :integer true :value 3 :grain 1}

 "four"
 #"(?i)(čtyřkách|štyrkách|čtyřkama|čtyřkám|čtyřkami|štyrkami|štyrkám|štyrkama|čtyřkou|štyrkou|čtyřka|čtyřky|čtyřce|čtyřku|čtyřko|čtyřek|štyrce|štyrek|štyrko|štyrku|štyrky|štyrka|čtyřech|čtyřmi|čtyřma|čtyřem|čtyrech|čtyři|čtyrem|čtyrmi|čtyrma|štyři|čtyry|čtyř|čtyr)"
 {:dim :number :integer true :value 4 :grain 1}

 "five"
 #"(?i)(pět(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky)|pěti?)"
 {:dim :number :integer true :value 5 :grain 1}

 "six"
 #"(?i)(šest(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky)|šes(ti|t))"
 {:dim :number :integer true :value 6 :grain 1}

 "seven"
 #"(?i)(sedmič(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky)|sed(um|mi|m))"
 {:dim :number :integer true :value 7 :grain 1}

 "eight"
 #"(?i)(v?osmič(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky)|v?osu?(mama|mami|mách|mám|mou|ma|em|mo|mu|my|mě|m))"
 {:dim :number :integer true :value 8 :grain 1}

 "nine"
 #"(?i)(devít(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)|devět)"
 {:dim :number :integer true :value 9 :grain 1}

 "ten"
 #"(?i)(desít(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky)|des(íti|eti|et))"
 {:dim :number :integer true :value 10 :grain 1}

 "eleven"
 #"(?i)jedenáct(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 11 :grain 1}

 "twelve"
 #"(?i)dvanáct(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 12 :grain 1}

 "thirteen"
 #"(?i)třináct(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 13 :grain 1}

 "fourteen"
 #"(?i)čtrnáct(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 14 :grain 1}

 "fifteen"
 #"(?i)patnáct(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 15 :grain 1}

 "sixteen"
 #"(?i)šestnáct(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 16 :grain 1}

 "seventeen"
 #"(?i)sedmnáct(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 17 :grain 1}

 "eighteen"
 #"(?i)osmnáct(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 18 :grain 1}

 "nineteen"
 #"(?i)devatenáct(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 19 :grain 1}

 ;; Numeric tens

 "twenty"
 #"(?i)(dvacít(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky)|dvac(et|eti|íti))"
 {:dim :number :integer true :value 20 :grain 1 :numeric-tens true}

 "thirty"
 #"(?i)(třicít(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky)|třic(et|eti|íti))"
 {:dim :number :integer true :value 30 :grain 1 :numeric-tens true}

 "fourty"
 #"(?i)(čtyřicít(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky)|čty(rycet|ryceti|řicet|řiceti|řicíti))"
 {:dim :number :integer true :value 40 :grain 1 :numeric-tens true}

 "fifty"
 #"(?i)padesát(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 50 :grain 1 :numeric-tens true}

 "sixty"
 #"(?i)šedesát(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 60 :grain 1 :numeric-tens true}

 "seventy"
 #"(?i)sedu?mdesát(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 70 :grain 1 :numeric-tens true}

 "eighty"
 #"(?i)osu?mdesát(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 80 :grain 1 :numeric-tens true}

 "ninety"
 #"(?i)devadesát(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 90 :grain 1 :numeric-tens true}

 ;; Multipliers

 "hundred"
 #"(?i)s(tech|tům|tě|tem|et|to|ty|ta|tu)"
 {:dim :number :integer true :value 100 :grain 2}

 ;; Thousands

 "thousand"
 #"(?i)tisí(cích|cema|cům|cem|cum|ců|ce|ci|c)"
 {:dim :number :integer true :value 1000 :grain 3}

 "million"
 #"(?i)mili(ónům|ónech|ónama|onama|ónum|ónem|ónů|onech|onům|óny|onem|onů|ónu|onum|óne|onu|one|ón|ony|on)"
 {:dim :number :integer true :value 1000000 :grain 6}

 ;; Compound numbers

 "integer 21..29,31..99"
  [(integer 10 90 #(#{20 30 40 50 60 70 80 90} (:value %))) (integer 1 9)]
  {:dim :number
   :integer true
   :value (+ (:value %1) (:value %2))
   :grain 1}

  "number hundreds"
  [(integer 1 9) (integer 100 100)]
  {:dim :number
   :integer true
   :value (* (:value %1) (:value %2))
   :grain (:grain %2)}

  "number thousands"
  [(integer 1 999) (integer 1000 1000)]
  {:dim :number
   :integer true
   :value (* (:value %1) (:value %2))
   :grain (:grain %2)}

  "number millions"
  [(integer 1 999999) (integer 1000000 1000000)]
  {:dim :number
   :integer true
   :value (* (:value %1) (:value %2))
   :grain (:grain %2)}

  ; "integer 100..999"
  ; [(integer 100) (integer 1 99)]
  ; {:dim :number
  ;  :integer true
  ;  :value (+ (:value %1) (:value %2))
  ;  :grain 1}

  ; "integer 1000..9999"
  ; [(integer 1000) (integer 1 999)]
  ; {:dim :number
  ;  :integer true
  ;  :value (+ (:value %1) (:value %2))
  ;  :grain 1}

  ; "integer 1000000..9999999"
  ; [(integer 1000000) (integer 1 999999)]
  ; {:dim :number
  ;  :integer true
  ;  :value (+ (:value %1) (:value %2))
  ;  :grain 1}

 ;; Compound numbers: single digit prefix

 ; "one and ordinal-tens no space"
 ; [#"(?i)jedena" (dim :number (:numeric-tens true))]
 ; {:dim :number :value (+ 1 (get %2 :value))}

 ; "three and  ordinal-tens no space"
 ; [#"(?i)třia" (dim :number (:numeric-tens true))]
 ; {:dim :number :value (+ 3 (get %2 :value))}

;  "single"
;  #"(?i)pojedynczy"
;  {:dim :number :integer true :value 1 :grain 1}

;  "a pair"
;  #"(?i)para?"
;  {:dim :number :integer true :value 2 :grain 1}

;  "dozen"
;  #"(?i)tuzin"
;  {:dim :number :integer true :value 12 :grain 1 :grouping true} ;;restrict composition and prevent "2 12"

;  "number 100"
;  #"(?i)(sto|setki)"
;  {:dim :number :integer true :value 100 :grain 2}

;  "number 200"
;  #"(?i)(dwie(ście| setki))"
;  {:dim :number :integer true :value 200 :grain 2}

;  "number 300"
;  #"(?i)(trzy(sta| setki))"
;  {:dim :number :integer true :value 300 :grain 2}

;  "number 400"
;  #"(?i)(cztery(sta| setki))"
;  {:dim :number :integer true :value 400 :grain 2}

;  "number 500"
;  #"(?i)(pięć(set| setek))"
;  {:dim :number :integer true :value 500 :grain 2}

;  "number 600"
;  #"(?i)(sześć(set| setek))"
;  {:dim :number :integer true :value 600 :grain 2}

;  "number 700"
;  #"(?i)(siedem(set| setek))"
;  {:dim :number :integer true :value 700 :grain 2}

;  "number 800"
;  #"(?i)(osiem(set| setek))"
;  {:dim :number :integer true :value 800 :grain 2}

;  "number 900"
;  #"(?i)(dziewięć(set| setek))"
;  {:dim :number :integer true :value 900 :grain 2}

;  "thousand"
;  #"(?i)ty(s|ś)i(a|ą|ę)c(e|y)?"
;  {:dim :number :integer true :value 1000 :grain 3}

;  "million"
;  #"(?i)milion(y|ów)?"
;  {:dim :number :integer true :value 1000000 :grain 6}

;  "couple"
;  #"pare"
;  {:dim :number :integer true :value 2}

;  "a few" ; TODO set assumption
;  #"kilk(a|u)"
;  {:dim :number :integer true :precision :approximate :value 3}

;  "twenty"
;  #"(?i)dwadzie(ś|s)cia|dwudziest(u|oma)"
;  {:dim :number :integer true :value 20 :grain 1}

;  "thirty"
;  #"(?i)trzydzieści|trzydziest(u|oma)"
;  {:dim :number :integer true :value 30 :grain 1}

;  "thirty"
;  #"(?i)trzydzieści|trzydziest(u|oma)"
;  {:dim :number :integer true :value 30 :grain 1}

;  "fou?rty"
;  #"(?i)czterdzieści|czterdziest(u|oma)"
;  {:dim :number :integer true :value 40 :grain 1}

;  "fifty"
;  #"(?i)pięćdziesiąt|pięćdziesięci(u|oma)"
;  {:dim :number :integer true :value 50 :grain 1}

;  "sixty"
;  #"(?i)sześćdziesiąt|sześćdziesięci(u|oma)"
;  {:dim :number :integer true :value 60 :grain 1}

;  "integer (20..90)"
;  #"(?i)(twenty|thirty|fou?rty|fifty|sixty|seventy|eighty|ninety)"
;  {:dim :number
;   :integer true
;   :value (get {"dwadzieścia" 20 "trzydzieści" 30 "czterdzieści" 40 "pięćdziesiąt" 50 "sześćdziesiąt" 60
;                "siedemdziesiąt" 70 "osiemdziesiąt" 80 "dziewięćdziesiąt" 90}
;               (-> %1 :groups first .toLowerCase))
;   :grain 1}

;  "integer 21..99"
;  [(integer 10 90 #(#{20 30 40 50 60 70 80 90} (:value %))) (integer 1 9)]
;  {:dim :number
;   :integer true
;   :value (+ (:value %1) (:value %2))}

;  "integer (numeric)"
;  #"(\d{1,18})"
;  {:dim :number
;   :integer true
;   :value (Long/parseLong (first (:groups %1)))}

;  "integer with thousands separator ,"
;  #"(\d{1,3}(,\d\d\d){1,5})"
;  {:dim :number
;   :integer true
;   :value (-> (:groups %1)
;              first
;              (clojure.string/replace #"," "")
;              Long/parseLong)}

;                                         ; composition
;  "special composition for missing hundreds like in one twenty two"
;  [(integer 1 9) (integer 10 99)] ; grain 1 are taken care of by specific rule
;  {:dim :number
;   :integer true
;   :value (+ (* (:value %1) 100) (:value %2))
;   :grain 1}


;  "number dozen"
;  [(integer 1 10) (dim :number #(:grouping %))]
;  {:dim :number
;   :integer true
;   :value (* (:value %1) (:value %2))
;   :grain (:grain %2)}


;  "number thousands"
;  [(integer 1 999) (integer 1000 1000)]
;  {:dim :number
;   :integer true
;   :value (* (:value %1) (:value %2))
;   :grain (:grain %2)}

;  "number millions"
;  [(integer 1 99) (integer 1000000 1000000)]
;  {:dim :number
;   :integer true
;   :value (* (:value %1) (:value %2))
;   :grain (:grain %2)}

;  ;;
;  ;; Decimals
;  ;;

;  "decimal number"
;  #"(\d*[.,]\d+)"
;  {:dim :number
;   :value (-> (:groups %1)
;              first
;              (clojure.string/replace #"," ".")
;              Double/parseDouble)}

;  "number dot number"
;  [(dim :number #(not (:number-prefixed %))) #"(?i)celá" (dim :number #(not (:number-suffixed %)))]
;  {:dim :number
;   :value (+ (* 0.1 (:value %3)) (:value %1))}


;  "decimal with thousands separator"
;  #"(\d+( \d\d\d)+[,.]\d+)"
;  {:dim :number
;   :value (-> (:groups %1)
;              first
;              (clojure.string/replace #"," ".") ;; convert decimal comma to decimal point
;              (clojure.string/replace #" " "") ;; remove thousand separators
;              Double/parseDouble)}

;  ;; negative number
;  "numbers prefix with -, negative or minus"
;  [#"(?i)-|m[ií]nus\s?|záporn[ýéáo]\s?" (dim :number #(not (:number-prefixed %)))]
;  (let [multiplier -1
;        value      (* (:value %2) multiplier)
;        int?       (zero? (mod value 1)) ; often true, but we could have 1.1111K
;        value      (if int? (long value) value)] ; cleaner if we have the right type
;    (assoc %2 :value value
;           :integer int?
;           :number-prefixed true)) ; prevent "- -3km" to be 3 billions


;  ;; suffixes

;                                         ; note that we check for a space-like char after the M, K or G
;                                         ; to avoid matching 3 Mandarins
;  "numbers suffixes (K, M, G)"
;  [(dim :number #(not (:number-suffixed %))) #"(?i)([kmg])(?=[\W\$€]|$)"]
;  (let [multiplier (get {"k" 1000 "m" 1000000 "g" 1000000000}
;                        (-> %2 :groups first .toLowerCase))
;        value      (* (:value %1) multiplier)
;        int?       (zero? (mod value 1)) ; often true, but we could have 1.1111K
;        value      (if int? (long value) value)] ; cleaner if we have the right type
;    (assoc %1 :value value
;           :integer int?
;           :number-suffixed true)) ; prevent "3km" to be 3 billions

;  ;;
;  ;; Ordinal numbers

 "first ordinal"
 #"(?i)první(m|ma|ch|mi|ho|mu)?"
 {:dim :ordinal
  :ordinal-digit true
  :value 1}

 "second ordinal"
 #"(?i)dru(hý|zí|hou|hym|hé|hej|há|hým|hejm|hém|hýma|hého|hejch|hejma|hých|hému|hýmu|hými|hýho)"
 {:dim :ordinal
  :ordinal-digit true
  :value 2}

 "third ordinal"
 #"(?i)třetí(m|ma|ch|mi|ho|mu)?"
 {:dim :ordinal
  :ordinal-digit true
  :value 3}

 "fourth ordinal"
 #"(?i)čtvrt(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :ordinal-digit true
  :value 4}

 "fifth ordinal"
 #"(?i)pát(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :ordinal-digit true
  :value 5}

 "sixth ordinal"
 #"(?i)šest(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :ordinal-digit true
  :value 6}

 "seventh ordinal"
 #"(?i)sedm(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :ordinal-digit true
  :value 7}

 "8th ordinal"
 #"(?i)osm(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :ordinal-digit true
  :value 8}

 "9th ordinal"
 #"(?i)devát(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :ordinal-digit true
  :value 9}

 "10th ordinal"
 #"(?i)desát(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :value 10}

 "11th ordinal"
 #"(?i)jedenáct(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :value 11}

 "12th ordinal"
 #"(?i)dvanáct(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :value 12}

 "13th ordinal"
 #"(?i)třináct(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :value 13}

 "14th ordinal"
 #"(?i)čtrnáct(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :value 14}

 "15th ordinal"
 #"(?i)patnáct(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :value 15}

 "16th ordinal"
 #"(?i)šestnáct(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :value 16}

 "17th ordinal"
 #"(?i)sedu?mnáct(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :value 17}

 "18th ordinal"
 #"(?i)osu?mnáct(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :value 18}

 "19th ordinal"
 #"(?i)devatenáct(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :value 19}

 ;; ordinal tens

 "20th ordinal"
 #"(?i)dvacát(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :ordinal-tens true
  :value 20}

 "30th ordinal"
 #"(?i)třicát(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :ordinal-tens true
  :value 30}

 "40th ordinal"
 #"(?i)čtyřicát(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :ordinal-tens true
  :value 40}

 "50th ordinal"
 #"(?i)padesát(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :ordinal-tens true
  :value 50}

 "60th ordinal"
 #"(?i)šedesát(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :ordinal-tens true
  :value 60}

 "70th ordinal"
 #"(?i)sedmdesát(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :ordinal-tens true
  :value 70}

 "80th ordinal"
 #"(?i)osu?mdesát(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :ordinal-tens true
  :value 80}

 "90th ordinal"
 #"(?i)devadesát(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :ordinal-tens true
  :value 90}

 ;; ordinal tens with digits eg šedesátý osmý

 ; "decimal ordinals with digits"
 ; [(:ordinal-tens true) #"(?i) " (:ordinal-digit true)]
 ; {:dim :ordinal
 ;  :value (+ (get %1 :value) (get %3 :value))}

 ;; higher ordinals

 "100th ordinal"
 #"(?i)st(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :value 100}

 "1000th ordinal"
 #"(?i)tisíct(ej|ym|ou|á|é|í|ý|ém|ejm|ým|ých|ého|ému|ýmu|ejma|ýma|ejch|ými|ýho)"
 {:dim :ordinal
  :value 100}

 ;; no space digit prefix eg třiatřicet

 "one and ordinal-tens no space"
 [#"(?i)jedena" (dim :ordinal (:ordinal-tens true))]
 {:dim :ordinal
  :value (+ 1 (get %2 :value))}

 "two and ordinal-tens no space"
 [#"(?i)dvaa"(dim :ordinal (:ordinal-tens true))]
 {:dim :ordinal
  :value (+ 2 (get %2 :value))}

 "three and ordinal-tens no space"
 [#"(?i)třia"(dim :ordinal (:ordinal-tens true))]
 {:dim :ordinal
  :value (+ 3 (get %2 :value))}

 "four and ordinal-tens no space"
 [#"(?i)čtyřia"(dim :ordinal (:ordinal-tens true))]
 {:dim :ordinal
  :value (+ 4 (get %2 :value))}

 "five and ordinal-tens no space"
 [#"(?i)pěta"(dim :ordinal (:ordinal-tens true))]
 {:dim :ordinal
  :value (+ 5 (get %2 :value))}

 "six and ordinal-tens no space"
 [#"(?i)šesta"(dim :ordinal (:ordinal-tens true))]
 {:dim :ordinal
  :value (+ 6 (get %2 :value))}

 "seven and ordinal-tens no space"
 [#"(?i)sedu?ma"(dim :ordinal (:ordinal-tens true))]
 {:dim :ordinal
  :value (+ 7 (get %2 :value))}

 "eight and ordinal-tens no space"
 [#"(?i)osu?ma"(dim :ordinal (:ordinal-tens true))]
 {:dim :ordinal
  :value (+ 8 (get %2 :value))}

 "nine and ordinal-tens no space"
 [#"(?i)devěta"(dim :ordinal (:ordinal-tens true))]
 {:dim :ordinal
  :value (+ 9 (get %2 :value))}

)
