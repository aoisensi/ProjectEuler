(defn PE0028 [] (inc (apply + (for [i (range 1 501)] (let [j (inc (* i 2))] (- (* j j 4) (* i 12)))))))
(PE0028)