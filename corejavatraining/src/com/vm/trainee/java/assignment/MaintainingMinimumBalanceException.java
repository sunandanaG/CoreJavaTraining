package com.vm.trainee.java.assignment;

public class MaintainingMinimumBalanceException extends Exception
{
   String message;

public MaintainingMinimumBalanceException(String message) 
{
	super();
	this.message = message;
}

@Override
public String toString() {
	return  message;
}

   
}
