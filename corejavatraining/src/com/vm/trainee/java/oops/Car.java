package com.vm.trainee.java.oops;

public abstract class Car implements Ivehicle {


	// creating constructor
	String model;
	Car(String model)
	{
		this.model=model;
	}
	@Override
	public void steering() {
		// TODO Auto-generated method stub
		System.out.println("power steering");
	}

	@Override
	public void brakes() {
		// TODO Auto-generated method stub
		System.out.println("disk brakes");
	}

	@Override
	public int gears() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public void acceleration() {
		// TODO Auto-generated method stub
		System.out.println("No idea");

	}

	@Override
	public void clutches() {
		// TODO Auto-generated method stub
		System.out.println("based on gears");

	}
	abstract void ac();
	abstract void indicators();

	//	void ac() {}
	//	void indicators() {}

}
