package com.vm.session.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatementDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver class loaded");


			//step2

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false","root","root");
			System.out.println("coonected");
			
			PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?,?)");
			ps.setInt(1, 8);
			ps.setString(2, "Ac");
			ps.setInt(3,560000);
			ps.setString(4, "electronics");
			ps.execute();
			System.out.println("insertes");
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}


	}

}
