(ns meta.core
  (:require [meta.macros :as my-macros])
  (:require-macros [meta.macros :refer
                    [get-seven
                     sum-list
                     debug
                     reverse'
                     reverse''
                     first-macro
                     math
                     my-when
                     sum-all]]))


(println (= 3 (math 2 + 1)))
(println (math 2 - 1))
(println (math 2 * 1))
(println (math 20 / 5))

(println (first-macro 10))

(my-when 1 (println "Yes") (println "Yeah"))

(println (sum-all 1 2 3))

(debug (+ 1 2))

(println (get-seven))

(println (reverse' "abc"))
(println (reverse'' "abc"))

(println
  (=
    (sum-list (1 2 3))
    (sum-list [1 2 3])))