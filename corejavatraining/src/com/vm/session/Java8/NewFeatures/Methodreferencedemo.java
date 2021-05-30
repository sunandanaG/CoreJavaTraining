package com.vm.session.Java8.NewFeatures;

// ::
interface Validate
{
	void validatelogin();
}

class Car
{
	void mylogin()
	{
		System.out.println("you can login using credentials");
	}
}

class bus
{
	static void login()
	{
		System.out.println("this is login page");
	}
}
public class Methodreferencedemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Validate v=()->System.out.println("login validation");
		v.validatelogin();
		
		Car c=new Car();
	Validate v1= c:: mylogin;
	v1.validatelogin();
	
	Validate v2=bus::login;
	v2.validatelogin();
	}

}
