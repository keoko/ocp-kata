(ns ocp-kata.core)


(declare say-fizz say-buzz)

(def say-rules [say-fizz say-buzz])

(defn is-a-multiple-of? 
  [x y] 
  (= 0 (mod y x)))

(defn say
  [x]
  (if-let [s (seq (apply str ((apply juxt say-rules) x)))]
    (apply str s)
    (str x)))

(defn say-fizz 
  [x]
  (when (is-a-multiple-of? 3 x)
    "Fizz"))

(defn say-buzz
  [x]
  (when (is-a-multiple-of? 5 x)
    "Buzz"))

