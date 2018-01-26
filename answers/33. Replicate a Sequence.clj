(fn replicate-seq [coll n]
        (mapcat #(repeat n %) coll))
