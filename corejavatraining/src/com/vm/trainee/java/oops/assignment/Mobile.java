package com.vm.trainee.java.oops.assignment;

public class Mobile 
{
	void mobile()
	{
		System.out.println("Different types of mobiles are available in market");
	}

}     // single inheritance
class Moto extends Mobile
{
	void show()
	{
		System.out.println("Moto has launched new featured mobile");
	}
}
class Honor extends Moto
{
	void display()
	{
		System.out.println("Honor has updated their privacy policy");
	}
}
