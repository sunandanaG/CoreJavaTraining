package com.vm.session.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.vm.session.jdbcConnectionUsingmethods.JDBCProperties;

public class DBConnection {

	public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(JDBCProperties.URL, JDBCProperties.USERNAME, JDBCProperties.PASSWORD);
	}

}
