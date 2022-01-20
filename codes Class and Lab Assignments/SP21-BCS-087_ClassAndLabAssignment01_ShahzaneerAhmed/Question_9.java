// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Question-9
//        Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of the
//        week. The formula is
//        Where
//         h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday,
//        5: Thursday, 6: Friday).
//         q is the day of the month.
//         m is the month (3: March, 4: April, …, 12: December). January and February are counted
//        as months 13 and 14 of the previous year.
//         j is the century (i.e., year / 100).
//         k is the year of the century (i.e., year % 100).
//        Note that the division in the formula performs an integer division. Write a program that prompts
//        the user to enter a year, month, and day of the month, and displays the name of the day of the
//        week. Here are some sample runs:
//
//        (Hint: January and February are counted as 13 and 14 in the formula, so you need to convert the
//        user input 1 to 13 and 2 to 14 for the month and change the year to the previous year.)

import java.util.Scanner;
public class Question_9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter year : ");
        int year = obj.nextInt();
        System.out.println("Enter month (1-12) :");
        int month = obj.nextInt();
        System.out.println("Enter the day of the month  (1-31):");
        int monthDay = obj.nextInt();

        int q = monthDay;
        int m = month;

        if (m == 1){
//            as we have to consider m = 13 in case of 1 and year  to be previous year!
            m =13;
            year-=1;
        }
        if (m == 2){
            m =14;
            year-=1;
        }

        int j = year/100;
        int k = year%100;


        int h = ( q + (26*(m+1)/10)+ k + (k/4) + (j/4) + (5*j)) % 7;

        String todayDay = "";

        switch (h) {
//            using enhanced switch statement

            case 0 -> todayDay = "Saturday";
            case 1 -> todayDay = "Sunday";
            case 2 -> todayDay = "Monday";
            case 3 -> todayDay = "Tuesday";
            case 4-> todayDay = "Wednesday";
            case 5 -> todayDay = "Thursday";
            case 6 -> todayDay = "Friday";

        }

//        System.out.printf("The year is %d\n", year);
//        System.out.printf("The Month is  %d \n", month);
//        System.out.printf("The day of Month is %d\n", monthDay);

        System.out.printf("Day of the week is %s\n",todayDay);









    }
}
