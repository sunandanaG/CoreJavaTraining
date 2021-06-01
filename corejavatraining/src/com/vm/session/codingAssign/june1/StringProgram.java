package com.vm.session.codingAssign.june1;

import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) 
	{
		String str;
        int count=0;
         
        Scanner sc=new Scanner(System.in);
         
        System.out.print("Enter string: ");
        str=sc.nextLine();
         
        //word count
        for(int i=0; i<str.length()-1; i++)
        {
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
                count++;
        }
         
        System.out.println("Total number of words in string are: "+ (count+1));
        System.out.println("total number of characters are:"+str.length());
                     
    }
}