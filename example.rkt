#lang racket

(require "tabtree1.rkt")

(provide (all-defined-out))

; a function
(define (foobar a b)
  (let* ((c 100))
    (list a b c "some string")))

(+ 100.5 #t)
