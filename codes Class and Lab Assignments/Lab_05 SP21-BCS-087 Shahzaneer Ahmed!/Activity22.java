//Shahzaneer Ahmed
//SP21-BCS-087
//LAB 04

//Activity-22
//        Time Calculator
//        Write a program that asks the user to enter a number of seconds, and works as follows:
//         There are 60 seconds in a minute. If the number of seconds entered by the user
//        is greater than or equal to 60, the program should display the number of minutes
//        in that many seconds.
//         There are 3,600 seconds in an hour. If the number of seconds entered by the
//        user is greater than or equal to 3,600, the program should display the number of
//        hours in that many seconds.
//        There are 86,400 seconds in a day. If the number of seconds entered by the user is
//        greater than or equal to 86,400, the program should display the number of days in that
//        many seconds

import java.util.Scanner;
public class Activity22 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no of Seconds :");
        int seconds = obj.nextInt();

        float minutes = seconds/60;

        float hours = seconds/3600;

        float days = seconds/86400;

         if (seconds<60)
             System.out.println("it equals "+seconds +" Seconds ");
        else if (seconds>=60 && seconds<3600)
            System.out.println("it equals "+minutes +" minutes");
        else if (seconds>=3600 && seconds<86400)
            System.out.println("it equals "+hours +" hours ");
        else if (seconds>=86400)
            System.out.println("it equals "+days +" days  ");

    }
}
