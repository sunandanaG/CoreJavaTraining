package com.vm.trainee.java.oops.assignment;

public class Patient 
{
	private int PatientId;
	private String name;
	private int age;

	public Patient(int patientId, String name, int age) {
		super();
		PatientId = patientId;
		this.name = name;
		this.age = age;
	}

	public int getPatientId() {
		return PatientId;
	}

	public void setPatientId(int patientId) {
		PatientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



}
