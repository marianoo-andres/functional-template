(ns exercise3)

(defn fibonacci
  "Returns the fibonacci of number."
  [number]
  (cond (== number 0) 0
	(== number 1) 1
  :else 
	(+ (fibonacci (- number 1)) (fibonacci (- number 2)))
  )
)