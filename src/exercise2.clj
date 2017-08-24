(ns exercise2)

(defn is-greater-than-five
  "Returns true if number is greater than five"
  [number]
  (> number 5))
(defn only-greater-than-five
  "Returns the sequence with elements only greater than five"
  [sequence]
  (filter is-greater-than-five sequence))
  