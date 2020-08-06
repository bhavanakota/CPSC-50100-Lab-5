/* Lab 5 -  Exercise 3
 * Design and implement a program that implements Euclid's algorithm for finding the greatest 
 * common divisor of two positive integers. The greatest common divisor is the largest 
 * integer that divides both values without producing a remainder. In a class called 
 * DivisorCalc, define a static method called gcd that accepts two integers, num1 and num2.
 *  Create a driver program inside the main method to test your implementation. 
 *  The recursive algorithm is defined as follows:
 *  	gcd(num1, num2) is num2 if num2 <= num1 and num2 divides num1 
 *  	gcd(num1, num2) is gcd(num2, num1) if num1 < num2
 *  	gcd(num1, num2) is gcd(num2, num1%num2) otherwise
 */

import java.util.Scanner;

public class DivisorCalc {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Creating num1 variable and inputting a value to it
		System.out.print("Enter the first value greater than 0: ");
		int num1 = scan.nextInt();

		// Adding a while loop to make sure num1 is greater than 0 and prompting the
		// user if it's not
		while (num1 < 0) {
			System.out.println("Invalid value - should be greater than 0. \n");
			System.out.print("Enter the first value greater than 0: ");
			num1 = scan.nextInt();
		}

		// Creating the num2 variable and inputting a value to it
		System.out.print("Enter the second value greater than 0: ");
		int num2 = scan.nextInt();

		// Adding a while loop again to make sure num2 is greater than 0 and prompting
		// the user if it's not
		while (num2 < 0) {
			System.out.println("Invalid value - should be greater than 0 \n");
			System.out.print("Enter the first value greater than 0: \n");
			num2 = scan.nextInt();
		}

		// Printing out the final product and the gcd
		System.out.println("The gcd of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));

		scan.close();
	}

	// Creating the static int gcd
	public static int gcd(int num1, int num2) {

		// This is if num2 is less than num1 and the remainder of num1/num2 is equal to
		// 0, then num2 value is returned
		if (num2 <= num1 && num1 % num2 == 0) {
			return num2;
		}
		// If num1 is less than num2, then the gcd is taken of these two values
		if (num1 < num2) {
			return gcd(num2, num1);
			// For every other condition, return the gcd 
		} else {
			return gcd(num2, num1 % num2);
		}
	}
}
