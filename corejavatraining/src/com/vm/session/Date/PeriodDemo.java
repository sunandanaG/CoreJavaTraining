package com.vm.session.Date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class PeriodDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the birth year");
		String str=sc.nextLine();
		  LocalDate today=LocalDate.now();
		  
		LocalDate joiningdate=LocalDate.parse(str);
		
		Period period=Period.between(joiningdate,today);
		
		System.out.println(period.getYears()+"years  "+period.getMonths()+" months  "+period.getDays()+" days");
		

	}
	
}
