(defn triangle [x] (* x (inc x) 0.5))
(defn istriangle? [x] (= x (last (take-while #(>= x %) (map triangle (range))))))
(defn char2int [x] (inc (- (int x) (int \A))))
(defn string2int [x] (apply + (map char2int x)))
(defn PE0042 [] (count (filter istriangle? (map string2int words))))
(PE0042)