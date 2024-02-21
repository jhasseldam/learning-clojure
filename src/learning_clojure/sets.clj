(ns learning-clojure.sets)

; Sets uses the same curly brackets as maps, but with a hash sign in front
{:cd "retro" :tape "retro" :vinyl "retro cool"} ; this is a map

; this is a set and can't be created with two dogs, this gives compile time exception
; #{:cat :dog :zebra :snake :dog :ant} 
#{:book :pen :desk "pen" :cup "two" 2 :two} ; a valid set with all unique values

; Create a set using the hash-set function
(hash-set "hello" "my" "name" "is")

; Add an element to a set using conj
(conj #{:einz :swei :dreeeei} :fir)

(def animals '(:cat :dog :horse :sloth :dog :swine))

; Or create a set from a list using the set function
(set animals) ; There is only one dog in the result event though dogs are great cause it's a set

; Check if a set contains an element using contain?
(contains? #{:oh :my :god :look :at :that} :god) ; true

; You can also use get to see if an element is in the set
; But this doesn't return a bool, but instead the element if it's present
(get #{:me :myself :i} :me) ; returns :me

; The same can be achieved by used the element as a function instead
(:hi #{:hi :hai :ho}) ; return :hi

