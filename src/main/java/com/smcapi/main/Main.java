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

	public static void main(String[] args) throws Exception {

		String webPort = System.getenv(Constants.ENV_PORT_KEY);
		if (webPort == null || webPort.isEmpty()) {
			webPort = Constants.ENV_PORT_DEFAULT_VALUE;
		}

		Server server = new Server(Integer.valueOf(webPort));
		WebAppContext root = new WebAppContext();

		validateDB();

		root.setDescriptor(Constants.DESCRIPTOR_LOCATION);
		root.setResourceBase(Constants.WEB_APP_DIR);

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
			ApplicationContext ac = new FileSystemXmlApplicationContext(Constants.DB_CONTEXT);
			DataSource dataSource = (DataSource) ac.getBean(Constants.DATASOURCE_BEAN);
			Connection conn = dataSource.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("select count(*) from " + Constants.MAIN_TABLE);
			rs.next();
			long count = rs.getLong(1);
			log.info("Successfully connected to DB, counted " + count + " rows in " + Constants.MAIN_TABLE);
		} catch (Exception e) {
			log.severe("Exception validating DB! " + e);
			System.exit(1);
		}
	}

}
