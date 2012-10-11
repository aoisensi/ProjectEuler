(defn pow [a b] (if (zero? b) 1 (apply * (repeat b a))))
(defn PE0016 [] (apply + (for [i (str (pow 2 1000))] (- (int i) (int \0)))))
(PE0016)