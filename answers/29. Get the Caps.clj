(fn get-the-caps [arg](clojure.string/join (filter #(Character/isUpperCase %) arg)))
