package com.vm.trainee.java.assignment;

import java.util.Scanner;

public class Assesment7 //Java to input 5 numbers from keyboard and find their sum and average.
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num;
		int sum=0;
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("input 5 numbers:");
		
		for(int i=1;i<=5;i++)
		{
			num=sc.nextInt();
			sum=sum+num;
		}
		System.out.println("The sum of 5 numbers is:"+sum);
		
       avg=sum/5;
       System.out.println("the average of  numbers is:"+avg);
	}

}
