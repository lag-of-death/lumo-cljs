; just run this like this: lumo factorial.cljs 10

(ns factorial.core)

(defn factorial [x]
  (loop [a       x
         product 1]
    (if (= a 1)
        product
        (recur (- a 1) (* product a)))))

(-> js.process
  (.-argv)
  (last)
  (factorial)
  (str " is your factorial.")
  (println))