package com.vm.trainee.java.oops;

public class InheritDetails extends Inheritance
{
	
	String email;
	String contact;
	public InheritDetails(int empid, String ename, String edept, String email, String contact) {
		
		
		// super() the values are inherited from inheritance.java file as we are extending it.
		
		super(empid,ename, edept);
		//this.id = id;
		//this.name = name;
		//this.edept = edept;
		this.email = email;
		this.contact = contact;
	}
	
	public String toString()
	{
		return empid+" "+ename+" "+edept+" "+email+" "+contact;
		
	}
	public static void main(String[] args) {
		
		InheritDetails in=new InheritDetails(100,"suna","cse","a@b.com","98765");
		System.out.println(in);
	}

}
