package com.vm.session.jdbcConnectionUsingmethods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MySqlConnection 
{
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    try {
	      Connection con=DBConnection.getConnection();
	      PreparedStatement ps=con.prepareStatement("select *from product");
	      ResultSet rs=ps.executeQuery();

	      while(rs.next()) {
	        System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4)); 
	      }

	    }
	    catch (Exception e) {
	      e.printStackTrace();
	    }
	  }

}
