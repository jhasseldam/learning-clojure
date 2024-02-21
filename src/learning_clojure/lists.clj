(ns learning-clojure.lists)

; Lists are similar to vectors but used normal paranteses as representation
; Because everything is a list is clojure, to differenciate between a list literal and a
; list structure (in a lack of a better word), the list literal has a ' character in front

'(1 2 3 4 5) ; List literal

; get can't be used to get an element in a list, instead nth can be used

(nth '("hello" "there" "my" "precious") 3)
