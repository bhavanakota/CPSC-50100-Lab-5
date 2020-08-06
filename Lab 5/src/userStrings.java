/* Lab 5 -  Exercise 2
 * Write a program that reads strings from the user and writes them to an output 
 * file called userStrings.txt. 
 * Terminate processing when the user enters the string "DONE". 
 * Do not write the sentinel string to the output file.
 */

import java.io.*;
import java.util.Scanner;

public class userStrings {

	public static void main(String[] args) throws IOException {

		// Invoking the scanner system and creating the new .txt file to export to
		Scanner scan = new Scanner(System.in);
		FileWriter file = new FileWriter("userStrings.txt");

		// Line to enter string and scan
		System.out.println("Enter your string. Enter DONE when finished.");
		String user = scan.nextLine();

		// Creating this while loop to continuously keep printing to the .txt file and
		// only ending once DONE is entered.
		while (!user.equals("DONE")) {
			file.write(user);
			System.out.println("Enter your string. Enter DONE when finished.");
			user = scan.nextLine();
			// Added the "IgnoreCase" to make the program take both methods of DONE.
			if (user.equalsIgnoreCase("DONE")) {
				break;
			}
		}
		scan.close();
		file.close();
	}
}
