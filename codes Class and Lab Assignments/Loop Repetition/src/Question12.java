/* 
 * Name: Hunia Nadeem
 * Reg No:fa20-bcs-024 
 * Question 12: A sequence consists of integer numbers and ends with the number
 * 0. Determine how many elements of this sequence are greater than their neighbours above.
 */

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		//input object created
		Scanner input= new Scanner(System.in);
		//variable declaration and initialization
		int number;
		int prevNumber=0;
		int count=-1;
		//prompting user to enter integers
		System.out.print("Enter integers; 0 being the ending number: ");
		do {
			number=input.nextInt();
			//counting if entered number is greater than the previously entered number
			if((number > prevNumber) && (number != 0)) 
				count++;	
			//new entered number becomes previous number at end of each iteration
			prevNumber=number;
		}while(number != 0);		//loop ends at number = 0
		//displaying required output
		System.out.println("Elements greater than their neighbour above: "+count);

	}

}
