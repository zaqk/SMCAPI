## SMCAPI
Rest API using Spring and Apache CXF running on embedded Jetty server.
Postgres is used as the database. Create a local postgres database using the sql dump file in the project.
Make sure you set the DATABASE_URL env variable to the connection url of your local database instance.

Work in progress.

#### Local
* $ set DATABASE_URL
* $ mvn clean install
* $ java -cp "target/classes;target/dependency/*" com.smcapi.main.Main
* test by hitting "localhost:8080/api/search" with a GET request

