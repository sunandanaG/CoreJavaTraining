package com.vm.session.Java8.NewFeatures;

@FunctionalInterface 
interface Calculator
{
	void addition(int a,int b);
}
interface Calculator1
{
	// method with return type
	int multiply(int a,int b);
}

interface Largest
{
	int large(int a,int b);
}



interface StringLength
{
	void length(String s);
}


interface Test4
{
	int sumofarray(int arr[]);
}

public class LamdeExpressionWithParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Calculator c= (a,b)->System.out.println(a+b);
      c.addition(2,4);
      
      
      //for calculator1 interface
      
      Calculator1 c1=(a,b)->a*b;
      System.out.println("multiplication:" +c1.multiply(2,4));
      
      
      Largest l=(a,b)->
      {
    	  if(a>b)
    		  return a;
    	  else
    		  return b;
      };
      System.out.println("largest value"+l.large(8,7));
      
      // for string
      
      
      StringLength s2=(s)->
      {
    	  System.out.println("length is:"+s.length());
		
      };
      
      s2.length("welcome");
      
      
      // for Array
      
      
	}

}
