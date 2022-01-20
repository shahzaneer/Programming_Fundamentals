/* 
 * Name: Hunia Nadeem
 * Reg No:fa20-bcs-024 
 * Question 1: Given two integers A and B (A <= B). Print all numbers from A to B
 * inclusively.
 * 
 * Question 2: Given two integers A and B. Print all numbers from A to B
 * inclusively, in ascending order, if A < B, or in descending order,
 * if A >= B
 * 
 * Question 3: 10 numbers are given in the input. Read them and print their
 * sum. Use as few variables as you can.
 */

import java.util.Scanner;

public class Question1_2_3 {

	public static void main(String[] args) {
		//input object created
		Scanner input = new Scanner(System.in);
		//variable declaration and initialization
		int a,b;
		
		//Question 1:
		System.out.println("Question 1:");
		do {
			//prompting user to enter integers
			System.out.print("Enter 2 integers: ");
			a = input.nextInt();
			b = input.nextInt();
		}while(a>b);//continue taking input if a>b
		//displaying output from a to b (a<=b)
		for (int i=a; i<=b; i++)
			System.out.print(i+" ");
		
		//Question 2:
		System.out.println("\n\nQuestion 2:");
		//prompting user to enter integers
		System.out.print("Enter 2 integers: ");
		a = input.nextInt();
		b = input.nextInt();
		if (a<b) {
			//displaying output in ascending order (a<=b)
			System.out.println("Ascending Order:");
			for (int i=a; i<=b; i++) {
				System.out.print(i+" ");
			}
		}
		else {
			//displaying output in descending order (a>b)
			System.out.println("Descending Order:");
			for (int i=a; i>=b; i--) {
				System.out.print(i+" ");
			}
		}
		
		//Question 3:
		System.out.println("\n\nQuestion 3:");
		//variable declaration and initialization
		int sum=0;
		int num;
		for (short i=1; i<=10; i++) {
			//prompting user to enter 10 integers
			System.out.printf("Enter number %d: ",i);
			num = input.nextInt();
			//sum is calculated
			sum+=num;	
		}
		//displaying sum of 10 user entered integers
		System.out.println("Sum of 10 number: "+sum);

	}

}
