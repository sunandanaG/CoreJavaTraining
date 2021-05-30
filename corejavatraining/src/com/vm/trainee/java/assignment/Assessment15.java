package com.vm.trainee.java.assignment;

import java.util.Scanner;

public class Assessment15 //program that reads an positive integer and count the number of digits the number
{
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input an integer number less than ten billion");
		num=sc.nextInt();
		int count=0;
		while(num!=0)
		{

			num=num/10;
			count++;

		}
		System.out.print("Number of digits in the number:");
		System.out.println(count);
	}
}
