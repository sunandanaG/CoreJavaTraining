package com.vm.session.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now();
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
		  String afterformat=date.format(formatter);
		  System.out.println(afterformat);
		  
		  DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		  DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		  DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		  
		  String fulldate=date.format(formatter1);
		  System.out.println("full date formatter:"+fulldate);
		  
		  String mediumdate=date.format(formatter2);
		  
		  System.out.println("medium date formatter:"+mediumdate);
		  
		  String shortdate=date.format(formatter3);
		  System.out.println("short date formatter:"+shortdate);
		  
		  
	}

}
