(ns clj-tabtree.tabtree2)

(require '[[clojure.string :as str]])

(def ^:dynamic ns false)

(def a 10)

((fn [x] 
  (let [a 100] 
    (println "hello")
    ((rand-int (* x a))))))
    
;; TODO
;; 1) first line after defintion doesn't highlight
;; 2) core_function doesn't take their color
(defn strip-ns [s doowee]
  (reverse "fg")
  (println "foo")
  (println 30)
  (let [astr (str s)]
    (if (indexof? 'a 10)
      #"foo\"s"
      200)))

(defn ^String foo [bar]
  "baz")
      
(+ 200.5 nil TERIBERKA)

{:foo 100 :bar "acti\"on"}

(+ 10 20)
(foo "sddd")
(reduce 1 2 3)
(println "hrllo wr")

(reverse [1 2 3])

^aot

(cond
  ((= i 0) 1)
  ((not= i 10) nil)
  1e50)
  
  