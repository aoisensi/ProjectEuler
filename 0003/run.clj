(defn PMax [x] (/ x (first (filter (fn [y] (= (mod x y) 0)) (range 2 (/ x 2))))))
(PMax (PMax (PMax (PMax 600851475143))))