package io.learnstuff.sample;

public class Person_Professor extends AbstractPerson {

	void teach() {
		System.out.println("This professor is teaching");

	}

	@Override
	void work() {
		System.out.println("The professor is working");

	}
}
