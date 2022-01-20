/* 
 * Name: Hunia Nadeem
 * Reg No:fa20-bcs-024 
 * Question 13: Write a program that reads an unspecified number of integers, determines how many
 * positive and negative values have been read, and computes the total and average of the input
 * values (not counting zeros). Your program ends with the input 0. Display the average as a
 * floating-point number.
 */

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		//input object created
		Scanner input = new Scanner(System.in);
		//variable declaration and initialization
		int number;
		float sum=0f;
		int count=0;
		int countPos=0;		//count for positive numbers
		int countNeg=0;		//count for negative numbers
		//prompting user to enter integers
		System.out.print("Enter an integer, the input ends if it is 0: ");
		do {
			number = input.nextInt();
			//countPos increments by 1 if number is positive...
			if(number > 0)
				countPos++;
			//...otherwise countNeg is incremented by 1 for negative numbers
			else if (number < 0)
				countNeg++;
			//entered numbers are counted except 0
			count= (number!=0 )? count+1:count;
			//sum of entered numbers
			sum+=number;
		}while(number != 0);		//loops end at number = 0
		//average calculation
		float average = sum / count;
		//displaying required output
		System.out.println("The number of positives is: "+countPos);
		System.out.println("The number of negatives is: "+countNeg);
		System.out.println("The total is: "+sum);
		System.out.println("The Average is: "+average);
	}

}
