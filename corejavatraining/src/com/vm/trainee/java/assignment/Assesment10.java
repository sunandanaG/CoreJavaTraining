package com.vm.trainee.java.assignment;

import java.util.Scanner;

public class Assesment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the rows:");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("@");
			}
			System.out.print("\n");
		}
	}

}
