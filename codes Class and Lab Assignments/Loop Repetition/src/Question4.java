/* 
 * Name: Hunia Nadeem
 * Reg No:fa20-bcs-024 
 * Question 4: N numbers are given in the input. Read them and print their
 * sum. The first line of input contains the integer N, which is the 
 * number of integers to follow. Each of the next N lines contains one 
 * integer. Print the sum of these N integers.
 */

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		//input object created
		Scanner input = new Scanner(System.in);	
		//variable declaration and initialization
		int num;
		int sum=0;
		//prompting user to enter integers
		System.out.print("Enter integers; 1st being n integers to be summed: ");
		//stores the 1st integer that is n number of integers to be added
		int numberOfEntries = input.nextInt();
		//loop for getting n integers from user and summing them
		for(int i=1; i<=numberOfEntries; i++) {
			num = input.nextInt();
			sum+=num;	//sum calculated
		}
		//displaying output
		System.out.printf("Sum of %d integers: %d", numberOfEntries, sum);

	}

}
