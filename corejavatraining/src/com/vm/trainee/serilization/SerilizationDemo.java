package com.vm.trainee.serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationDemo {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		Employee e=new Employee(21,"suna");
		
		
		FileOutputStream fis=new FileOutputStream("abc.ser");
		
		ObjectOutputStream cos=new ObjectOutputStream(fis);
		
		cos.writeObject(e);
		System.out.println("---serilization demo");
		

	}

}
