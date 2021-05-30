package com.vm.trainee.java.assignment;

public class AverageMonthlyBalanceException extends Exception
{
  String message;

public AverageMonthlyBalanceException(String message) {
	super();
	this.message = message;
}

@Override
public String toString() {
	return message;
}
  
}
