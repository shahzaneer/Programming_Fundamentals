//Shahzaneer Ahmed
//SP21-BCS-087
//LAB 04

//Activity-21
//        Body Mass Index Program Enhancement
//        The BMI is often used to determine whether a person is overweight or underweight for
//        their height. A person’s BMI is calculated with the formula
//        BMI= weight x 703 / height2
//        Where weight is measured in pounds and height is measured in inches. Write a program
//        that displays a message indicating whether the person has optimal weight, is
//        underweight, or is overweight. A person’s weight is considered to be optimal if his or
//        her BMI is between 18.5 and 25. If the BMI is less than 18.5, the person is considered to
//        be underweight. If the BMI value is greater than 25, the person is considered to be
//        overweight.

import java.util.Scanner;
public class Activity21 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float height,weight;
        System.out.println("Enter your Height in inches :");
        height = obj.nextFloat();
        System.out.println("Enter your weight in pounds :");
        weight = obj.nextFloat();

        float bmi = (weight*703)/(height*height);

        if (bmi<18.5) System.out.println("You are Underweight ");
        else if (bmi>=18.5 && bmi<=25) System.out.println("You are optimal weight ");
        else if (bmi>25) System.out.println("You are overweight ");
    }
}
