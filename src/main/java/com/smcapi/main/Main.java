package com.smcapi.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	
	private static final Logger log = Logger.getLogger(Main.class.getName());
	private static final String TABLE_NAME = "main";
	private static final String DB_CONTEXT_BEAN = "src/main/webapp/WEB-INF/conf/db-context.xml";

	public static void main(String[] args) throws Exception {
		String webappDirLocation = "src/main/webapp";

		String webPort = System.getenv("PORT");
		if (webPort == null || webPort.isEmpty()) {
			webPort = "8080";
		}

		Server server = new Server(Integer.valueOf(webPort));
		WebAppContext root = new WebAppContext();

		validateDB();

		root.setDescriptor(webappDirLocation + "/WEB-INF/web.xml");
		root.setResourceBase(webappDirLocation);

		root.setParentLoaderPriority(true);

		server.setHandler(root);
		server.start();
		server.join();

	}
	

    /**
     * Attempts to connect to the DB and ensures that the necessary tables exist. Calls System.exit if there is a problem connecting to the DB
     */
	private static void validateDB() {
		log.info("Validating DB");
		try {
			ApplicationContext ac = new FileSystemXmlApplicationContext(DB_CONTEXT_BEAN);
			DataSource dataSource = (DataSource) ac.getBean("dataSource");
			Connection conn = dataSource.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("select count(*) from " + TABLE_NAME);
			rs.next();
			long count = rs.getLong(1);
			log.info("Successfully connected to DB, counted " + count + " rows in " + TABLE_NAME);
		} catch (Exception e) {
			log.severe("Exception validating DB! " + e);
			System.exit(1);
		}
	}

}
