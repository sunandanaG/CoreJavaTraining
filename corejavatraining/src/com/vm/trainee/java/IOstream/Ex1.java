package com.vm.trainee.java.IOstream;


//Create a file named as “numbers.txt” which should contain numbers from 0 to 10 delimited by
//comma. Write a program to read data from numbers.txt using Scanner class API and display only
//even numbers in the console.

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		try {
			String s ="";
			File f = new File("suna.txt");
			FileReader fr = new FileReader(f);
			int read = fr.read();
			while(read!= -1)
			{
				s=s+(char)read;
				read=fr.read();
			}
			fr.close();
			StringBuffer sb = new StringBuffer(s);
			String s1 = sb.reverse().toString();
			FileWriter fw = new FileWriter(f);
			fw.write(s1);
			fw.flush();
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

