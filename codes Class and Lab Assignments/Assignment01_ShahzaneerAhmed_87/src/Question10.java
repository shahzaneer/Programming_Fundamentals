// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Question – 10:
//        Write a program that prompts the user to enter the month and year and displays the number of
//        days in the month. For example, if the user entered month 2 and year 2012, the program should
//        display that February 2012 had 29 days. If the user entered month 3 and year 2015, the program
//        should display that March 2015 had 31 days

import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no of month :");
        int month_no = obj.nextInt();
        System.out.println("Enter the year :");
        int year_no = obj.nextInt();
        String month_name = "";
        boolean isLeap = false;


//        to check whether the year is leap or not !

        if (month_no == 2){
         if ((year_no%4==0) && (year_no%100!=0)){
         isLeap = true;
         }
         else if ((year_no%4==0) && (year_no%100==0 && (year_no%400==0))){
             isLeap = true;
            }
        }



        switch (month_no){
            case 1:
              month_name = "January";
                System.out.printf("The %s %d has 31 days " ,month_name , year_no);
                break;
            case 2:
                month_name = "February";
                if (!isLeap){
                    System.out.printf("The %s %d has 28 days ", month_name, year_no);
                    break;
                }
                else if (isLeap){
                    System.out.printf("The %s %d has 29 days " ,month_name , year_no);
                    break;
                }
            case 3:
                month_name = "March";
                System.out.printf("The %s %d has 31 days " ,month_name , year_no);
                break;
            case 4:
                month_name = "April";
                System.out.printf("The %s %d has 30 days " ,month_name , year_no);
                break;
            case 5:
                month_name = "May";
                System.out.printf("The %s %d has 31 days " ,month_name , year_no);
                break;
            case 6:
                month_name = "June";
                System.out.printf("The %s %d has 30 days " ,month_name , year_no);
                break;
            case 7:
                month_name = "July";
                System.out.printf("The %s %d has 31 days " ,month_name , year_no);
                break;
            case 8:
                month_name = "August";
                System.out.printf("The %s %d has 31 days " ,month_name , year_no);
                break;
            case 9:
                month_name = "September";
                System.out.printf("The %s %d has 31 days " ,month_name , year_no);
                break;
            case 10:
                month_name = "October";
                System.out.printf("The %s %d has 31 days " ,month_name , year_no);
                break;
            case 11:
                month_name = "November";
                System.out.printf("The %s %d has 30 days " ,month_name , year_no);
                break;
            case 12:
                month_name = "December";
                System.out.printf("The %s %d has 31 days " ,month_name , year_no);
                break;
        }

    }
}
