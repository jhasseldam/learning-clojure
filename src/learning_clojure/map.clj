(ns learning-clojure.map)

; calling the map function projects the collection over a function argument
; this is similar to Seq.Map in F# or Enumerable.Select() in C#

(map inc [1 2 3 4 5])

(map #(str "hello mother-" %) ["dear" "freaker" "of-mine"])

; map can also take multiple collections and something interesting happens here
; map then works like you would expect Enumerable.Zip() works in C#

(map str [1 2 3 4 5] ["one" "two" "three" "four" "five"])
; the result of the above function is: ("1one" "2two" "3three" "4four" "5five")

; this is could be usual in the following way for example:
; lets play a round of asynchronous rock-paper-scissors

(def hank-choices [:rock :rock :scissors :paper :scissors :paper])
(def frank-choices [:paper :rock :scissors :scissors :paper :rock])

(defn unify-selection
  [hank-choice frank-choice]
  {"Hank" hank-choice "Frank" frank-choice})

(map unify-selection hank-choices frank-choices)


; or lets suppose you would like to apply several functions to the same argument
; since this requires that the collection are of the same length, it's not the most flexible solution
(def triple #(* % 3))
(def square #(* % %))
(def half #(/ % 2))

(defn apply-operator
  [num operator]
  (operator num))

(map apply-operator [5 5 5] [triple square half])

; Another clever use of map is to retrive the value associated with a keyword in a collection
; Lets say you have a bunch of accounts and need the balances

(def accounts 
  [{:number 34343 :owner "mr moneybags" :balance 999999999}
   {:number 34232 :owner "scrooge mcduck" :balance 3434434245}
   {:number 28756 :owner "arnold" :balance 345}])

(map :balance accounts)

