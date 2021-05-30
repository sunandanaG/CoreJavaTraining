package com.vm.trainee.java.Exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;

public class CheckedExceptionIdentity {
public static void main(String[] args) {
//	try
//	{
//	int [] i= {1,2};
//	System.out.println(i[2]);
//	Connection con=DriverManager.getConnection(" "," "," ");
//	}
//	catch(Exception e) 
//	{
//		e.printStackTrace();
//	}
	try
	{
		System.out.println(4/0);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
	finally {
		System.out.println("iam in finally block");
	}
	
}
}
