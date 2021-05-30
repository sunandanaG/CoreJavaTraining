package com.vm.trainee.java.strings;

public class StringObjectCreation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1=new String("Value Momentum");  // Reference variables are stored in stack
		String s="Value Momentum";
       
		System.out.println(s1==s); // false -It checks whether the object references are same or not
		System.out.println(s1.equals(s)); //true- It checks whether the content is same or not
		
		System.out.println(s1.concat("sudaksha"));
		s1=s1.concat("sudaksha");
		System.out.println(s1);
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.charAt(4));// indexing starts from '0'.
		
		System.out.println(s.compareTo(s1)); // it returns the count of the letters which are not in common
		// Here(s<s1) so output is ----->-8 along with the count
		//i f(s1>s) ---->returns +ve value
		// if(s1==s) -----> returns -ve value along with the count
		
		System.out.println(s1.intern());
		System.out.println(s1.intern()==s.intern());// the content were not same so returned '0'
		
		String s3="suna";
		System.out.println(s3.compareToIgnoreCase(s));// it returns the count of characters that were same
		// if(s==s3) --> if they have same content then return '0'.
		//i f(s>s3) ---->returns +ve value
		// if(s3<s) -----> returns -ve value along with the count
		
		
		System.out.println(s.contains(s1));// the whole s1 string(value momentum sudaksha) should be in String(s) if not it returns FALSE
		// IF YES returns TRUE
		
		
		System.out.println(s1.endsWith("a")); // if it ends with particular letter/String that is mentioned -->returns TRUE
		
		System.out.println();
		
		
//		ASSIGNMENT 1
		String S=" Value Momentum ";
		String str=S.replaceAll("\\s","");// 
		System.out.println(str);
		
		
		
      StringBuilder sb=new StringBuilder("XYZ");
      sb.append("ABC");
      System.out.println(sb);
      
     System.out.println(S.indexOf(s));
     System.out.println(s.startsWith("V"));
     System.out.println(s.endsWith("a"));
     System.out.println(s3.replaceFirst("su","or"));
		
		
		}

}
