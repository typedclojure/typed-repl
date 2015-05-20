(ns ^:core.typed typed-repl.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(fn []
  (inc 'a)
  (inc 'a))
