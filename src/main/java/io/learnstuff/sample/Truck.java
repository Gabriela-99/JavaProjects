package io.learnstuff.sample;

public class Truck extends Vehicles implements MotorVehicle {
	boolean motor = true;

	public void motor() {
		System.out.println("This vehicle might polutte");

	}

}
