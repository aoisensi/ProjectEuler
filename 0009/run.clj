(defn PE0009 [] (apply * (first (filter #(= (apply + %) 1000) (for [m (range 1 1000) n (range 1 m)] [(- (* m m) (* n n)) (* 2 n m) (+ (* m m) (* n n))])))))
(PE0009)