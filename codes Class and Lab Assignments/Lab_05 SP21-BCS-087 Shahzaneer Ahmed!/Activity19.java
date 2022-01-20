//Shahzaneer Ahmed
//SP21-BCS-087
//LAB 04


//Activity-19
//        Software Sales
//        A software company sells a package that retails for $99. Quantity discounts are given
//        according to the following table:
//        Write a program that asks the user to enter the number of packages purchased. The
//        program should then display the amount of the discount (if any) and the total amount of
//        the purchase after the discount.

import java.util.Scanner;
public class Activity19 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int packagePrice = 99;
        System.out.println("Enter the no of packages purchased to get the amount of discount :");
        int noPackages = obj.nextInt();


        int originalAmount = packagePrice*noPackages;
        double discountedAmount_20 = originalAmount-(originalAmount*0.2);
        double discountedAmount_30 = originalAmount-(originalAmount*0.3);
        double discountedAmount_40 = originalAmount-(originalAmount*0.4);
        double discountedAmount_50 = originalAmount-(originalAmount*0.5);

        if (noPackages<10) System.out.println("you have no Discount , your total amount for the packages is :"+originalAmount+"$");

        else if (noPackages>=10 && noPackages<=19)
            System.out.println("You have 20% Discount , your total amount for the packages were :"+originalAmount +
                    "$ And the discounted amount is : "+discountedAmount_20+" $");

        else if (noPackages>=20 && noPackages<=49)
            System.out.println("You have 30% Discount , your total amount for the packages were :"+originalAmount +
                    "$ And the discounted amount is : "+discountedAmount_30+" $");

        else if (noPackages>=50 && noPackages<=99)
            System.out.println("You have 40% Discount , your total amount for the packages were :"+originalAmount +
                    "$ And the discounted amount is : "+discountedAmount_40+" $");

        else if (noPackages>100)
            System.out.println("You have 50% Discount , your total amount for the packages were :"+originalAmount +
                    "$ And the discounted amount is : "+discountedAmount_50+" $");


    }

}