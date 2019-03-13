(defproject org.clojars.djh/lein-groovyc "0.3.0"
  :description "Compile groovy sources"
  :dependencies [[org.codehaus.groovy/groovy-all "2.5.6" :extension "pom"]
                 [lancet "1.0.2" :exclusions [org.apache.ant/ant]]]
  :repositories [["clojars" {:url "https://clojars.org/repo"
                             :sign-releases false}]]
  :eval-in-leinigen true)
