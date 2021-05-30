package com.vm.trainee.java.Exceptionhandling;

public class ProductDidntReceiveException extends Exception
{
	String message;

	public ProductDidntReceiveException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}
  
}
