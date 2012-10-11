(defn factorial [x] (apply * (range 1 (inc x))))
(defn PE0020 [] (apply + (for [i (str (factorial 100))] (- (int i) (int \0)))))
(PE0020)