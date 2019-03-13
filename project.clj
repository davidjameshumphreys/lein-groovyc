(defproject org.clojars.djh/lein-groovyc "0.4.0"
  :description "Compile groovy sources"
  :url "https://github.com/davidjameshumphreys/lein-groovyc"
  :license {:name         "Eclipse Public License - v 1.0"
            :url          "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments     "same as Clojure"}
  :dependencies [[org.codehaus.groovy/groovy-all "2.5.6" :extension "pom"]
                 [lancet "1.0.2" :exclusions [org.apache.ant/ant]]]
  :repositories [["clojars" {:url "https://clojars.org/repo"
                             :sign-releases false}]]
  :eval-in-leinigen true)
