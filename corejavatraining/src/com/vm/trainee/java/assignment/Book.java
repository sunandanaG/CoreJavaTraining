package com.vm.trainee.java.assignment;

abstract class Book //Assessment 24

{
	String title; 
	abstract void setTitle(String s); 
	String getTitle()
	{ 
		return title;

	}
}
class MyBook extends Book
{
	void setTitle(String s)
	{
		System.out.println("The title of the book is:"+s);
	}
}
