package com.smcapi.util;

public class Constants{
	//directories
	public static final String DB_CONTEXT = "src/main/webapp/WEB-INF/conf/db-context.xml";
	public static final String WEB_APP_DIR = "src/main/webapp";
	public static final String DESCRIPTOR_LOCATION = "src/main/webapp/WEB-INF/web.xml";
	
	//environment variables
	public static final String ENV_PORT_KEY = "PORT";
	public static final String ENV_DB_KEY = "DATABASE_URL";
	
	//environment variable values
	public static final String ENV_PORT_DEFAULT_VALUE = "8080";
	
	//beans
	public static final String DATASOURCE_BEAN = "dataSource";
	public static final String SQLSESSION_BEAN = "sqlSession";
	
	//database constants
	public static final String MAIN_TABLE = "MAIN";
	
	//dao map methods
	public static final String DAO_MAP_SEARCH = "maps.SongServiceMapper.search";
	public static final String DAO_MAP_GET_ATTRIBUTES = "maps.AttributeServiceMapper.getAttributes";
	
	//error messages
	public static final String NO_RESULTS = "No results";
	
	
	
}