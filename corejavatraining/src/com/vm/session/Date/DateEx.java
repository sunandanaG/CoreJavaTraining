package com.vm.session.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateEx {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the date to be booked in format(yyyy/mm/dd)");
		  String str=sc.nextLine();
		  LocalDate today=LocalDate.now();
		  LocalDate ld=LocalDate.parse(str);
		  if(ld.isAfter(today))
		  {
		   System.out.println("The ticket is booked successfully on "+ld);
		  }
		  else
		  {
		   System.out.println("We can not book your ticket");
		  }
	}
}


