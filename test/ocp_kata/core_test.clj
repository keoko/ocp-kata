(ns ocp-kata.core-test
  (:require [clojure.test :refer :all]
            [ocp-kata.core :refer :all]))

(deftest say-the-number
  (testing "Just say the number"
    (is (= ["1" "2" "4" "5"] (map say [1 2 4 5])))))

(deftest say-fizz
  (testing "When a number is multiple of 3, say 'Fizz'"
    (is (every? #(= "Fizz" %) (map say [3 6 9])))))
