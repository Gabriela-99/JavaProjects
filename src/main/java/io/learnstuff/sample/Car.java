package io.learnstuff.sample;

public class Car extends Vehicles implements MotorVehicle, EcoVehicle {

	public void eco() {
		System.out.println("This car doesn't polutte");

	}

	public void motor() {
		System.out.println("This car might create polution");

	}
}
