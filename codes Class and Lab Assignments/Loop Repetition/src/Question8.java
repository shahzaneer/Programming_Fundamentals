/* 
 * Name: Hunia Nadeem
 * Reg No:fa20-bcs-024 
 * Question 8: Given a sequence of non-negative integers, where each number is written in a separate line.
 * Determine the length of the sequence, where the sequence ends when the integer is equal to 0. Print the length of the sequence (not counting the integer 0). The numbers following the number 0 should be omitted.
 */

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		//input object created
		Scanner input= new Scanner(System.in);
		//variable declaration and initialization
		int number;				//for user input
		int length=0;			//for length of sequence
		int maxLength=0;		//for length of largest sequence
		//prompting user to enter integers
		System.out.print("Enter integers; -1 being the ending number: ");
		do {
			number=input.nextInt();
			//length will increase by 1 in all cases, except when number= 0 or -1
			length= (number !=0 && number != -1)? ++length:length;
			//when number =0 or -1, check for max length of sequence
			if (number == 0 || number == -1) {
				//if length of new sequence is greater than maxlength of sequence, then maxlength will be updated
				maxLength= Math.max(maxLength, length);
				//length of sequence is initialized to 0
				length=0;
			}	
		}while(number != -1); //loop terminate at number= -1
		//displaying length of longest sequence entered
		System.out.println("Length of largest sequence: "+maxLength);
	}

}
