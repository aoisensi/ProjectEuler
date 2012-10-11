(defn PE0030 [] (apply + (filter #(= % (apply + (for [i (str %)] (apply * (int-array 5 (- (int i) (int \0))))))) (range 2 1000000))))
(PE0030)