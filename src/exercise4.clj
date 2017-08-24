(ns exercise4)

(defn summary
  "Returns the sum of the sequence."
  [sequence]
  (reduce + 0 sequence))