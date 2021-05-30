package com.vm.trainee.java.assignment;

import java.util.Scanner;

public class Assesment9 //display the pattern like right angle triangle with a number.
{
	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the number of rows:");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			int p=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(p+++" ");
			}
			System.out.println("\n");
		}
	}

}
