package com.vm.trainee.java.MultiThreading;

class Employee extends Thread
{
	public void run()
	{
		System.out.println("task of employee");
	}
}
class Student implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("task of student");
	}
	
}
public class CreateDemo 
{
	public static void main(String[] args) {
		Employee e=new Employee();
		e.start();
		Student s=new Student();
		Thread t=new Thread(s);// we use this when we implement runnable
		t.start();
	}

}
