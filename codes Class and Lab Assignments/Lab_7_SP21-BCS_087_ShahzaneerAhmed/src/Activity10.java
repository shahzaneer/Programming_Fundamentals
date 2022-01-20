//Shahzaneer Ahmed
//SP21-BCS-087
//Activity-10
//        Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. For
//        example, if an integer is 932, the sum of all its digits is 14.
//        Enter a number between 0 and 1000: 999
//        The sum of the digits is 27

import java.util.Scanner;
public class Activity10 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000");
        int number = object.nextInt();


        int sum = 0;
        while(number!=0){
            int remainder = number % 10;
            number = number / 10;
            sum = sum + remainder;
    
        }

        System.out.println("The sum of the digits is = " + sum);

    }
}