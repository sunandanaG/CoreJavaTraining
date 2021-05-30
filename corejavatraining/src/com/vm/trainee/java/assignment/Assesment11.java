package com.vm.trainee.java.assignment;

import java.util.Scanner;

public class Assesment11  // Program to print Fibonacci series
{

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number:");
		n=sc.nextInt();
		// TODO Auto-generated method stub
		int num1=0,num2=1,num3 = 0;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=1;i<=n;i++)
		{
			num3=num2+num1;
		System.out.println(num3);
			num1=num2;
			num2=num3;
		
		}

	}

}
