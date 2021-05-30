package com.vm.trainee.java.oops;

class A{
	static int i=1;
	A()
	{
		i++;
		System.out.println(i);
	}
	static void disp()
	{
		System.out.println(i);
	}
	public static class TestStatic 
	{
		public static void main(String[] args) 
		{
			A a=new A();
			A.disp();
		}
	}
}
