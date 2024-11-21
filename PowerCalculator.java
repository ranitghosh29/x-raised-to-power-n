//Calculate Power of a Number: Write a program to calculate x raised to the power n.


package javaproject;

import java.util.Scanner;

public class PowerCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// take input base and exponent
		
		 System.out.println("Enter the base (x):");
		 int base = scanner.nextInt();
		
		System.out.println("Enter the expeonent (n): ");
		int exponent = scanner.nextInt();
		
		//calculate the power
		
		int result =base *(exponent*exponent);
		
		
		System.out.println("The power is " + result);


	}

}
