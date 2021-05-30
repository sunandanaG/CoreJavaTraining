package com.vm.trainee.java.assignment;

import java.util.Scanner;

public class Assesment8 //Java to display the cube of the number upto given an integer.
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("input the number of terms:");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			System.out.print("Number is:"+i);
			int cube=i*i*i;
			System.out.println(" and cube of "+i+" "+ "is :"+cube);
		}

	}

}
