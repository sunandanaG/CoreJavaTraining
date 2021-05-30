package com.vm.trainee.java.oops;

public class TestAssociation {
public static void main(String[] args) // using aggregation
{
	showAggregation();
	showComposition();
}
 static void showAggregation()
 {
	 
	 Address adress=new Address();
	 adress.setCity("hyd");
	 adress.setCountry("India");
	 adress.setState("telangana");
	 
	 
	 Emp emp=new Emp();
	 emp.setId(1001);
	 emp.setName("suna");
	 emp.setAdress(adress);
	 
	System.out.println(emp);
	 
	 
	 emp=null;// to check aggregation 
	 System.out.println(emp);
	 System.out.println(adress);
	 
 }
 static void showComposition()
 {
	 
	 Address adress=new Address();
	 adress.setCity("rjy");
	 adress.setState("AndhraPradesh");
	 adress.setCountry("india");
	 
	 PersonCom pers=new PersonCom();
	 pers.setId(2001);
	 pers.setfName("siri");
	 pers.setlName("ghanta");
	 pers.setAddress(adress);
	 System.out.println(pers);
 }
}
