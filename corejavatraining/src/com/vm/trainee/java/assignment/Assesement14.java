package com.vm.trainee.java.assignment;

import java.util.Scanner;

public class Assesement14 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num1,num2,num3;
      Scanner sc=new Scanner(System.in);
      System.out.println("Input the first number:");
      num1=sc.nextInt();
      System.out.println("Input the second number:");
      num2=sc.nextInt();
      System.out.println("Input the third number:");
      num3=sc.nextInt();
      if(num1<num2 & num2<num3)
      {
    	  System.out.println("Increasing");
      }
      else if(num1>num2 &num2>num3)
      {
    	  System.out.println("Decreasing");
      }
      else
      {
    	  System.out.println("Neither Increasing nor Decreasing");
      }
	}

}
