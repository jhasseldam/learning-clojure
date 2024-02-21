(ns learning-clojure.maps)

; Maps are similar to dictionaries in C# 

; Maps are built with key value pair associations

{:rock "Pink Floyd" :crunge "Nirvana"}

; As can be seen above Clojure doens't need any seperation token between key-value pairs
; It just knows that the first two value forms the first key-value pair
; then the next two and so on and so forth

; You can use comma as a seperator if you like, but it's not mandatory

{:rock "Beatles", :pop "Britney"}

; Here is an example with string->string key value pairs

{"jedi" "obi-won" "sith" "darth vader"}

; And with numbers

{1 "me" 2 "everyone else"}

; You can even mix and match types

{"here is" "johnny", 42 "the answer" :account-number 34002343}

; Maps can also be created using the hash-map function in addition to literals as seen above

(def artists (hash-map :elton "nikita" :vidas "the seventh element"))

; Get can be used to find an element in a map bases on the key

(get artists :vidas)

; It's also possbile to look up a value in a map by using the map as a function and the 
; key as as an argument

(artists :elton)

; Or use the key as a function and the map as an argument - WHAAAT?

(:elton artists)
