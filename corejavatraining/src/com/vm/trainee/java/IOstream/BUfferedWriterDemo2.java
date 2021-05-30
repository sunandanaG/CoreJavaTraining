package com.vm.trainee.java.IOstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BUfferedWriterDemo2 {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("suna.txt");
		BufferedReader br=new BufferedReader(fr);
  
		String read=br.readLine();
		while(read!=null)
		{
			System.out.println(read);
			read=br.readLine();
		}
	}

}
