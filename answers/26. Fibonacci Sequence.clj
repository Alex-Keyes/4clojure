#(take % (map last(iterate (fn [[x y]] [y (+ x y)]) [ 0 1])))
