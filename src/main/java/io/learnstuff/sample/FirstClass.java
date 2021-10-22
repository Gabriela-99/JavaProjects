package io.learnstuff.sample;

import java.util.Scanner;

public class FirstClass {
	
	static Scanner sc= new Scanner (System.in);

	public static void main(String[] args) {
		
		System.out.println("Hello world!!");
		System.out.print("x=");
		int x=sc.nextInt();
		System.out.print("y=");
		int y=sc.nextInt();
		int sum;
		sum= x+y;
		System.out.println("Suma numerelor este " +sum);
		
		String[] array=new String[] {"JavaScript" , "PHP", "Linux"};
		 for(int i=0; i<array.length; i++)
		 {
			 System.out.println(array[i]);
		 }
		

	}

}