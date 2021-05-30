package com.vm.trainee.java.oops;


class Bank
{
	void msg()
	{
		System.out.println("2%");
	}
}
class Axis  extends Bank
{
	void msg()
	{
		System.out.println("4%");
	}
	static void loan()  //static method cannot be overriden
	{
		System.out.println("bank loans");
	}
}
class icici  extends Bank
{
	void msg()
	{
		System.out.println("6%");
	}
}
public class OverridingDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	Bank a=new Axis();//overriding
	a.msg();

	}

}
