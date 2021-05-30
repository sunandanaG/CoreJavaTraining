package com.vm.trainee.java.assignment;

public class MoneyCantWithdrawException extends Exception
{
   String message;

public MoneyCantWithdrawException(String message) {
	super();
	this.message = message;
}

@Override
public String toString() {
	return message;
}
   
}
