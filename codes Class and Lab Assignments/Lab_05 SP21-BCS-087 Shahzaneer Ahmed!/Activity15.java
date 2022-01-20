//Shahzaneer Ahmed
//SP21-BCS-087
//LAB 04

//Activity-15
//        Magic Dates
//        The date June 10, 1960, is special because when it is written in the following format, the
//        month times the day equals the year: 6/10/60
//        Design a program that asks the user to enter a month (in numeric form), a day, and a
//        two-digit year. The program should then determine whether the month times the day
//        equals the year. If so, it should display a message saying the date is magic. Otherwise, it
//        should display a message saying the date is not magic.

import java.util.Scanner;
public class Activity15 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Date in numeric format (dd/mm/yy)");
        System.out.println("Enter Day :");
        int day = obj.nextInt();
        System.out.println("Enter month :");
        int month = obj.nextInt();
        System.out.println("Enter Year :");
        int year = obj.nextInt();

        if ((day>0 && day<=31) && (month>0 && month<=12) && (year>=0 && year<=99)){
            if (day*month == year) System.out.printf("This is Magic date %d/%d/%d :" ,day,month,year);
            else System.out.printf("Not a magic Date :  %d/%d/%d" ,day,month,year);
        }
        else{
            System.out.println("Invalid date format");
        }
    }

}
