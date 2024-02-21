(ns learning-clojure.functions)

; Pretty much all clojure operations follow the same semantic structure:
; (operator operands)

; Some examples:

; Takes a number a increment it by one
(inc 4)

; Map takes two operands: the mapping function and the collection to apply the function to
(map inc '(1 2 3 4 5))

(map inc #{2 4 6 8})

; A function definition is made up of
; function name
; an optional docstring describing the function
; any number of argument in [] (called the arity) 
; the function body 

(defn add-numbers
  "2-arity function which adds its two arguments together"
  [x y]
  (+ x y))

; It's possible to do arity-overloading (function overloading) as well:
; (notice there is an extra pair of brackets around the argument and the function body for
; that arity to group them together)
(defn print-something
  ([message] 
  (printf message)) ; <-- 1 arity
  ([]
  (print-something "You gave me nothing so I will come up with something myself"))) ; <-- 0 arity

; It's also possible to have an abritary amount of arguments using the "rest" parameter &
; This gives the flexibility when calling the function 
(defn inc-on-or-all
  [& all]
  (map inc all))

(inc-on-or-all 8)
(inc-on-or-all 8 9 8 -4)
(inc-on-or-all 8 10 33 3 8 9 6)

; A weird implementation of the + function
(defn plus
  [& numbers]
  (reduce + numbers))

(plus 2 3 5)
(plus 3)

; Clojure supports destructuring which enables us to bind values inside collections to names
; the 1. value in the input list is bound to first and the 2. to second 
; the remaining items in the list is bound rest
; NOTICE the extra brackets around the argument collection to signify that this is a vector
; and inside the vector the deconstruction takes place
(defn add-first-two
  [[first second & rest]] 
  (conj rest (+ first second)))

(add-first-two '(2 5 7 10)) ; Returns (7 7 10)

; Deconstructing maps
; Here we are binding the values of the keys :bill and :bob to the values bill and bob
; If the key is not present in the map argument, then the value will be empty as expected
(defn deconstruct-map
  [{:keys [bill bob frankie]}]
    (str bill bob frankie))

(deconstruct-map {:bill "I'm bill" :bob " and I'm bob" :rose "rosemary"})

; Anonymous fucntions are supported by the fn keyword
; the syntax is as follows : (fn [parm] body) as in:
(map (fn [x] (+ x x)) '(1 1 2 3 4))

; or in a more compact way using the reader macro
; this does the same as the one above 
(map #(+ % %) '(1 1 2 3 4))

; the % gets assigned to the argument given the anonymous function
; if you need more than one argument, use number to % to assign their order
(#(str %1 " and my good friend " %2) "hank" "paul")

; and the rest using %&
(#(str %1 ", " %2 " and " %&) "hank" "paul" "tyson" "billy" "willy" "nilly")

