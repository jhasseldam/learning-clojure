(ns learning-clojure.loops-and-recursion)

; Loops has much better performance in Clojure than recursive calls

; Here is an example which prints the text 10 times
(loop [iteration 0]
  (println "Hello there from Clojure")
  (if (> 10 iteration)
    (recur (inc iteration))))

; What follows is complex way to double all numbers of an input vector
; This could have been done much easier with map, but illustrates the use of loops
(defn loop-demo
  [nums]
  (loop [remaining nums doubled []] ; initialize loop with nums and an empty vector for the output
  (if (empty? remaining) ; if no more numbers return the doubled vector
    doubled
    (let [[next & rest] remaining] ; bind then next number to next and the remainder to rest
      (recur rest (conj doubled (* 2 next))))))) ; continue the loop with the number doubled to the doubled vector

(loop-demo [1 2 3 4 5])
