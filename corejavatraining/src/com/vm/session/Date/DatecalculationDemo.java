package com.vm.session.Date;

import java.time.LocalDate;

public class DatecalculationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld=LocalDate.now();
		System.out.println("next day : "+ld.plusDays(3));
		System.out.println("next month : "+ld.plusMonths(2));
		
		
		
		LocalDate bookingdate = LocalDate.of(2021, 05, 30);
		if(bookingdate.isAfter(ld))
		
	        System.out.println("correct date u can book");
	         else
	        

				System.out.println(" invalid date ");
				}
		

	}


