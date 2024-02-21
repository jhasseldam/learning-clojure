(ns learning-clojure.truthiness)

; In Clojure a nil value and the false value are both false, and all other values are true
; This might seem unexpected, but true

(if false "it's true" "it's false")
(if nil "it's true" "it's false")

(if true "it's true" "it's false")
(if "a string" "it's true" "it's false")
(if 10 "it's true" "it's false")
(if '[1 2 3] "it's true" "it's false")
(if '(1 2 3) "it's true" "it's false")