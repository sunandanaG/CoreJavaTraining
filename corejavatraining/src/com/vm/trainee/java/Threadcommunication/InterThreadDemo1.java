package com.vm.trainee.java.Threadcommunication;

public class InterThreadDemo1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Customer c=new Customer();
		
		
		
		Thread t1=new Thread()
		{
			public void run()
			{
				System.out.println(c.withdraw(7000));
			}
		};
		
		Thread t2=new Thread()
		{
			public void run()
			{
				System.out.println(c.Deposit(7000));
			}
		};
		
		t1.setName("withdraw");
		t2.setName("Deposit");
		
		t1.start();
		t2.start();

	}

}
