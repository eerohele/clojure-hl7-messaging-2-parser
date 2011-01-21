(defproject clojure-hl7-parser "3.2"
  :description "A parser for parsing HL7 messages."
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [commons-logging/commons-logging "1.1.1"]]
  :dev-dependencies [[swank-clojure "1.2.0"]]
  :main com.nervestaple.hl7-parser.main)
