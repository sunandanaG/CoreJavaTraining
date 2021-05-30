package com.vm.trainee.java.Exceptionhandling;


class Training
{
	void train() throws Exception
	{
		System.out.println("zero Knowledge");
	}
}
public class ThrowsTest {

	public static void main(String[] args) 
	{
		// Main method is not handling the exception.JVM will take care
		Training training=new Training();
		try 
		{
			training.train();// main method is calling train method so we have to implement it with try catch or throws 
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
