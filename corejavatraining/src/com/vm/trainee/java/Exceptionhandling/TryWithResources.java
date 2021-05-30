package com.vm.trainee.java.Exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryWithResources {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     try(FileOutputStream fos= new FileOutputStream(new File("D:/suna.txt"));Connection con = DriverManager.getConnection("url","un","pwd"))
     {
    	 String s="value momentum";
    	 byte [] b=s.getBytes();
    	 fos.write(b);
    	 System.out.println("success");
     } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (SQLException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	}

}
