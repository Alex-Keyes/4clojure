(fn [f x] (reductions #(%2 %1) x (repeat f)))
