package com.vm.trainee.java.Exceptionhandling;

public class ProductDamagedException extends Exception
{
	String DamagedProductName;

	public ProductDamagedException(String damagedProductName) {
		super();
		DamagedProductName = damagedProductName;
	}

	@Override
	public String toString() {
		return DamagedProductName;
	}

	
}
