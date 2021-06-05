package com.vm.session.jdbcConnectionUsingmethods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		return DriverManager.getConnection(JDBCProperties.URL, JDBCProperties.USERNAME, JDBCProperties.PASSWORD);
	}

}
