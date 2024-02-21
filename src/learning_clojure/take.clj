(ns learning-clojure.take)

; take can be used to only take the first n elements of a collection

(take 3 [:bear :tiger :grandpa :fish :squid])

; take-while can be used to take from a collection as long as a certain
; condition applies

; only take the numbers which is less that 10
(take-while #(< % 10) (range 1 50))

; a caveat to notice here is that the collection has to be ordered for this to work
; cause if someone sneaks in an element after the condition for take-while is 
; no longer true, then it wont be added
; in other words: take-while takes until a condition is no longer true and 
; it doesn't continue again after that

(take-while #(< % 10) [1 2 3 4 5 6 7 8 9 10 4]) ; still only return 0 to 9

; if you don't want to stop when the predicate no longer hold true
; then you can use filter instead. Though when your collection is ordered it is 
; often not necessary to process the whole collection before knowing when to stop
; and here take-while is more efficent
(filter #(< % 10) [1 2 3 4 5 6 7 8 9 10 4]) ; also gets the sneaky 4 in the end

; take and take-while has equivilant functions for dropping items from a 
; collection instead. These are called drop and drop-while respectivily 


