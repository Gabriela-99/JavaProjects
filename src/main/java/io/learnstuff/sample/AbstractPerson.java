package io.learnstuff.sample;

public abstract class AbstractPerson {

	void work() {

	}

	public static void main(String[] args) {

		Person_Janitor janitor = new Person_Janitor();
		Person_Student student = new Person_Student();
		Person_Professor professor = new Person_Professor();
		janitor.work();
		student.study();
		professor.work();
		professor.teach();

	}

}
