package com.lockit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLConnection {
	
	private static final Logger LOGGER = Logger.getLogger(SQLConnection.class.getName());
	private static SQLConnection sqlConnection = null;
	private Connection connection = null;
	private Statement statement = null;
	
	private SQLConnection() {
		
	}
	
	public static SQLConnection getInstance() {
		if(sqlConnection == null) {
			sqlConnection = new SQLConnection(); 
		}
		
		return sqlConnection;
	}
	
	public Statement getConnection() {
		String url = "jdbc:mysql://localhost:3306/";
		String dbname = "LockItDB";
		String username = "root";
		String password = "spectrum";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url + dbname, username, password);
			statement = connection.createStatement();
		} catch (Exception e) {
			LOGGER.log(Level.WARNING, e.toString());
		}
		
		return statement;
	}
}
