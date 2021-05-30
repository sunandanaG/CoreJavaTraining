package com.vm.trainee.java.IOstream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FIleWriterDemo 
{
	public static void main(String[] args) throws IOException 
	{
//       File f=new File("suna.txt")
       FileWriter fw=new FileWriter(new File("suna.txt"));
       fw.write("hello");
       fw.close();
	}
}
