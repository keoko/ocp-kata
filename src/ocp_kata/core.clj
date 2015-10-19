(ns ocp-kata.core)


(defn is-a-multiple-of-3? 
  [x]
  (= 0 (mod x 3)))


(defn say
  [x]
  (or (say-bizz x)
      (str x)))

(defn say-bizz [x]
  (when (is-a-multiple-of-3? x)
    "Fizz"))


