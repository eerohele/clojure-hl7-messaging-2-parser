(defproject clojure-hl7-parser "1.0-SNAPSHOT"
  :description "A parser for parsing HL7 messages."
  :dependencies [[org.clojure/clojure "1.1.0-alpha-SNAPSHOT"]
                 [org.clojure/clojure-contrib "1.0-SNAPSHOT"]
                 [commons-logging/commons-logging "1.1.1"]
                 [commons-net/commons-net "2.0"]
                 [net.sourceforge.jtds/jtds "1.2.2"]]
  :dev-dependencies [[org.clojure/swank-clojure "1.0"]]
  :repositories [["cdh" "http://cdhintranet01.cooley-dickinson.org/nexus/content/groups/public"]]
  :main "org.cooleydickinson.hl7_parser.main")