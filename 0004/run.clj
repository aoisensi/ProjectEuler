(defn is-palicdromic? [x] (let [st (format "%d" x)] (= (seq st) (reverse st))))
(defn PE0004 [] (apply max (filter is-palicdromic? (for [n (reverse (range 100 1000)) m (reverse (range 100 1000))] (* n m)))))
(PE0004)