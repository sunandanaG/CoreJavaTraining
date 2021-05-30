package com.vm.session.Date;

import java.time.LocalDate;

public class DataParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String startdate="2021-05-21";
         LocalDate ld=LocalDate.parse(startdate);
         System.out.println("start date"+ld);

	}	

}
