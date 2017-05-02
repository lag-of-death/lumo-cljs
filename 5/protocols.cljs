(ns protocols.core)

(defprotocol IAnimal
  (eat
    [this])
  (sleep
    [this]))

(defprotocol IDog
  (bark
    [this]))


(deftype Animal1 []
  IAnimal
  (eat [this] (println "Eating..."))
  (sleep [this] (println "Sleeping...")))

(deftype Animal2 []
  IAnimal
  (eat [this] (println "..."))
  (sleep [this] (println "...")))

(try
  (bark (Animal1.))
  (catch js/Error e (println "Not defined yet.")))

(extend-type Animal1
  IDog
  (bark [this] (println "Woof!")))

(eat (Animal1.))
(eat (Animal2.))

(bark (Animal1.))
