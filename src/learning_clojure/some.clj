(ns learning-clojure.some)

; some checks for the existance of a value in a collection 

(some #(= 0 (mod % 15)) [1 3 5 7 9 11 13 17 19 23 30]) ; returns true cause 30 mod 15 = 0

; notice that if you wanted instead to return the first element which 
; satisfies the condition you can use a little trick:

(some #(and (= 0 (mod % 15)) %) [1 3 5 7 9 11 13 17 19 23 30]) ; returns 30 

; this works cause and returns the last truthy value in an expression 
; where all conditions are truthy
; it becomes a bit more clear perhaps in the following examples

(and 8 9) ; 9
(and "hello" "world") ; "world"
(and "oi" 43 :unga-bunka) ; :unga-bunka
(and false 4 true "hello" "please" "be" "true") ; false

; a small gotcha on the above:
(some #(and (= 0 (mod % 14)) %) [1 3 5 7 9 11 13 17 19 23 30]) ; returns 30 
; if nothing satisfies the predicated like above the first falsey value 
; (not neccesarily false is returned) in the case above the mod check on the 
; collection returns nil and that is what "and" returns

(and nil false true :win-win "bet on black") ; nil
