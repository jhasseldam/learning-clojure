(ns learning-clojure.into)

; Transform a collection into another collection

; take a set and transform it into a vector
(into [] #{:me :you :mom :uncle-bob})

; take a vector and transform it into a set (removeing any duplicates in the process)
(into #{} [:marty :doc :henning :doc])

; take a vector and transform it into a list
(into () [8 :swifty-five "a billion"])

; take a list and transform it into a vector
(into [] '(+ * - /))

; a bit more fun: take a list of elements and add them a vecotor
; the result is not a list inside a vector as you might expect, but a vector with 
; the original elements plus those in the list
(def eggs [:brown :white :red :golden :ostrich])
(into eggs '(:dinosaur :rhino))
