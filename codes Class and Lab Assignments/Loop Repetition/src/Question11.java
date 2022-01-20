/* 
 * Name: Hunia Nadeem
 * Reg No:fa20-bcs-024 
 * Question 11: the number of even elements in the sequence ending with the number 0.
 */

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		//input object created
		Scanner input= new Scanner(System.in);
		//variable declaration and initialization
		int number;
		int countOfEven=0;
		//prompting user to enter integers
		System.out.print("Enter integers; 0 being the ending number: ");
		do {
			number=input.nextInt();
			//finding even number's count
			if(number%2==0 && number!=0) 
				countOfEven+=1;
		}while(number != 0);		//loop terminates at number = 0
		//Displaying count of even numbers entered
		System.out.println("Number of even elements in sequence: "+countOfEven);

	}

}
