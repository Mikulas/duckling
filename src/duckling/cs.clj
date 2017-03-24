(ns duckling.cs)

(defn dyn-re
  "Build a dynamic regex"
  [args]
  (let [
	  	infl {
	      :pondelni "(?:[íi]mu|[íi]ch|[íi]ma|[íi]ho|[íi]mi|[íi]m|[íi])"
	      :pondelek "(?:[íi]ma|[íi]ch|[íi]mi|[íi]m|[íi]|k[áa]ch|c[íi]ch|k[ůu]m|kama|kem|k[ůu]|kum|ka|ek|ku|ky)"
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
