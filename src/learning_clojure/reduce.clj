(ns learning-clojure.reduce)

; Reduce takes a function used as the reducer,
; and initial optional for the accumulator and a collection
; Reduce works as fold in F#

; Use reduce to add or multiply all elements in a collection
 (reduce + [1 2 3 4 5 6 7 8 9 10])
 (reduce * [1 2 3 4 5 6])

; Creating a factorial function with reduce
 (defn factorial
   [n]
   (reduce * (range 1 (inc n)))) ; inc n cause range is not upper bound inclusive

; Here is a not so obvious use of reduce, using it to update values in a map
 (reduce (fn [new-map [key val]]
           (assoc new-map key (str "Holy " val)))
         {}
         {:a "handgranate" :b "moly" :c "sh*t"})
; assoc takes a map, a key and a value. It then creates a new map by replacing the
; value associated with that key to a new value

; another clever use of reduce is to filter out unwanted elements from a map
 (def places {"miami" :city "paris" :city "copenhagen" :city "congo" :country})

 
 ; in other words: if the key/value pair in places passes the truth check in the 
 ; reduce function then add them to the empty map passed as an argument to reduce
 (reduce (fn [new-map [key val]]
         (if (= :city val)
         (assoc new-map key val) new-map))
         {}
         places) 


