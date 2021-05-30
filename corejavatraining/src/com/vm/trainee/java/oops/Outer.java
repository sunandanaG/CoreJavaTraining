package com.vm.trainee.java.oops;

class Outer //when the class is final we cannot inherit/extend it
{
	static int i=100;
	void show()
	{
		//	  i=2;  we cannot change value of final variable
		System.out.println(i);
		//	  display(); outer class cannot access inner(X) class
	}


class Inner
{
	             //	void show() we can override final method
	int a=200;
	void display()
	{
		show();
		System.out.println(a);//inner class can access all the outer class properties
	}
}
}