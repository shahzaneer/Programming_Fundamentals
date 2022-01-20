//Shahzaneer Ahmed
//SP21-BCS-087
//Activity-8
//        You found an exciting summer job for five weeks. It pays $15.50 per hour. Suppose that the total tax you
//        pay on your summer job income is 14%. After paying the taxes, you spend 10% of your net income to buy
//        new clothes and other accessories for the next school year and 1% to buy school supplies. After buying
//        clothes and school supplies, you use 25% of the remaining money to buy savings bonds. For each dollar you
//        spend to buy savings bonds, your parents spend $0.50 to buy additional savings bonds for you. Write a
//        program that prompts the user to enter the pay rate for an hour and the number of hours you worked each
//        week. The program then outputs the following:
//        a. Your income before and after taxes from your summer job
//        b. The money you spend on clothes and other accessories
//        c. The money you spend on school supplies
//        d. The money you spend to buy savings bonds
//        e. The money your parents spend to buy additional savings bonds for you
//

import java.util.Scanner;
public class Activity8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your pay rate for an hour :");
        double pay_rate = obj.nextDouble();
        System.out.println("Enter the no of hours you do work each week");
        double no_hours = obj.nextDouble();
        double income_before_tax = pay_rate*(no_hours*5);
        double tax = (income_before_tax*14)/100;
        double income_after_tax = income_before_tax - tax;
        System.out.println("Your Income before tax is :"+income_before_tax +" and after tax is "+income_after_tax);
        double clothes_accessories = (income_after_tax*10)/100;
        double school_supplies = (income_after_tax*1)/100;
        double your_saving_bonds = (income_after_tax*25)/100;
        double parents_saving_bonds = your_saving_bonds/2;

        System.out.println("after paying tax,");
        System.out.println("You spend "+clothes_accessories +" dollars on Clothes and accessories ");
        System.out.println("You spend "+school_supplies +" dollars on School supplies ");
        System.out.println("You spend "+your_saving_bonds +" dollars on saving bonds ");
        System.out.println("Your parents spend "+parents_saving_bonds +" dollars on saving bonds for you  ");



    }
}
