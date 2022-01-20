/* 
 * Name: Hunia Nadeem
 * Reg No:fa20-bcs-024 
 * Question 9: A sequence consists of integer numbers and ends with the number 0.
 * Determine the largest element of the sequence.
 * 
 * Question 10: sequence consists of integer numbers and ends with the number 0.
 * Determine the index of the largest element of the sequence. If the highest
 * element is not unique, print the index of the first of them.
 */

import java.util.Scanner;

public class Question9_10 {

	public static void main(String[] args) {
		//input object created
		Scanner input= new Scanner(System.in);
		//variable declaration and initialization
		int number;
		int max=0;
		int numIndex=0;		
		int indexOfMax=0;		 
		//prompting user to enter integers
		System.out.print("Enter integers; 0 being the ending number: ");
		do {
			number=input.nextInt();
			//index of number entered is generated
			++numIndex;
			//finding max number and storing its index in indexOfMax variable 
			if(number>max) {
				max=number;
				indexOfMax=numIndex;
			}
		}while(number != 0);		//loops terminates at number = 0
		//displaying max number and its index
		System.out.println("Maximum of sequence: "+max);
		System.out.printf("Index of %d: %d",max,indexOfMax);

	}

}
