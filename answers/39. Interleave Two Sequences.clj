(fn lazy-interleave [v1 v2]
              (when (and (seq v1) (seq v2))
                (lazy-cat [(first v1) (first v2)]
                          (lazy-interleave (rest v1) (rest v2)))))
