package com.vm.trainee.java.oops;

public class Bus implements Ivehicle {

	@Override
	public void steering() {
		// TODO Auto-generated method stub
		System.out.println("Power steering");
		
	}

	@Override
	public void brakes() {
		// TODO Auto-generated method stub
		System.out.println("volvo brakes");
	}

	@Override
	public int gears() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public void acceleration() {
		// TODO Auto-generated method stub
		System.out.println("based on weight");
	}

	@Override
	public void clutches() {
		// TODO Auto-generated method stub
		System.out.println("based on gears");
		
	}

}
