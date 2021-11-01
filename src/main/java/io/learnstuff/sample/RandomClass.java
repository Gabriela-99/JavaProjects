package io.learnstuff.sample;

public class RandomClass {

	public static void main(String[] args) {
		// generate a random arrays of numbers and search for a specific one

		/*
		 * System.out.println();
		 * System.out.println("Enter the number you want to search"); Scanner sc = new
		 * Scanner(System.in); int num = sc.nextInt();
		 * 
		 * Random r = new Random(); // creating Random object int[] arr = new int[5]; //
		 * generate numbers between 0 & 100 int l = 0; int h = 100; for (int i = 0; i <
		 * arr.length; i++) { arr[i] = r.nextInt(h - l) + l; // storing random integers
		 * in an array System.out.println(arr[i]); // printing each array element }
		 * 
		 * boolean found = false;
		 * 
		 * String indices = "";
		 * 
		 * for (int i = 0; i < arr.length; i++) { if (num == arr[i]) { found = true;
		 * indices = indices + (i + 1) + ", "; } } if (found == false) {
		 * System.out.println(num + " does not exist"); } else { System.out.println(num
		 * + " found at index: " + indices.substring(0, indices.length() - 2)); }
		 * 
		 * sc.close();
		 */

		// For a given array, reverse the order of the elements

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.print("How many numbers do you want to enter?"); int length =
		 * scanner.nextInt(); int[] myArray = new int[length];
		 * System.out.println("Enter the elements of the array:");
		 * 
		 * for (int i = 0; i < length; i++) { myArray[i] = scanner.nextInt();
		 * 
		 * }
		 * 
		 * System.out.println("You entered the numbers: " + Arrays.toString(myArray));
		 * 
		 * for (int i = 0; i < myArray.length / 2; i++) { int temp = myArray[i];
		 * myArray[i] = myArray[myArray.length - i - 1]; myArray[myArray.length - i - 1]
		 * = temp; } System.out.println("The reverse is: " + Arrays.toString(myArray));
		 */

	}

}
