package com.vm.trainee.java.Exceptionhandling;

public class ExceededmaxNoOfDays extends Exception
{
	String refund;
	
	public ExceededmaxNoOfDays(String refund) {
		super();
		this.refund = refund;
	}

	@Override
	public String toString() {
		return refund;
	}

	

}
