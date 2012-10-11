(defn pow [x y] (apply * (int-array y x)))
(defn PE0029 [] (count (set (for [a (range 2 101) b (range 2 101)] (pow a b)))))
(PE0029)