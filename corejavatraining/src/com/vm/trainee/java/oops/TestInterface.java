package com.vm.trainee.java.oops;

public class TestInterface {
	public static void main(String[] args) {
		//		Ivehicle vehicle=new Car(); // abstraction and loose coupling
		//		vehicle.acceleration();
		//		vehicle.brakes();

		Car car =new BMW("siri");
		car.ac();
		car.indicators();
		car.brakes();
		car.acceleration();
		Car c=new TATA("sunandana");
		c.ac();
		c.indicators();
		c.brakes();
	}

}
