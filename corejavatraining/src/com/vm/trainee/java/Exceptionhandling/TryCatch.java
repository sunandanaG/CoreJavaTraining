package com.vm.trainee.java.Exceptionhandling;

import com.vm.trainee.java.oops.Employee;

public class TryCatch {
  public static void main(String[] args) {
	  int [] i= {1,2};
	  Employee e=null;
	try
	{
		System.out.println("ok");
		//System.out.println(2/0);//Arithmetic exception
		System.out.println(i[2]);//Array out of bounds Exception
		System.out.println("Hello try");
		
	}
	catch(Exception e1)
	{
		System.out.println(e1);
	}
}
}
