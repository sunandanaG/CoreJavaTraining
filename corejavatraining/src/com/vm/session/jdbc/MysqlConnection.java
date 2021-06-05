package com.vm.session.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MysqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//step 1:
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver class loaded");


			//step2

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false","root","root");
			System.out.println("coonected");
			
			//step3:
			Statement stmt=con.createStatement();
			//stmt.execute("insert into product values(4,'charger',400,'electronics')");
			//System.out.println("inserted");
			
			//stmt.execute("create table Emp1(id int,name varchar(30))");
			//System.out.println("created table");
			stmt.execute("insert into Emp1 values(1,'suna')");
			System.out.println("inserted");
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
