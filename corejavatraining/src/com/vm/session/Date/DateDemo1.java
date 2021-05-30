package com.vm.session.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        LocalDate todaydate=LocalDate.now();
        System.out.println("date is:"+todaydate);
        
        LocalDateTime datetime= LocalDateTime.now();
        System.out.println("date time"+datetime);
        
        System.out.println("date of the year "+todaydate.getDayOfYear());
        System.out.println("month of the day "+todaydate.getDayOfMonth());
        System.out.println("week of the day "+todaydate.getDayOfWeek());
        
	}

}
