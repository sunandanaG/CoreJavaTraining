package com.vm.trainee.java.IOstream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SampleEx {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		File f=new File("Details.txt");
		FileWriter fr=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fr);
		bw.write("ID"+"  "+"NAME"+"  "+"DEPT"+"\n");
		bw.newLine();

		Scanner sc=new Scanner(System.in);
		System.out.println("enter count of the details");
		int n=sc.nextInt();



		for(int i=0;i<n;i++)
		{
			System.out.println("ID");
			int id=sc.nextInt();
			System.out.println("NAME");
			String name=sc.next();
			System.out.println("DEPT");
			String dept=sc.next();

			bw.write(id);
			bw.write(" ");
			bw.write(name);
			bw.write(" ");
			bw.write(dept);
			bw.newLine();

			bw.flush();

		}
		System.out.println("values updated");



	}

}
