package com.vm.trainee.java.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ExampleCollect {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		 Scanner input=new Scanner(System.in);
		 int id;
		 String Name;
		 System.out.print("Input number : ");
		 int number = input.nextInt();
		 ArrayList arrayList=new ArrayList();
		 switch (number) 
		 {
		 case 1:
		  
		  System.out.print("id number : ");
		  id = input.nextInt();
		  System.out.print("Name : ");
		  Name = input.next();
		  System.out.println("id number :"+id+" "+"Name :"+Name);
		  arrayList.add(id);
		  arrayList.add(Name);
		
	}

}

}
