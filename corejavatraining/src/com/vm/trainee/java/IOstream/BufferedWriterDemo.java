
package com.vm.trainee.java.IOstream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		FileWriter f=new FileWriter("suna.txt");
		BufferedWriter bw=new BufferedWriter(f);
		
      bw.write("welcome");
      bw.newLine();
      bw.write("java");
      
      bw.flush();
      bw.close();
	}

}
