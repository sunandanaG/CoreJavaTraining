package com.vm.trainee.java.Exceptionhandling;
import java.io.*;
public class FileNotFoundTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("D://suna.txt");
		FileInputStream fis=null;
		try {
			 fis=new FileInputStream(file);
			while(fis.read()!=-1)
			{
				System.out.println(fis.read());
			}
		}
			catch(FileNotFoundException e)
			{

			}

			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
finally {
	try
	{
		fis.close();
	}
	catch(IOException e)
	{
		e.printStackTrace();
		}
}
		}

	}
