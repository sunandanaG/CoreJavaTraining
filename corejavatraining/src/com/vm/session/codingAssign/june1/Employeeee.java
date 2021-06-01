package com.vm.session.codingAssign.june1;

public class Employeeee {

	private String firstName;
	private String lastName;
	public Employeeee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	void Validation() throws Exception
	{
		if(firstName==null && lastName==null )
		{
			throw new  NullPointerException("Entry Missing");
		}

		if(firstName.length()<3 && lastName.length()<3  )
		{
			throw new Exception("name should be minimum 3 character");
		}
	}

}
