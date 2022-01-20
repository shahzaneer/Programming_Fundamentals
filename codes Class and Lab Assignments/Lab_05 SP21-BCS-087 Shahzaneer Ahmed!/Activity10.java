//Shahzaneer Ahmed
//SP21-BCS-087
//LAB 04

//Activity-10
//        Minimum of three numbers: Given three integers, print the smallest value

import java.util.Scanner;
public class Activity10 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter three integers");
        int integer1 = obj.nextInt();
        int integer2 = obj.nextInt();
        int integer3 = obj.nextInt();

       if (integer1<integer2 && integer1<integer3) System.out.println("The smallest number is :"+integer1);
       if (integer2<integer1 && integer2<integer3) System.out.println("The smallest number is :"+integer2);
       if (integer3<integer2 && integer3<integer1) System.out.println("The smallest number is :"+integer3);

    }
}
