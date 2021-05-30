package com.vm.trainee.java.Exceptionhandling;

public class LowBalanceException extends Exception {
	String message;
	LowBalanceException(String message)
	{
		this.message=message;
	}
	@Override
	public String toString() {
		return message;
	}

}
