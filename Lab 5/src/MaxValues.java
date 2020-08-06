/* Lab 5 - Exercise 1
 * a) Create a text file called "input.csv" which contains the following three
 *  lines of numbers, separated by commas:
 *  1,4,6,7,8
 *  2,3,1,5,6
 *  3,2,1,4,5
 * b) Write a program that reads the file you created (make sure it's in the right
 *  folder) and outputs to the screen the largest number in each row. 
 *  The output should looks like this: 
 *  Maximum values
 *  ROW 1: 8
 *  ROW 2: 6
 *  ROW 3: 5
 */

import java.util.Scanner;
import java.io.*;

public class MaxValues {

	public static void main(String args[]) throws FileNotFoundException {
		// Scanning the csv file to pull values from
		Scanner scan = new Scanner(new File("input.csv"));

		// Initializing the variables
		int max = 0;
		int count = 1;
		String row = " ";

		System.out.println("Maximum values");

		// Creating a while loop to scan for each line of the .csv file and print the
		// max
		while (scan.hasNext()) {
			// Scanning each row
			row = scan.nextLine();
			// Splitting the row by each comma
			String[] a = row.split(",");
			max = 0;
			// This for loop parses each row for the max and and assigns it
			for (int i = 0; i < a.length; i++) {
				if (Integer.parseInt(a[i]) > max)
					max = Integer.parseInt(a[i]);
			}
			// Printing out the max for each row
			System.out.println("ROW " + count + ": " + max);
			count++;
		}
		scan.close();
	}
}
