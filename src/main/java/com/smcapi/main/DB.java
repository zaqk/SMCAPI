package com.smcapi.main;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public static Connection getConnection() throws URISyntaxException, SQLException {
        String dbString = System.getenv("DATABASE_URL");
        if (dbString == null) {
            throw new RuntimeException("DATABASE_URL not set. Should be of the form '[database type]://[username]:[password]@[host]:[port]/[database name]'");
        }

        URI dbUri = new URI(dbString);

        String userInfo = dbUri.getUserInfo();
        if (userInfo == null) {
            throw new RuntimeException("DB URL does not contain user info. Should be of the form '[database type]://[username]:[password]@[host]:[port]/[database name]'");
        }

        String username = userInfo.split(":")[0];
        String password = userInfo.split(":")[1];
        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + dbUri.getPath() + "?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";

        return DriverManager.getConnection(dbUrl, username, password);
    }
}