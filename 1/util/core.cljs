(ns util.core)

(defonce print-host
  (fn [req res next]
    (println req.headers.host)
    (next)))