/* 
 * Name: Hunia Nadeem
 * Reg No:fa20-bcs-024 
 * Question 6: Factorial: For the given integer n calculate the value n!
 */

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		//input object created
		Scanner input = new Scanner(System.in);
		//prompting user to enter an integer
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		//variable declaration and initialization
		int prod=1;
		int numToBeReduced=number;
		//loop terminated when number is reduced to 0
		while(numToBeReduced != 0) {
			prod*=numToBeReduced;				//prod stores product of number and number-1, till number=1 
			numToBeReduced--;
		}
		//displaying factorial
		System.out.printf("Factorial of %d: %d", number, prod);

	}

}
