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
 #"(?i)(nu(l[áa]ch|lami|lama|l[áa]m|lou|la|le|lo|lu|ly|l)|nic|[žz][áa]dn([ýy]ho|[ýy]ch|[ýy]mi|ejch|[ýy]ma|ejma|[ýy]mu|[ée]mu|[ée]ho|[ýy]m|ejm|[ée]m|ym|[ýy]|[íi]|[ée]|[áa]|ou|ej))"
 {:dim :number :integer true :value 0 :grain 1}

 "one"
 #"(?i)(jedni[čc](k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky)|jed(na|en|noho|nomu|nom|n[íi]m|ny|n[ěe]ch|n[ěe]m|n[ěe]mi|ni|nu)|jedin[ýy])"
 {:dim :number :integer true :value 1 :grain 1}

 "two"
 #"(?i)(dvoj(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky)|dv(ouma|[ěe]ma|oum|ou|[ěe]|a))"
 {:dim :number :integer true :value 2 :grain 1}

 "three"
 #"(?i)(troj(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky)|t[řr](ema|emi|ech|em|[íi]|i))"
 {:dim :number :integer true :value 3 :grain 1}

 "four"
 #"(?i)([čc]ty[řr]k[áa]ch|[šs]tyrk[áa]ch|[čc]ty[řr]kama|[čc]ty[řr]k[áa]m|[čc]ty[řr]kami|[šs]tyrkami|[šs]tyrk[áa]m|[šs]tyrkama|[čc]ty[řr]kou|[šs]tyrkou|[čc]ty[řr]ka|[čc]ty[řr]ky|[čc]ty[řr]ce|[čc]ty[řr]ku|[čc]ty[řr]ko|[čc]ty[řr]ek|[šs]tyrce|[šs]tyrek|[šs]tyrko|[šs]tyrku|[šs]tyrky|[šs]tyrka|[čc]ty[řr]ech|[čc]ty[řr]mi|[čc]ty[řr]ma|[čc]ty[řr]em|[čc]tyrech|[čc]ty[řr]i|[čc]tyrem|[čc]tyrmi|[čc]tyrma|[šs]ty[řr]i|[čc]tyry|[čc]ty[řr]|[čc]tyr)"
 {:dim :number :integer true :value 4 :grain 1}

 "five"
 #"(?i)(p[ěe]t(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky)|p[ěe]ti?)"
 {:dim :number :integer true :value 5 :grain 1}

 "six"
 #"(?i)([šs]est(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky)|[šs]es(ti|t))"
 {:dim :number :integer true :value 6 :grain 1}

 "seven"
 #"(?i)(sedmi[čc](k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky)|sed(um|mi|m))"
 {:dim :number :integer true :value 7 :grain 1}

 "eight"
 #"(?i)(v?osmi[čc](k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky)|v?osu?(mama|mami|m[áa]ch|m[áa]m|mou|ma|em|mo|mu|my|m[ěe]|m))"
 {:dim :number :integer true :value 8 :grain 1}

 "nine"
 #"(?i)(dev[íi]t(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)|dev[ěe]t)"
 {:dim :number :integer true :value 9 :grain 1}

 "ten"
 #"(?i)(des[íi]t(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky)|des([íi]ti|eti|et))"
 {:dim :number :integer true :value 10 :grain 1}

 "eleven"
 #"(?i)jeden[áa]ct(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 11 :grain 1}

 "twelve"
 #"(?i)dvan[áa]ct(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 12 :grain 1}

 "thirteen"
 #"(?i)t[řr]in[áa]ct(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 13 :grain 1}

 "fourteen"
 #"(?i)[čc]trn[áa]ct(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 14 :grain 1}

 "fifteen"
 #"(?i)patn[áa]ct(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 15 :grain 1}

 "sixteen"
 #"(?i)[šs]estn[áa]ct(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 16 :grain 1}

 "seventeen"
 #"(?i)sedmn[áa]ct(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 17 :grain 1}

 "eighteen"
 #"(?i)osmn[áa]ct(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 18 :grain 1}

 "nineteen"
 #"(?i)devaten[áa]ct(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 19 :grain 1}

 ;; Numeric tens

 "twenty"
 #"(?i)(dvac[íi]t(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky)|dvac(et|eti|[íi]ti))"
 {:dim :number :integer true :value 20 :grain 1 :numeric-tens true}

 "thirty"
 #"(?i)(t[řr]ic[íi]t(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky)|t[řr]ic(et|eti|[íi]ti))"
 {:dim :number :integer true :value 30 :grain 1 :numeric-tens true}

 "fourty"
 #"(?i)([čc]ty[řr]ic[íi]t(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky)|[čc]ty(rycet|ryceti|[řr]icet|[řr]iceti|[řr]ic[íi]ti))"
 {:dim :number :integer true :value 40 :grain 1 :numeric-tens true}

 "fifty"
 #"(?i)pades[áa]t(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 50 :grain 1 :numeric-tens true}

 "sixty"
 #"(?i)[šs]edes[áa]t(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 60 :grain 1 :numeric-tens true}

 "seventy"
 #"(?i)sedu?mdes[áa]t(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 70 :grain 1 :numeric-tens true}

 "eighty"
 #"(?i)osu?mdes[áa]t(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 80 :grain 1 :numeric-tens true}

 "ninety"
 #"(?i)devades[áa]t(k[áa]ch|k[áa]m|kama|kami|kou|ka|ce|ek|ko|ku|ky|i)?"
 {:dim :number :integer true :value 90 :grain 1 :numeric-tens true}

 ;; Multipliers

 "hundred"
 #"(?i)s(tech|t[ůu]m|t[ěe]|tem|et|to|ty|ta|tu)"
 {:dim :number :integer true :value 100 :grain 2}

 ;; Thousands

 "thousand"
 #"(?i)tis[íi](c[íi]ch|cema|c[ůu]m|cem|cum|c[ůu]|ce|ci|c)"
 {:dim :number :integer true :value 1000 :grain 3}

 "million"
 #"(?i)mili([óo]n[ůu]m|[óo]nech|[óo]nama|onama|[óo]num|[óo]nem|[óo]n[ůu]|onech|on[ůu]m|[óo]ny|onem|on[ůu]|[óo]nu|onum|[óo]ne|onu|one|[óo]n|ony|on)"
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

 "one and ordinal-tens no space"
 [#"(?iux)
  # single digit prefix
  (jede?n|dva|tři|čty(ři|ry)|pět|šest|sedu?m|osu?m|devět)
  # intersection
  a
  # tens
  (?:
    # common inflection 1
    (?:
      (dvac|třic|čty(ři|ry)c)
      (?:ítkách|ítkám|ítkama|ítkami|ítkou|ítka|ítce|ítek|ítko|ítku|ítky|íti|eti|et)
    )
    # common inflection 2
    |(?:
      (pades|šedes|sedu?mdes|osu?mdes|devades)
      (?:átkách|átkám|átkama|átkami|átkou|átka|átce|átek|átko|átku|átky|áti|át)
    )
  )
  " (dim :number (:numeric-tens true))]
  {:dim :number :value (+
    ; process single digit
    (get {"je" 1 "dv" 2 "tř" 3 "čt" 4 "pě" 5 "še" 6 "se" 7 "os" 8 "de" 9}
        (-> (subs (nth (:groups %1) 1) 0 2) clojure.string/lower-case))
    (
      (get {"dv" 20 "tř" 30 "čt" 40 "pa" 50 "še" 60 "se" 70 "os" 80 "de" 90}
      (-> (subs
        (or (nth (:groups %1) 2) (nth (:groups %1) 3))
       0 2) clojure.string/lower-case))
      )
  )}

 ; "three and  ordinal-tens no space"
 ; [#"(?i)t[řr]ia" (dim :number (:numeric-tens true))]
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
 [(dim :number #(not (:number-prefixed %))) #"(?i)cel[áa]" (dim :number #(not (:number-suffixed %)))]
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
 [#"(?i)-|m[i[íi]]nus\s?|z[áa]porn[[ýy][ée][áa]o]\s?" (dim :number #(not (:number-prefixed %)))]
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
 #"(?i)(1-?|prvn)([íi]ma|[íi]ch|[íi]mi|[íi]ho|[íi]mu|[íi]m|[íi])"
 {:dim :ordinal
  :ordinal-digit true
  :value 1
  :date-inflection (boolean (re-find #"([íi]ho|[íi]m)$" (-> %1 :groups second .toLowerCase)))}

 "second ordinal"
 #"(?i)(2-?|dru)(h[ýy]ho|h[ýy]ma|h[ýy]mi|h[ýy]mu|h[ée]mu|h[ýy]ch|hejma|hejch|h[ée]ho|h[ée]m|hejm|h[ýy]m|z[íi]|h[áa]|hej|h[ée]|hym|hou|h[ýy])"
 {:dim :ordinal
  :ordinal-digit true
  :value 2
  :date-inflection (boolean (re-find #"([ée]mu|[ée]ho|[ýy]mu|[ýy]ho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "third ordinal"
 #"(?i)(3-?|t[řr]e)(t[íi]ma|t[íi]ch|t[íi]mi|t[íi]ho|t[íi]mu|t[íi]m|t[íi])"
 {:dim :ordinal
  :ordinal-digit true
  :value 3
  :date-inflection (boolean (re-find #"([íi]ho|[íi]m)$" (-> %1 :groups second .toLowerCase)))}

 "fourth ordinal"
 #"(?i)(4-?|[čc]tvr)(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :ordinal-digit true
  :value 4
  :date-inflection (boolean (re-find #"([ée]mu|[ée]ho|[ýy]mu|[ýy]ho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "fifth ordinal"
 #"(?i)(5-?|p[áa])(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :ordinal-digit true
  :value 5
  :date-inflection (boolean (re-find #"([ée]mu|[ée]ho|[ýy]mu|[ýy]ho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "sixth ordinal"
 #"(?i)(6-?|[šs]es)(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :ordinal-digit true
  :value 6
  :date-inflection (boolean (re-find #"([ée]mu|[ée]ho|[ýy]mu|[ýy]ho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "seventh ordinal"
 #"(?i)(7-?|sedu?)(m[ýy]ho|m[ýy]ch|m[ýy]mi|mejch|m[ýy]ma|mejma|m[ýy]mu|m[ée]mu|m[ée]ho|m[ýy]m|mejm|m[ée]m|mym|m[ýy]|m[íi]|m[ée]|m[áa]|mou|mej)"
 {:dim :ordinal
  :ordinal-digit true
  :value 7
  :date-inflection (boolean (re-find #"([ée]mu|[ée]ho|[ýy]mu|[ýy]ho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "8th ordinal"
 #"(?i)(8-?|osu?)(m[ýy]ho|m[ýy]ch|m[ýy]mi|mejch|m[ýy]ma|mejma|m[ýy]mu|m[ée]mu|m[ée]ho|m[ýy]m|mejm|m[ée]m|mym|m[ýy]|m[íi]|m[ée]|m[áa]|mou|mej)"
 {:dim :ordinal
  :ordinal-digit true
  :value 8
  :date-inflection (boolean (re-find #"([ée]mu|[ée]ho|[ýy]mu|[ýy]ho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "9th ordinal"
 #"(?i)(9-?|dev[áa])(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :ordinal-digit true
  :value 9
  :date-inflection (boolean (re-find #"([ée]mu|[ée]ho|[ýy]mu|[ýy]ho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "10th ordinal"
 #"(?i)(10-?|des[áa])(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :value 10
  :date-inflection (boolean (re-find #"([ée]mu|[ée]ho|[ýy]mu|[ýy]ho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "11th ordinal"
 #"(?i)(11-?|jeden[áa]c)(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :value 11
  :date-inflection (boolean (re-find #"([ée]mu|[ée]ho|[ýy]mu|[ýy]ho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "12th ordinal"
 #"(?i)(12-?|dvan[áa]c)(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :value 12
  :date-inflection (boolean (re-find #"([ée]mu|[ée]ho|[ýy]mu|[ýy]ho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "13th ordinal"
 #"(?i)(13-?|t[řr]in[áa]c)(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :value 13
  :date-inflection (boolean (re-find #"([ée]mu|[ée]ho|[ýy]mu|[ýy]ho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "14th ordinal"
 #"(?i)(14-?|[čc]trn[áa]c)(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :value 14
  :date-inflection (boolean (re-find #"([ée]mu|[ée]ho|[ýy]mu|[ýy]ho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "15th ordinal"
 #"(?i)(15-?|patn[áa]c)(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :value 15
  :date-inflection (boolean (re-find #"([ée]mu|[ée]ho|[ýy]mu|[ýy]ho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "16th ordinal"
 #"(?i)(16-?|[šs]estn[áa]c)(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :value 16
  :date-inflection (boolean (re-find #"([ée]mu|[ée]ho|[ýy]mu|[ýy]ho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "17th ordinal"
 #"(?i)(17-?|sedu?mn[áa]c)(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :value 17
  :date-inflection (boolean (re-find #"([ée]mu|[ée]ho|[ýy]mu|[ýy]ho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "18th ordinal"
 #"(?i)(18-?|osu?mn[áa]c)(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :value 18
  :date-inflection (boolean (re-find #"([ée]mu|[ée]ho|[ýy]mu|[ýy]ho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "19th ordinal"
 #"(?i)(19-?|devaten[áa]c)(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :value 19
  :date-inflection (boolean (re-find #"([ée]mu|[ée]ho|[ýy]mu|[ýy]ho|ej)$" (-> %1 :groups second .toLowerCase)))}

 ;; ordinal tens

 "20th ordinal"
 #"(?i)(20-?|dvac[áa])(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :ordinal-tens true
  :value 20
  :date-inflection (boolean (re-find #"([ée]mu|[ée]ho|[ýy]mu|[ýy]ho|ej)$" (-> %1 :groups second .toLowerCase)))}

 "30th ordinal"
 #"(?i)(30-?|t[řr]ic[áa])(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :ordinal-tens true
  :value 30}

 "40th ordinal"
 #"(?i)(40-?|[čc]ty[řr]ic[áa])(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :ordinal-tens true
  :value 40}

 "50th ordinal"
 #"(?i)(50-?|pades[áa])(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :ordinal-tens true
  :value 50}

 "60th ordinal"
 #"(?i)(60-?|[šs]edes[áa])(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :ordinal-tens true
  :value 60}

 "70th ordinal"
 #"(?i)(70-?|sedu?mdes[áa])(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :ordinal-tens true
  :value 70}

 "80th ordinal"
 #"(?i)(80-?|osu?mdes[áa])(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :ordinal-tens true
  :value 80}

 "90th ordinal"
 #"(?i)(90-?|devades[áa])(t[ýy]ho|t[ýy]ch|t[ýy]mi|tejch|t[ýy]ma|tejma|t[ýy]mu|t[ée]mu|t[ée]ho|t[ýy]m|tejm|t[ée]m|tym|t[ýy]|t[íi]|t[ée]|t[áa]|tou|tej)"
 {:dim :ordinal
  :ordinal-tens true
  :value 90}

 ;; ordinal tens with digits eg [šs]edes[áa]t[ýy] osm[ýy]

 "decimal ordinals with digits"
 [(dim :ordinal #(:ordinal-tens %)) (dim :ordinal #(:ordinal-digit %))]
 {:dim :ordinal
  :value (+ (get %1 :value) (get %2 :value))}

 ;; higher ordinals

 "100th ordinal"
 #"(?i)st([ýy]ho|[ýy]ch|[ýy]mi|ejch|[ýy]ma|ejma|[ýy]mu|[ée]mu|[ée]ho|[ýy]m|ejm|[ée]m|ym|[ýy]|[íi]|[ée]|[áa]|ou|ej)"
 {:dim :ordinal
  :value 100}

 "1000th ordinal"
 #"(?i)tis[íi]c[áa]?t([ýy]ho|[ýy]ch|[ýy]mi|ejch|[ýy]ma|ejma|[ýy]mu|[ée]mu|[ée]ho|[ýy]m|ejm|[ée]m|ym|[ýy]|[íi]|[ée]|[áa]|ou|ej)"
 {:dim :ordinal
  :value 1000}

 ;; Numerical ordinals
 "numerical ordinal"
 #"(?i)(\d+)\."
 {:dim :ordinal
  :value (-> (:groups %1)
             first
             Integer/parseInt)}

 ;  "numerical ordinal"
 ; #"(?i)(\d+)"
 ; {:dim :ordinal
 ;  :value (-> (:groups %1)
 ;             first
 ;             Integer/parseInt)
 ;  :latent true}

 ;; no space digit prefix eg t[řr]iat[řr]icet

 ; "one and ordinal-tens no space"
 ; [#"(?i)jedena" (dim :ordinal (:ordinal-tens true))]
 ; {:dim :ordinal
 ;  :value (+ 1 (get %2 :value))}

 ; "two and ordinal-tens no space"
 ; [#"(?i)dvaa"(dim :ordinal (:ordinal-tens true))]
 ; {:dim :ordinal
 ;  :value (+ 2 (get %2 :value))}

 ; "three and ordinal-tens no space"
 ; [#"(?i)t[řr]ia"(dim :ordinal (:ordinal-tens true))]
 ; {:dim :ordinal
 ;  :value (+ 3 (get %2 :value))}

 ; "four and ordinal-tens no space"
 ; [#"(?i)[čc]ty[řr]ia"(dim :ordinal (:ordinal-tens true))]
 ; {:dim :ordinal
 ;  :value (+ 4 (get %2 :value))}

 ; "five and ordinal-tens no space"
 ; [#"(?i)p[ěe]ta"(dim :ordinal (:ordinal-tens true))]
 ; {:dim :ordinal
 ;  :value (+ 5 (get %2 :value))}

 ; "six and ordinal-tens no space"
 ; [#"(?i)[šs]esta"(dim :ordinal (:ordinal-tens true))]
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
 ; [#"(?i)dev[ěe]ta"(dim :ordinal (:ordinal-tens true))]
 ; {:dim :ordinal
 ;  :value (+ 9 (get %2 :value))}

)
