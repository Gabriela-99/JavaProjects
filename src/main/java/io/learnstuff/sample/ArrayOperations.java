package io.learnstuff.sample;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

	public static void main(String[] args) {
		// 1.array number & string

		int[] numbers = { 15, 16, 21, 33 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " se afla pe pozitia " + (i + 1));
		}
		System.out.println();

		String[] names = { "Davin", "Roger", "Antoinette", "Paul" };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(names[i] + " se afla pe pozitia " + (i + 1));
		}

		// 2. array from keyboard

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.print("How many numbers do you want to enter?"); int length =
		 * scanner.nextInt(); int[] myArray = new int[length];
		 * System.out.println("Enter the elements of the array:");
		 * 
		 * for (int i = 0; i < length; i++) { myArray[i] = scanner.nextInt(); }
		 * 
		 * System.out.println("You entered the numbers: " + Arrays.toString(myArray));
		 */

	}

}
