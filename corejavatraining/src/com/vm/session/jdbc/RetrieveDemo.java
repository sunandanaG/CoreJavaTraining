package com.vm.session.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver class loaded");


			//step2

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false","root","root");
			System.out.println("coonected");
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from product");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
