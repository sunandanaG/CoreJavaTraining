package com.vm.trainee.java.MultiThreading;


class Company extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"  "+i);
		}
	}
}
class Employee1 extends Thread
{
	{
		for(int i=1;i<=50;i++)
		{
			System.out.println(Thread.currentThread().getName()+"   "+i);
		}
	}
}
public class DeamonThread 
{
	public static void main(String[] args) {
		
	
   Company company=new Company();
   Employee emp=new Employee();
   
   
   company.setName("ValueMomentum");
   emp.setName("suna");
   
   emp.setDaemon(true);
   
   company.start();
   emp.start();
}
}
