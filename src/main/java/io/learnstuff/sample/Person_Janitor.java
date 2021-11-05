package io.learnstuff.sample;

public class Person_Janitor extends AbstractPerson {

	void mopping() {

	}

	void monitor() {
		System.out.println("This janitor is monitoring the build");

	}

	@Override
	void work() {
		System.out.println("The janotor is working");

	}

}
