package com.vm.session.codingAssign.june1;

import java.util.Scanner;

public class Employeeetest {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    
	    System.out.print("enter firstname : ");
	    String firstname=sc.next();
	    System.out.print("enter lastname : ");
	    String lastname=sc.next();
			
			Employeeee emp=new Employeeee(firstname,lastname);
			
			emp.Validation();
			

	}

}
