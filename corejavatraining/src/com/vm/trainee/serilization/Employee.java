package com.vm.trainee.serilization;

import java.io.Serializable;

public class Employee implements Serializable 
{

	int id;
	String name;
	static String dept;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
