//Shahzaneer Ahmed
//SP21-BCS-087
//LAB 04
//Activity-14
//        Mass and Weight
//        Scientists measure an object’s mass in kilograms and its weight in newtons. If you know
//        the amount of mass of an object in kilograms, you can calculate its weight in newtons
//        with the following formula:
//        weight = mass x 9.8
//        Write a program that asks the user to enter an object’s mass, and then calculates its
//        weight. If the object weighs more than 1,000 newtons, display a message indicating that
//        it is too heavy. If the object weighs less than 10 newtons, display a message indicating
//        that it is too light.

import java.util.Scanner;
public class Activity14 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the mass of an object in Kilograms (kgs) :");
        float mass = obj.nextFloat();

        float weight = mass * 9.8f;
        System.out.println("The weight of this object is :"+weight+" Newtons");

        if (weight>1000) System.out.println("The object is too heavy ");
        if (weight<10) System.out.println("The object is too light ");

    }
}
