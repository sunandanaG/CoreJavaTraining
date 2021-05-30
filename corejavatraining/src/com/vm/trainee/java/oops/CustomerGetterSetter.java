package com.vm.trainee.java.oops;

public class CustomerGetterSetter 
{
  public static void main(String[] args) {
	Customer cust=new Customer();
	cust.setId(121);
	cust.setFirstName("suna");
	cust.setLastName("siri");
	
	System.out.println(cust.getId()+""+cust.getFirstName()+""+cust.getLastName());
	
}
}
