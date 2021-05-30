package com.vm.trainee.java.Exceptionhandling;

public class ClassNotFoundTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	Class.forName("HW");
	System.out.println("found");
}
catch(ClassNotFoundException e)
{
	e.printStackTrace();
}
	}

}
