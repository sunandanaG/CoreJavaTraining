package com.vm.trainee.java.oops;

public class Inheritance
{
	int empid;
	 String ename;
	 String edept;
	
	Inheritance()
	{
		
	}
	public Inheritance(int empid,String ename,String edept)
	{
		this.empid=empid;
		this.ename=ename;
		this.edept=edept;
	}
/*	using explicit method 
	void show()
	{
		System.out.println(empid+""+ename+""+edept);
	} */
	
	
	//using object method
	/*public String toString()
	{
		return "the empid is"+empid +""+ename+""+edept;
	}*/
	public static void main(String[] args) 
	{
		Inheritance h=new Inheritance();
		//h.show();
		Inheritance h1=new Inheritance(100,"suna","cse");
		//h1.show();
		
		System.out.println(h);
		System.out.println(h1);
		
	}
}
