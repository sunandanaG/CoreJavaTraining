package com.vm.trainee.java.Threadcommunication;

public class Customer 
{
	int balance=5000;

	synchronized public int withdraw(int amount)
	{
		if(balance<amount)
		{
			System.out.println("insufficient Balance");
			try
			{
				wait();
			}
			catch(InterruptedException  e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" "+"is going to withdraw");

		balance -=amount;
		return balance;

	}
	
	synchronized public int Deposit(int amount)
	{
		
		balance+=amount;
		System.out.println(Thread.currentThread().getName()+" "+"is going to deposit");
		return balance;
		
		
	}
}


