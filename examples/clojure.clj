(ns clj-tabtree.tabtree2)

(require '[[clojure.string :as str]])

(def ^:dynamic ns false)

(defn foo "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn
  bar [x]
  "foo")

(defn bar
  [x]
  "foo")

(def a 10)

((fn [xah lee]
  (let [a 100
        x 10
        c "foo"
        d 3]
    (println "hello")
    (rand-int (* x a))))
  100)

;; TODO
;; 4) break highlight if new line between defn and vector of parameters
(defn strip-ns [s doowee]
  (println "hello")
  (reverse "foo")
  (let [astr 10
        c "foo"
        a 1001]
    (if (indexof? 'a 10)
      #"foo\"s"
      200)))

(defn ^String foo "docstring" [bar]
  "baz")

(defn func [bar]
  "baz")

(let [a 100
      b 200
      c "foo"]
  (println (+ a b)))

(+ 200.5 nil TERIBERKA)

{:foo 100 :bar "acti\"on"}

(+ 10 20)
(foo "sddd")
(first (range 1 10))
(reduce 1 2 3)
(println "hrllo wr")

(reverse [1 2 3])

^aot

(cond
  ((= i 0) 1)
  ((not= i 10) nil)
  1e50)
