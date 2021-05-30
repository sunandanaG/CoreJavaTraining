package com.vm.trainee.java.assignment;

import java.util.Scanner;

public class Assesment1   //program to get a number from the user and print whether it is positive or negative.
{
   public static void main(String[] args) 
   {
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("input number");
	num=sc.nextInt();
	if(num>0)
	{
		System.out.println("Number is positive");
	}
}
}
