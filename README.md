## SMCAPI
Rest API using Spring and Apache CXF running on an embedded Jetty server. Postgresql is used as the database. <br/>
Unit tests are written in Scala. 

Create a local postgres database using the sql dump file in the project.
Make sure you set the DATABASE_URL env variable to the connection url of your local database instance.

Work in progress...

#### Local
* $ set DATABASE_URL environment variable to your local postgres database connection url
* $ mvn clean install
* $ java -cp "target/classes;target/dependency/*" com.smcapi.main.Main
* test by: <br/>
 hitting "localhost:8080/api/attributes" with a <b>GET</b> request and<br />
 <b>header:</b> "content-type: application/json"<br />
