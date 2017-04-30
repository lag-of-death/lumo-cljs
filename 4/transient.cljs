(ns transient.core)

(def transient-map (transient {}))

(def transient-vec (transient []))

(assoc! transient-map :a 1)

(conj! transient-vec 1 2 3)

(println
  (persistent! transient-map)
  (persistent! transient-vec))

(try
  (conj! transient-vec 4)
  (catch js/Error e (println e)))

(def x (try
  (assoc! transient-map :b 2)
  (catch js/Error e (println e) :err)))

(println x)