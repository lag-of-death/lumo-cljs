(ns meta.macros)

(defmacro first-macro [single-arg] (list '+ 2 1 single-arg))

(defmacro sum-list [list] `(+ ~@list))

(defmacro math [a operand b] (list operand a b))

(defmacro my-when
  [condition & body]
  (println body)
  `(if ~condition (do ~@body)))

(defmacro sum-all [first & rest]
  `(+ ~first ~@rest))

(defmacro reverse' [string]
  (println "reversing...")
  (list 'reverse string))

(defmacro reverse'' [string] `(reverse ~string))

(defmacro debug [expr]
  (do
    (println expr)
    `(let [result# ~expr]
      (println "Evaluating:" '~expr)
      (println "Result:" result#)
      result#)))


(defmacro get-seven []
  `(let [six# 6] (def one# 1) (+ six# one#)))