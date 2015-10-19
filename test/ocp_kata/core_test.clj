(ns ocp-kata.core-test
  (:require [clojure.test :refer :all]
            [ocp-kata.core :refer :all]))

(deftest say-the-number
  (testing "Just say the number"
    (is (= ["1" "2" "3" "4" "5"] (map say [1 2 3 4 5])))))
