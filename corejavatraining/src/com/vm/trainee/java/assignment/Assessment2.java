package com.vm.trainee.java.assignment;

import java.util.Scanner;

public class Assessment2 //Take three numbers from the user and print the greatest number
{
	public static void main(String[] args) 
	{


		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("input the 1st number:");
		num1=sc.nextInt();
		
		System.out.println("input the 2nd number:");
		num2=sc.nextInt();
		
		System.out.println("input the 3rd number:");
		num3=sc.nextInt();

		if(num1>num2&num1>num3)
		{
			System.out.println("the greatest number is:"+num1);
		}
		else if(num2>num3)
		{
			System.out.println("the greatest number is:"+num2);
		}
		else
		{
			System.out.println("the greatest number is:"+num3);
		}
	}
}