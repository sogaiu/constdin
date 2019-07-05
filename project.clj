(defproject constdin "0.0.1"
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :profiles {:uberjar {:main script
                       :aot :all}}
  :aliases {"constdin" ["run" "-m" "script"]})
