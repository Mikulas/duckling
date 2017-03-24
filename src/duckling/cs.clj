(ns duckling.cs)

(defn dyn-re
  "Build a dynamic regex"
  [args]
  (let [
	  	infl {
	      :pondelni "(?:[íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|[íi])"
	      :pondeli "(?:[íi]ma|[íi]ch|[íi]mi|[íi]m|[íi]|k[áa]ch|c[íi]ch|k[ůu]m|kama|kem|k[ůu]|kum|ka|ek|ku|ky)"
	      :utery "(?:[ýy]ma|[ýy]ch|[ýy]m|[ýy]|k[áa]ch|c[íi]ch|k[ůu]m|kama|kem|k[ůu]|kum|ka|ek|ku|ky)"
	      :streda "(?:ed[áa]ch|edami|edama|ed[áa]m|ed[ěe]|edou|eda|edo|edu|edy|ed)"
	      :ctvrtek "(?:k[áa]ch|c[íi]ch|k[ůu]m|kama|kem|k[ůu]|kum|ka|ek|ku|ky)"
	      :sobota "(?:ot[áa]ch|otami|otama|ot[áa]m|ot[ěe]|otou|ota|oto|otu|oty|ot)"
	      :nedele "(?:l[íi]ch|lema|lemi|l[íi]m|l[íi]|le|li|l)"
	    }
	    flags "(?iu)"
	    pattern (str
    		flags
	    	(clojure.string/join
				(map #(get infl % %) args)
			)
		)
    ]
    ;(clojure.pprint/pprint pattern)
    (re-pattern pattern)
))
