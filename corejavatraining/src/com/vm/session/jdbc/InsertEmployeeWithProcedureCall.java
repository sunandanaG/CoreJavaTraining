package com.vm.session.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;

public class InsertEmployeeWithProcedureCall 
{
	public static void main(String[] args) {
	      try 
	      {
	        Connection con = DBConnection.getConnection();
	        CallableStatement callstmt = con.prepareCall("{call InsertTheData(?,?,?,?,?)}");
	        callstmt.setInt(1, 13); 
	        callstmt.setString(2, "naresh");
	        callstmt.setInt(3, 54000);
	        callstmt.setString(4, "HR");
	        callstmt.setInt(5, 24);
	        callstmt.execute();
	        
	        
	      } 
	      catch (Exception e) 
	      {
	        e.printStackTrace();
	      }
	    }

}
