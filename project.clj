(defproject mal "0.1.0-SNAPSHOT"
  :description "My anime list bot"
  :url "http://myanimelist.net"
  :license {:name "GPLv3"
            :url "http://www.gnu.org/licenses/gpl-3.0.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.2.374"]
                 [org.clojure/data.zip "0.1.2"]
                 [tblibrary "0.1.2-SNAPSHOT"]
                 [http-kit "2.2.0"]
                 ;; Logs
                 [org.clojure/tools.logging "0.3.1"]
                 [log4j/log4j "1.2.17" :exclusions [javax.mail/mail
                                                    javax.jms/jms
                                                    com.sun.jmdk/jmxtools
                                                    com.sun.jmx/jmxri]]]
  :main ^:skip-aot mal.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
