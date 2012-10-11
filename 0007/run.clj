(defn is-prime? [x] (not-any? zero? (for [i (range 2 (inc (/ x 2)))] (rem x i))))
(defn PE0007 [] (nth (filter is-prime? (drop 2 (range))) 10000))
(PE0007)