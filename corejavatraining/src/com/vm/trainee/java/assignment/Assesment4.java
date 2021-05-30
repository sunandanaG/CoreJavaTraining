package com.vm.trainee.java.assignment;

import java.util.Scanner;

public class Assesment4 //Java program to find the number of days in a month
{
   public static void main(String[] args) {
	int year,month,day = 0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Input a month number:");
	month=sc.nextInt();
	System.out.println("Input a year:");
	year=sc.nextInt();
	
	switch(month)
	{
	case 1:
	{
		System.out.print("January");
		day=31;
		break;
	}
	case 2:
	{
		System.out.print("Febuary");
		day=29;
		break;
	}
	case 3:
	{
		System.out.print("march");
		day=31;
		break;
	}
	case 4:
	{
		System.out.println("April");
		day=30;
		break;
	}
	case 5:
	{
		System.out.print("May");
		day=31;
		break;
	}
	case 6:
	{
		System.out.print("June");
		day=30;
		break;
	}
	case 7:
	{
		System.out.print("July");
		day=31;
		break;
	}
	case 8:
	{
		System.out.print("August");
		day=31;
		break;
	}
	case 9:
	{
		System.out.print("September");
		day=30;
		break;
	}
	case 10:
	{
		System.out.print("October");
		day=31;
		break;
	}
	case 11:
	{
		System.out.print("November");
		day=30;
		break;
	}
	case 12:
	{
		System.out.print("december");
		day=31;
		break;
	}
}
	if(year%4!=0)
	{
		day=28;
	}
	System.out.println(" "+year+" "+"has" +" " +day+" "+"days");
}
}
