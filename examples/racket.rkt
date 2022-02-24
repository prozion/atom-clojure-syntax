#lang racket

(require "tabtree1.rkt")

(provide (all-defined-out))

(define foo 10)

; a function
(define (foobar a b)
  (let* ((c 100))
    (list a b c "some string")))

(foobar 10 20)
(string 1000 #:a)

(+ 100.5 #t)
