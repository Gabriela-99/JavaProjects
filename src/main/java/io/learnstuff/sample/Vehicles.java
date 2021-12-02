package io.learnstuff.sample;

public class Vehicles {
	public static void main(String[] args) {

	}

}

class Car extends Vehicles implements Engine, EcoVehicle {

	public void fuelFree() {
		System.out.println("This car doesn't polutte");

	}

	public void Start() {
		System.out.println("This vehicle started the egine");

	}

}

class Bicycle extends Vehicles implements EcoVehicle {

	public void fuelFree() {
		System.out.println("The bicycle is an ecological vehicle");

	}

}

class Motorbike extends Vehicles implements Engine {

	public void Start() {
		System.out.println("This vehicle started the egine");

	}

}

class Truck extends Vehicles implements Engine {
	boolean engine = true;

	public void Start() {
		System.out.println("This vehicle started the egine");

	}

}