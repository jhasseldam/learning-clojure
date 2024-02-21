(ns learning-clojure.control-structures)

; Understanding if statements

(defn biggest
  [x y]
  (if (> x y) x y))

; A little more complex: this time the then- and else clauses call a function

(defn even
  [x]
  (if (even? x)
    (str x " is an even number") 
    (str x " is an odd number")))

; The then- and else clauses has to evaluate to a single expression. If we need them to do more
; do can be used instead

(defn also-even
  [x]
  (if (even? x)
    (do 
        (println "even")
        (str x " is an even number"))
    (do
        (println "odd")
        (str x " is an odd number"))))

; If you need an if with a do (but no else branch) then "when" is your friend
; In the case of an odd number, then function just return nill

(defn even-but-no-odd
  [x]
  (when (even? x)
      (println "even")
      (str x " is an even number")))


; Use cond when a control is needed which provides more than two decision paths
; use :else to provide a default execution path when no conditions are matched

(defn fizz-buzz
  [x]
  (cond
    (and (= (mod x 3) 0) (= (mod x 5) 0)) "fizz-buzz"
    (= (mod x 3) 0) "fizz"
    (= (mod x 5) 0) "buzz"
    :else x))
