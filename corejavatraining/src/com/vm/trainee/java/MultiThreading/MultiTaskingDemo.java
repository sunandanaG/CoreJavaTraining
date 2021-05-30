package com.vm.trainee.java.MultiThreading;

class Maniteja extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		
		{
			System.out.println("Iterations for maniteja:"+i);
		}
	}
}
class Santosh extends Thread
{
	public void run()
	{
		for(int i=21;i<=30;i++)
			
		{
			System.out.println("iterations for santosh"+i);
		}
	}
}
class shashank extends Thread
{
	public void run()
	{
		for(int i=31;i<=40;i++)
			
		{
			System.out.println("iterations for shashank:"+i);
		}
	}
}
public class MultiTaskingDemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Maniteja m= new Maniteja();
		Santosh s=new Santosh();
		shashank sh=new shashank();
		m.start();
		s.start();
		sh.start();
		

	}

}
