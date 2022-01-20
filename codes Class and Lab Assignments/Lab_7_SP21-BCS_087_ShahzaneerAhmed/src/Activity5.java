//Shahzaneer Ahmed
//SP21-BCS-087
//Activity-5
//        A school decided to replace the desks in three classrooms. Each desk sits two students. Given the number
//        of students in each class, print the smallest possible number of desks that can be purchased.
//        The program should read three integers: the number of students in each of the three
//        classes, a, b and c respectively.
//        Input: Output:
//        17 28
//        19
//        18

import java.util.Scanner;
import java.lang.Math;
public class Activity5 {
    public static void main(String[] args) {
        // Declaration of Variables
        double students_A, students_B, students_C, deskA, desks_B, desks_C, totalDesks;

        Scanner sc = new Scanner(System.in);

        // take inputs from the user

        System.out.println("Number of Students in Class 1: ");
        students_A = sc.nextDouble();

        System.out.println("Number of Students in Class 2: ");
        students_B = sc.nextInt();

        System.out.println("Number of Students in Class 3: ");
        students_C = sc.nextInt();

        // calculate minimum desks required for each class and round off to account for odd number of Students in a class

        deskA = students_A / 2;
        deskA = Math.round(deskA);
        System.out.println("desk A :"+ deskA);

        desks_B = students_B / 2;
        desks_B = Math.round(desks_B);

        desks_C = students_C / 2;
        desks_C = Math.round(desks_C);

        // calculate the number of minimum possible desks to be purchased for three classes

        totalDesks = deskA + desks_B + desks_C;
        int totalNumberOfDesks = (int) totalDesks;
        System.out.println("Total number of desks required by the School are: " + totalNumberOfDesks);
    }
}

