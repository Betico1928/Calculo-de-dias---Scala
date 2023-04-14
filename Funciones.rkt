#lang racket

(define (factorial-recursivo n)
  (if (<= n 0)
      1
      (* n (factorial-recursivo (- n 1)))))

(define (factorial-recursivo-de-cola n)
  (define (aux n a)
    (if (= n 0)
        a
        (aux (- n 1) (* n a))))
  (aux n 1))
