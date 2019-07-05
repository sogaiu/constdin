(ns script
  (:gen-class))

(defn -main [& args]
  (println "started")
  (slurp *in*)
  (println "finished"))
