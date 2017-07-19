package com.java.JDBCCodeTest.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class ConnectionDetail {
	public static final String URL="jdbc:mysql://localhost:3306/vendingmachine?autoReconnect=true&relaxAutoCommit=true";
	public static final String USERNAME="root";
	public static final String PASSWORD="root123";
	
	public static Connection getConnection(){
		
		try{
			DriverManager.registerDriver(new Driver());
			return DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}catch (SQLException e) {
			throw new RuntimeException("Error connecting to database",e);
		}
	}
}
