//Shahzaneer Ahmed
//SP21-BCS-087
//LAB 04

//Activity-9
//        Sign function: For the given integer X print 1 if it's positive, -1 if it's negative, or 0 if it's
//        equal to zero.

import java.util.Scanner;
public class Activity9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Any Integer :");
        int integer = obj.nextInt();
        if (integer>0) System.out.println("+1");
        else if (integer<0) System.out.println("-1");
        else System.out.println(0);


    }
}
