(ns learning-clojure.let)

; How to understand and use let expressions

; (let [binding of name to value] the scope of the function)
(let [x 10] (* x 10))

; it doesn't have to be a single value, it could also be a collection
(defn add-first-three
  [lst]
  (let [first-tree (take 3 lst)]
    (reduce + first-tree)))

(add-first-three '(1 2 3 4 5 6 7 8 9 10))
