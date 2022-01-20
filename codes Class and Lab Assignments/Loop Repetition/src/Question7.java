/* 
 * Name: Hunia Nadeem
 * Reg No:fa20-bcs-024 
 * Question 7: Given N numbers: the first number in the input is N, after that N integers are
 * given. Count the number of zeros among the given integers and print it. You need to
 * count the number of numbers that are equal to zero, not the number of zero digits.
 */

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		//input object created
		Scanner input= new Scanner(System.in);
		//variable declaration and initialization
		int number;
		int count=0;
		//prompting user to enter integers
		System.out.print("Enter integers; 1st being n integers to be summed: ");
		//stores the 1st integer that is n number of integers to be added
		int numberOfEntries = input.nextInt();
		//loop for getting n integers from user and counting zeros
		for(int i=1; i<=numberOfEntries; i++) {
			number = input.nextInt();
			if (number == 0)
				count++;
		}
		//displaying number of zeros entered
		System.out.println("Total zeros entered: "+count);

	}

}
