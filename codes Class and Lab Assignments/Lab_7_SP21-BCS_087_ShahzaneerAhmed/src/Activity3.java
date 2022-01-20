//Shahzaneer Ahmed
//SP21-BCS-087
//Activity-3
//        Suppose you want to develop a program that changes a given amount of money into smaller monetary
//        units. The program lets the user enter an amount as a double value representing a total in dollars and
//        cents, and outputs a report listing the monetary equivalent in the maximum number of dollars, quarters,
//        dimes, nickels, and pennies, in this order, to result in the minimum number of coins
//        Here are the steps in developing the program:
//        1. Prompt the user to enter the amount as a decimal number, such as 11.56.
//        2. Convert the amount (e.g., 11.56) into cents (1156).
//        3. Divide the cents by 100 to find the number of dollars. Obtain the remaining cents using the cents
//        remainder 100.
//        4. Divide the remaining cents by 25 to find the number of quarters. Obtain the remaining cents
//        using the remaining cents remainder 25.
//        5. Divide the remaining cents by 10 to find the number of dimes. Obtain the remaining cents using
//        the remaining cents remainder 10.
//        6. Divide the remaining cents by 5 to find the number of nickels. Obtain the remaining cents using
//        the remaining cents remainder 5.
//        7. The remaining cents are the pennies.
//        8. Display the result.
//        You are required to implement the above steps 1-8 in JAVA language

import java.util.Scanner;
public class Activity3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter Amount : ");
        double amount = input.nextDouble();										//obtain cents
        double cents= amount*100;
        int cent1 = (int)(cents);
        System.out.println("Cents are : "+cent1);								//obtain dollar
        double $dollar = cents / 100;
        int dollar = (int)($dollar);
        System.out.println("Dollar : "+ dollar);
        double remaining_cents1 = cents % 100;
        System.out.println("Remaining cents are : "+ remaining_cents1);			//obtain quater
        double quaters = remaining_cents1 / 25;
        int quater1 = (int)(quaters);
        System.out.println("Quaters are : "+ quater1);
        double remaining_cents2 = remaining_cents1 % 25 ;
        System.out.println("Remaining cents are : "+remaining_cents2); 			//obtain dimes
        double dimes = remaining_cents2 / 10 ;
        int dime1=(int)(dimes);
        System.out.println("Dimes are : "+dime1);
        double remaining_cents3 = remaining_cents2 % 10;
        System.out.println("Remaining cents are : "+remaining_cents3);			//obtain nickels
        double nickels = remaining_cents3 / 5 ;
        int nickel1 =(int)(nickels);
        System.out.println("Nickels are : "+nickel1);
        double pennies = remaining_cents3 % 5;
        System.out.println(" Your pennies are = " + pennies);






    }
}
