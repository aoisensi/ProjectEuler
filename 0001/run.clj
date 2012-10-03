(defn is-multiple? [x r] (= (rem x r) 0))
(defn is-3or5multiple [x] (if (or (is-multiple? x 3) (is-multiple? x 5)) x 0))
(defn PE0001 [] (apply + (for [x (range 1000)] (is-3or5multiple x))))
(PE0001)