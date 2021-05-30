package com.vm.trainee.java.assignment;

import java.util.Scanner;

public class Assesment5 //program that takes a year from user and print whether that year is a leap year or not.
{
	public static void main(String[] args) {
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("The input year");
		year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println(year+"is a leap year");
		}
		else
		{
			System.out.println(year+" is not a leap year");	
		}
	}
   
   
}
