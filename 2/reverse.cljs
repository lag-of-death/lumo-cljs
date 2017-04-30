(ns reverse.core)

(defn reverse' [coll]
  (loop [a        coll
         reversed []]
    (if (empty? a)
        reversed
        (recur (pop a) (concat reversed [(last a)])))))

(println (reverse' [1 2 3 4]))