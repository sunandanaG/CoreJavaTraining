package com.vm.trainee.java.assignment;

import java.util.Scanner;

//Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
public class Assesment3 
{
	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number:");
		num=sc.nextInt();
		switch(num)
		{
		case 1:
		{
			System.out.println("Monday");
			break;
		}
		case 2:
		{
			System.out.println("Tuesday");
			break;
		}
		case 3:
		{
			System.out.println("Wednesday");
			break;
		}
		case 4:
		{
			System.out.println("Thursday");
			break;
		}
		case 5:
		{
			System.out.println("Friday");
			break;
		}
		case 6:
		{
			System.out.println("Saturday");
		}
		case 7:
		{
			System.out.println("Sunday");
			break;
		}
		 
	}
 
	}
}
