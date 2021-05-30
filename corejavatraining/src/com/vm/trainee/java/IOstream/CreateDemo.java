package com.vm.trainee.java.IOstream;

import java.io.File;
import java.io.IOException;

public class CreateDemo {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		File f=new File("suna.txt");
		File f2=new File("D:\\SUNA\\some.txt");
		if(f2.exists())
		{
			System.out.println("file is present");
		}
		else
		{
			System.out.println("file is not present");
			f2.createNewFile(); // used to create file
			System.out.println("file is created");
		}
	}

}
