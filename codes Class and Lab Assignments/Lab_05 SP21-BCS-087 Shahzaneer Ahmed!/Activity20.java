//Shahzaneer Ahmed
//SP21-BCS-087
//LAB 04

//Activity-20
//        Shipping Charges
//        The Fast Freight Shipping Company charges the following rates:
//        Write a program that asks the user to enter the weight of a package and then displays
//        the shipping charges

import java.util.Scanner;
public class Activity20 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the weight of Shipping object in pounds :");
        float weight = obj.nextFloat();

        if (weight<=2) System.out.println("The shipping charges are $1.10");
        if (weight>2 && weight<=6) System.out.println("The shipping charges are $2.20");
        if (weight>6 && weight<=10) System.out.println("The shipping charges are $3.70");
        if (weight>10) System.out.println("The shipping charges are $3..80");
    }
}
