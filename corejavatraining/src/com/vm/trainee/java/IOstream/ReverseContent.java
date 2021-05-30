package com.vm.trainee.java.IOstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;                //Write a program to read content from file, reverse the content and write the reversed content
//to the file. (
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReverseContent {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		File f = new File("D:\\SUNA\\numbers.txt");
		if(!f.exists())	
		f.createNewFile();
		String s="";
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine())
		{
			s=s+sc.nextLine();
		}
		String[] str = s.split(",");
	
		for(int i=0;i<str.length;i++)
		{
			if(Integer.parseInt(str[i])%2==0)
			{
				System.out.print(str[i]+" ");
			}		
		}
		sc.close();

	} 
	
}


