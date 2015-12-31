## SMCAPI
Rest API using Spring and Apache CXF running on embedded Jetty server. 

Work in progress.

#### Local
* $ set DATABASE_URL
* $ mvn clean install
* $ java -cp "target/classes;target/dependency/*" com.smcapi.main.Main
* test by hitting "localhost:8080/api/search" with a GET request

