//Shahzaneer Ahmed
//SP21-BCS-087
//LAB 04
//Activity-11
//        Equal numbers: Given three integers, determine how many of them are equal to each
//        other. The program must print one of these numbers: 3 (if all are the same), 2 (if two of
//        them are equal to each other and the third is different) or 0 (if all numbers are different).
//        Sample Input: 10 5 10 Output: 2

import java.util.Scanner;
public class Activity11 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 1st integer");
        int integer1 = obj.nextInt();
        System.out.println("Enter 2nd integer");
        int integer2 = obj.nextInt();
        System.out.println("Enter 3rd integer");
        int integer3 = obj.nextInt();

        if (integer1==integer2 && integer2==integer3){
//            if three integers are euqal to each other
            System.out.println(3);
        }
        else if (integer1==integer2 || integer2==integer3 || integer1==integer3){
//            if only two integer are equal to each other
            System.out.println(2);
        }
//        if no integer is equal to each other
        else System.out.println("NO same Integer");








    }
}
