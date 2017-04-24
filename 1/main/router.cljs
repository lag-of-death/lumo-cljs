(ns main.router)

(defonce express (js/require "express"))

(defonce router
  (-> (.Router express)
      (.get "/show-cookies" (fn [req res] (.send res req.cookies)))
      (.get "/some" (fn [req res] (.send res "OK")))))