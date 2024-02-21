(ns learning-clojure.vectors)

; Vectors are similar to arrays and starts listing elements from position 0

[3 4 4 2 2 2 2 1 8 6 3 8]

; A vector with a map inside

["hi" 43 :prick {3 "three" 1 "one"}]

; Vectors can also be generated using the vector keyword and the elements as arguments

(vector "hello" 4 :elton-john [3 4 4])

; Make a new vecotor by combining a vector with an element

(conj [1 2 3 4] 5)

; Get the 3 index element of a vector

(get [1 2 3 4 5 6] 3)