package com.vm.trainee.java.Exceptionhandling;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the product status");
		String Product=sc.next();
		try
		{
			if(Product.equals("notreceived"))
			{
				throw new ProductDidntReceiveException("Sorry Product didnot recieved due to restrictions");
			}
		}
		catch(ProductDidntReceiveException e)
		{
			e.printStackTrace();
		}
		try
		{
			if(Product.equals("damaged"))
			{
				throw new ProductDamagedException("Sorry for the damaged product we will exchange the product");
			}
		}
		catch(ProductDamagedException e)
		{
			e.printStackTrace();
		}
		try
		{
			if(Product.equals("refund"))
			{
				throw new ExceededmaxNoOfDays("is there any thing wrong with the product?");
			}
		}
		catch(ExceededmaxNoOfDays e)
		{
			e.printStackTrace();
		}

	}
}
