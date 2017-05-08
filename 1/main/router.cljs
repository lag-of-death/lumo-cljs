(ns main.router)

(defonce express (js/require "express"))

(defonce basic-auth (js/require "express-basic-auth"))

(defonce router
  (-> (.Router express)
      (.get "/show-cookies"
            (fn [req res] (.send res req.cookies)))
      (.get "/some"
            (basic-auth (clj->js {:users {:admin :admin} :challenge true}))
            (fn [req res] (.send res "OK")))))