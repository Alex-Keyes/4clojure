(fn [coll n]
  (mapcat #(take (dec n) %) (partition-all n coll)))
