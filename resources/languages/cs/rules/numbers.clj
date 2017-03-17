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
 #"(?i)(jednič(kách|kám|kama|kami|kou|ka|ce|ek|ko|ku|ky)|jed(na|en|noho|nomu|nom|ním|ny|něch|něm|němi|ni|nu)|jediný)"
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

 ;; Compound numbers: single digit prefix

 ; "one and ordinal-tens no space"
 ; [#"(?i)jedena" (dim :number (:numeric-tens true))]
 ; {:dim :number :value (+ 1 (get %2 :value))}

 ; "three and  ordinal-tens no space"
 ; [#"(?i)třia" (dim :number (:numeric-tens true))]
 ; {:dim :number :value (+ 3 (get %2 :value))}

 ;;
 ;; Decimals
 ;;

 "decimal number"
 #"(\d*[.,]\d+)"
 {:dim :number
  :value (-> (:groups %1)
             first
             (clojure.string/replace #"," ".")
             Double/parseDouble)}

 "number dot number"
 [(dim :number #(not (:number-prefixed %))) #"(?i)celá" (dim :number #(not (:number-suffixed %)))]
 {:dim :number
  :value (+
    (double (/
      (:value %3)
      (Math/pow 10 (+ 1 (Math/floor (Math/log10 (:value %3)))))
    ))
    (:value %1)
  )}

 ; "decimal with thousands separator"
 ; #"(\d+( \d\d\d)+[,.]\d+)"
 ; {:dim :number
 ;  :value (-> (:groups %1)
 ;             first
 ;             (clojure.string/replace #"," ".") ;; convert decimal comma to decimal point
 ;             (clojure.string/replace #" " "") ;; remove thousand separators
 ;             Double/parseDouble)}

 ;; negative number
 "numbers prefix with -, negative or minus"
 [#"(?i)-|m[ií]nus\s?|záporn[ýéáo]\s?" (dim :number #(not (:number-prefixed %)))]
 (let [multiplier -1
       value      (* (:value %2) multiplier)
       int?       (zero? (mod value 1)) ; often true, but we could have 1.1111K
       value      (if int? (long value) value)] ; cleaner if we have the right type
   (assoc %2 :value value
          :integer int?
          :number-prefixed true)) ; prevent "- -3km" to be 3 billions


 ;; suffixes

                                        ; note that we check for a space-like char after the M, K or G
                                        ; to avoid matching 3 Mandarins
 "numbers suffixes (K, M, G)"
 [(dim :number #(not (:number-suffixed %))) #"(?i)([kmg])(?=[\W\$€]|$)"]
 (let [multiplier (get {"k" 1000 "m" 1000000 "g" 1000000000}
                       (-> %2 :groups first .toLowerCase))
       value      (* (:value %1) multiplier)
       int?       (zero? (mod value 1)) ; often true, but we could have 1.1111K
       value      (if int? (long value) value)] ; cleaner if we have the right type
   (assoc %1 :value value
          :integer int?
          :number-suffixed true)) ; prevent "3km" to be 3 billions

 ;;
 ;; Ordinal numbers

 "first ordinal"
 #"(?i)(1-?|prvn)(íma|ích|ími|ího|ímu|ím|í)"
 {:dim :ordinal
  :ordinal-digit true
  :value 1
  :date-inflection (boolean (re-find #"(ího|ím)$" (-> %1 :groups second .toLowerCase)))}

 "second ordinal"
 #"(?i)(2-?|dru)(hýho|hýma|hými|hýmu|hému|hých|hejma|hejch|hého|hém|hejm|hým|zí|há|hej|hé|hym|hou|hý)"
 {:dim :ordinal
  :ordinal-digit true
  :value 2
  :date-inflection (boolean (re-find #"(ému|ého|ýmu|ýho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "third ordinal"
 #"(?i)(3-?|tře)(tíma|tích|tími|tího|tímu|tím|tí)"
 {:dim :ordinal
  :ordinal-digit true
  :value 3
  :date-inflection (boolean (re-find #"(ího|ím)$" (-> %1 :groups second .toLowerCase)))}

 "fourth ordinal"
 #"(?i)(4-?|čtvr)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :ordinal-digit true
  :value 4
  :date-inflection (boolean (re-find #"(ému|ého|ýmu|ýho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "fifth ordinal"
 #"(?i)(5-?|pá)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :ordinal-digit true
  :value 5
  :date-inflection (boolean (re-find #"(ému|ého|ýmu|ýho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "sixth ordinal"
 #"(?i)(6-?|šes)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :ordinal-digit true
  :value 6
  :date-inflection (boolean (re-find #"(ému|ého|ýmu|ýho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "seventh ordinal"
 #"(?i)(7-?|sedu?)(mýho|mých|mými|mejch|mýma|mejma|mýmu|mému|mého|mým|mejm|mém|mym|mý|mí|mé|má|mou|mej)"
 {:dim :ordinal
  :ordinal-digit true
  :value 7
  :date-inflection (boolean (re-find #"(ému|ého|ýmu|ýho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "8th ordinal"
 #"(?i)(8-?|osu?)(mýho|mých|mými|mejch|mýma|mejma|mýmu|mému|mého|mým|mejm|mém|mym|mý|mí|mé|má|mou|mej)"
 {:dim :ordinal
  :ordinal-digit true
  :value 8
  :date-inflection (boolean (re-find #"(ému|ého|ýmu|ýho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "9th ordinal"
 #"(?i)(9-?|devá)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :ordinal-digit true
  :value 9
  :date-inflection (boolean (re-find #"(ému|ého|ýmu|ýho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "10th ordinal"
 #"(?i)(10-?|desá)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :value 10
  :date-inflection (boolean (re-find #"(ému|ého|ýmu|ýho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "11th ordinal"
 #"(?i)(11-?|jedenác)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :value 11
  :date-inflection (boolean (re-find #"(ému|ého|ýmu|ýho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "12th ordinal"
 #"(?i)(12-?|dvanác)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :value 12
  :date-inflection (boolean (re-find #"(ému|ého|ýmu|ýho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "13th ordinal"
 #"(?i)(13-?|třinác)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :value 13
  :date-inflection (boolean (re-find #"(ému|ého|ýmu|ýho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "14th ordinal"
 #"(?i)(14-?|čtrnác)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :value 14
  :date-inflection (boolean (re-find #"(ému|ého|ýmu|ýho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "15th ordinal"
 #"(?i)(15-?|patnác)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :value 15
  :date-inflection (boolean (re-find #"(ému|ého|ýmu|ýho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "16th ordinal"
 #"(?i)(16-?|šestnác)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :value 16
  :date-inflection (boolean (re-find #"(ému|ého|ýmu|ýho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "17th ordinal"
 #"(?i)(17-?|sedu?mnác)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :value 17
  :date-inflection (boolean (re-find #"(ému|ého|ýmu|ýho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "18th ordinal"
 #"(?i)(18-?|osu?mnác)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :value 18
  :date-inflection (boolean (re-find #"(ému|ého|ýmu|ýho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "19th ordinal"
 #"(?i)(19-?|devatenác)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :value 19
  :date-inflection (boolean (re-find #"(ému|ého|ýmu|ýho|ej)$" (-> %1 :groups second .toLowerCase)))}

 ;; ordinal tens

 "20th ordinal"
 #"(?i)(20-?|dvacá)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :ordinal-tens true
  :value 20
  :date-inflection (boolean (re-find #"(ému|ého|ýmu|ýho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "30th ordinal"
 #"(?i)(30-?|třicá)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :ordinal-tens true
  :value 30}

 "40th ordinal"
 #"(?i)(40-?|čtyřicá)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :ordinal-tens true
  :value 40}

 "50th ordinal"
 #"(?i)(50-?|padesá)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :ordinal-tens true
  :value 50}

 "60th ordinal"
 #"(?i)(60-?|šedesá)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :ordinal-tens true
  :value 60}

 "70th ordinal"
 #"(?i)(70-?|sedu?mdesá)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :ordinal-tens true
  :value 70}

 "80th ordinal"
 #"(?i)(80-?|osu?mdesá)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :ordinal-tens true
  :value 80}

 "90th ordinal"
 #"(?i)(90-?|devadesá)(týho|tých|tými|tejch|týma|tejma|týmu|tému|tého|tým|tejm|tém|tym|tý|tí|té|tá|tou|tej)"
 {:dim :ordinal
  :ordinal-tens true
  :value 90}

 ;; ordinal tens with digits eg šedesátý osmý

 "decimal ordinals with digits"
 [(dim :ordinal #(:ordinal-tens %)) (dim :ordinal #(:ordinal-digit %))]
 {:dim :ordinal
  :value (+ (get %1 :value) (get %2 :value))}

 ;; higher ordinals

 "100th ordinal"
 #"(?i)st(ýho|ých|ými|ejch|ýma|ejma|ýmu|ému|ého|ým|ejm|ém|ym|ý|í|é|á|ou|ej)"
 {:dim :ordinal
  :value 100}

 "1000th ordinal"
 #"(?i)tisícá?t(ýho|ých|ými|ejch|ýma|ejma|ýmu|ému|ého|ým|ejm|ém|ym|ý|í|é|á|ou|ej)"
 {:dim :ordinal
  :value 1000}

 ;; Numerical ordinals
 "numerical ordinal"
 #"(?i)(\d+)\."
 {:dim :ordinal
  :value (-> (:groups %1)
             first
             Integer/parseInt)}

 ;; no space digit prefix eg třiatřicet

 ; "one and ordinal-tens no space"
 ; [#"(?i)jedena" (dim :ordinal (:ordinal-tens true))]
 ; {:dim :ordinal
 ;  :value (+ 1 (get %2 :value))}

 ; "two and ordinal-tens no space"
 ; [#"(?i)dvaa"(dim :ordinal (:ordinal-tens true))]
 ; {:dim :ordinal
 ;  :value (+ 2 (get %2 :value))}

 ; "three and ordinal-tens no space"
 ; [#"(?i)třia"(dim :ordinal (:ordinal-tens true))]
 ; {:dim :ordinal
 ;  :value (+ 3 (get %2 :value))}

 ; "four and ordinal-tens no space"
 ; [#"(?i)čtyřia"(dim :ordinal (:ordinal-tens true))]
 ; {:dim :ordinal
 ;  :value (+ 4 (get %2 :value))}

 ; "five and ordinal-tens no space"
 ; [#"(?i)pěta"(dim :ordinal (:ordinal-tens true))]
 ; {:dim :ordinal
 ;  :value (+ 5 (get %2 :value))}

 ; "six and ordinal-tens no space"
 ; [#"(?i)šesta"(dim :ordinal (:ordinal-tens true))]
 ; {:dim :ordinal
 ;  :value (+ 6 (get %2 :value))}

 ; "seven and ordinal-tens no space"
 ; [#"(?i)sedu?ma"(dim :ordinal (:ordinal-tens true))]
 ; {:dim :ordinal
 ;  :value (+ 7 (get %2 :value))}

 ; "eight and ordinal-tens no space"
 ; [#"(?i)osu?ma"(dim :ordinal (:ordinal-tens true))]
 ; {:dim :ordinal
 ;  :value (+ 8 (get %2 :value))}

 ; "nine and ordinal-tens no space"
 ; [#"(?i)devěta"(dim :ordinal (:ordinal-tens true))]
 ; {:dim :ordinal
 ;  :value (+ 9 (get %2 :value))}

)
