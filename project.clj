(defproject typed-repl "0.1.0-SNAPSHOT"
  :description "core.typed REPL demo"
  :url "http://typedclojure.org"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repl-options {:nrepl-middleware [clojure.core.typed.repl/wrap-clj-repl]}
  :dependencies [[org.clojure/core.typed "0.2.92"]])
