(defproject re-native/vector-icons "0.0.1-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0-alpha10"]
                 [org.clojure/clojurescript "1.9.473"]
                 [reagent "0.6.0" :exclusions [cljsjs/react cljsjs/react-dom cljsjs/react-dom-server]]
                 [re-frame "0.9.1"]]
  :plugins [[lein-cljsbuild "1.1.4"]])
