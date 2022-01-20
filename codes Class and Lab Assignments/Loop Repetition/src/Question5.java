/* 
 * Name: Hunia Nadeem
 * Reg No:fa20-bcs-024 
 * Question 5: For the given integer N calculate the following sum: 1^3+2^3+…+N^3
 */

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		//input object created
		Scanner input = new Scanner(System.in);
		//variable declaration and initialization
		int sum=0;
		//prompting user to enter an integer
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		//loop for calculating cube of sum from 1 to number entered
		for(int i=1; i<=number; i++) {
			sum+= Math.pow(i, 3);		//sum = sum + i^3
		}
		//displaying output
		System.out.printf("Sum of cube from 1 to %d: %d\n", number, sum);
	}

}
