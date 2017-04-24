(ns main.core
  (:require
    [main.router :refer [router]]
    [util.core :refer [print-host]]))

(defonce express (js/require "express"))

(defonce compression (js/require "compression"))

(defonce cookieParser (js/require "cookie-parser"))

(-> (express)
  (.use (cookieParser))
  (.use (compression))
  (.use (.static express "public"))
  (.use print-host)
  (.use router)
  (.listen 9000 #(println "Running...")))
