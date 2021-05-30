package com.vm.trainee.java.assignment;

public class BalanceIsLowException extends Exception
{
    String message;

	public BalanceIsLowException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}
    
}
