package com.vm.session.Java8.NewFeatures;


interface Test
{
	void display();
}
public class LambdaDemo 
{
  public static void main(String[] args) {
	
	  Test t= ()->
	  {
		  System.out.println("hello");
		  System.out.println("java");
	  };
	  t.display();
	  
//	  for single line body
	  
	  
	  Test t1=()->System.out.println("hello single line");
	  t1.display();
}
}
