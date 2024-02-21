(ns learning-clojure.lazy)

; Clojure relies on lazy loading

; The limits of Clojures laziness can be observed in the following experiment

(defn slow-double
  [n]
  (Thread/sleep 1000)
  (* n 2))

(def random-list
  (map slow-double (range 1 1000)))
; since it takes a second to double a number here, and if Clojure was eagerly 
; evaluated it would take 1000 seconds to map the 1000 numbers to their respective
; double, before we could get the first number in the collection
(time (first random-list)) ; 1000 seconds or 1 second? Neither! About 30 secs actually

; If we run the above we can see that it takes about 30 seconds to get the first element
; Why 30? This is because Clojure evualtes the first approximately 30 elements in the collection
; instead of just one (guess it isnt THAT lazy after all) due to some built in optimization
; strategy 