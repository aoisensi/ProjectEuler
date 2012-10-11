(defn sieve [nums] (filter #(not= 0 (rem % (first nums))) (rest nums)))
(defn primes [] (map first (iterate sieve (iterate inc 2))))