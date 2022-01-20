// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Question-9:
//        An ISBN-10 (International Standard Book Number) consists of 10 digits: d1d2d3d4d5d6d7d8d9d10.
//        The last digit, d10, is a checksum, which is calculated from the other nine digits using the
//        following formula:
//        If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention. Write a
//        program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN (including
//        leading zeros). Your program should read the input as an integer.

import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
        System.out.println("Enter first 9 digits of ISBN number : ");
        System.out.println("Enter 1st digit :");
        int d1 = obj.nextInt();
        System.out.println("Enter 2nd Digit :");
        int d2 = obj.nextInt();
        System.out.println("Enter 3rd Digit :");
        int d3 = obj.nextInt();
        System.out.println("Enter 4th Digit :");
        int d4 = obj.nextInt();
        System.out.println("Enter 5th Digit :");
        int d5 = obj.nextInt();
        System.out.println("Enter 6th Digit :");
        int d6 = obj.nextInt();
        System.out.println("Enter 7th Digit :");
        int d7 = obj.nextInt();
        System.out.println("Enter 8th Digit :");
        int d8 = obj.nextInt();
        System.out.println("Enter 9th Digit :");
        int d9 = obj.nextInt();

        int checkSum = (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9) % 11;


        if (checkSum == 10)  System.out.printf("the number is : %d%d%d%d%d%d%d%d%dX",d1,d2,d3,d4,d5,d6,d7,d8,d9);
        else                 System.out.printf("the number is : %d%d%d%d%d%d%d%d%d1",d1,d2,d3,d4,d5,d6,d7,d8,d9);




    }
}
