(ns ocp-kata.core-test
  (:require [clojure.test :refer :all]
            [ocp-kata.core :refer :all]))

(deftest test-say-the-number 
  (testing "Just say the number"
    (is (= ["1" "2" "4" "8"] (map say [1 2 4 8])))))

(deftest test-say-fizz
  (testing "When a number is multiple of 3, say 'Fizz'"
    (is (every? #(= "Fizz" %) (map say [3 6 9])))))

(deftest test-say-buzz
  (testing "When a number is multiple of 5, say 'Buzz'"
    (is (every? #(= "Buzz" %) (map say [5 10])))))

(deftest test-say-fizzbuzz
  (testing "When a number is multiple of 3 and  5, say 'FizzBuzz'"
    (is (every? #(= "FizzBuzz" %) (map say [15 30])))))

(deftest test-say-bang 
  (testing "When a number is multiple of 7, say 'Bang'"
    (is (every? #(= "Bang" %) (map say [7 14])))))

(deftest test-say-bang 
  (testing "When a number is multiple of 3 and 7, say 'FizzBang'"
    (is (every? #(= "FizzBang" %) (map say [(* 3 7)])))))

(deftest test-say-bang 
  (testing "When a number is multiple of 5 and 7, say 'BuzzBang'"
    (is (every? #(= "FuzzBang" %) (map say [(* 5 7)])))))
(deftest test-say-bang 
  (testing "When a number is multiple of 3, 5 and 7, say 'FizzBuzzBang'"
    (is (every? #(= "FizzBuzzBang" %) (map say [(* 3 5 7)])))))
