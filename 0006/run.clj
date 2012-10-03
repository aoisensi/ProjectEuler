(defn PE0006 [] (- (let [x (apply + (range 101))] (* x x)) (apply + (for [x (range 101)] (* x x)))))
(PE0006)