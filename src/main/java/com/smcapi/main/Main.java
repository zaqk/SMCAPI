package com.smcapi.main;

import java.util.logging.Logger;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Main {
	
	private static final Logger log = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) throws Exception{
		String webappDirLocation = "src/main/webapp";

        String webPort = System.getenv("PORT");
        if (webPort == null || webPort.isEmpty()) {
            webPort = "8080";
        }

        Server server = new Server(Integer.valueOf(webPort));
        WebAppContext root = new WebAppContext();


        root.setContextPath("/");
        root.setDescriptor(webappDirLocation + "/WEB-INF/web.xml");
        root.setResourceBase(webappDirLocation);

        //Read more here: http://wiki.eclipse.org/Jetty/Reference/Jetty_Classloading
        root.setParentLoaderPriority(true);
        log.info("ContextPath: " + root.getContextPath());
        log.info("DefaultDescriptor: " + root.getDescriptor());
        log.info("Resource Base: " + root.getResourceBase());
        server.setHandler(root);
        server.start();
        server.join();


	}

}
