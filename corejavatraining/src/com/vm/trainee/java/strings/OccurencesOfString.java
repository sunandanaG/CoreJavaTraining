package com.vm.trainee.java.strings;

import java.util.Scanner;

public class OccurencesOfString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
   
   
   String s="The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog";
   int count=0;
   String t[]=s.split(" ");
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the word:");
   String s1=sc.next();
   
   for(int i=0;i< t.length;i++)
   {
	   if(s1.equals(t[i]))
	   {
	   count++;
	   }
   }
   
System.out.println("the word"+s1+"occurs"+count+"times");
	}

}
