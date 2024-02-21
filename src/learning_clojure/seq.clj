(ns learning-clojure.seq)

; Whenever an opeation is called on an argument which treats that 
; argument as a seq, clojure makes a seq call in the background

(seq {:jedi "skytrampler" :sith "darth face"})
; ([:jedi "skytrampler"] [:sith "darth face"])
; the result of the above call is a list with two vectors inside containing the values
; of the two key value pairs

; Whenever seq is called on a collection (implicit or not) the result is always 
; a value which looks an behaves as list

; try these and see what happens

(seq '(1 2 3 4 5 5))
(seq [1 2 3 4 5 6])
(seq #{1 2 3 4 5 6})

; this happens implicitly if you call a seq function on a collection for example

(first [1 2 3 4 5 6]) ; a call to seq is done under the hood before returning the first element

; this becomes very clear when you for example run rest on a collection
(rest [1 2 3 4 5 6]) ; the calls returns a list, not a vector as might be expected  

; or with map
(map #(* % %) [1 2 3 4 5 6]) ; not a squared vector but a squared list


