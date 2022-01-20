// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//        Question – 8:
//                Write a program that prompts the user to enter an integer for today’s day of the week (Sunday
//                is 0, Monday is 1, …, and Saturday is 6). Also prompt the user to enter the number of days after
//                today for a future day and display the future day of the week.

import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 0 for Sunday ");
        System.out.println("Enter 1 for Monday ");
        System.out.println("Enter 2 for Tuesday ");
        System.out.println("Enter 3 for Wednesday ");
        System.out.println("Enter 4 for Thursday ");
        System.out.println("Enter 5 for Friday ");
        System.out.println("Enter 6 for Saturday ");
        int todayDate = obj.nextInt();
        System.out.println("Enter no of days after today :");
        int elapsedDays = obj.nextInt();

        int future_day = (todayDate+elapsedDays)%7;  // today day + day to be elapsed ko add kr k 7 per divide krna
        // hai jo bhi remainder ayega jo hamaray future day ko show karega !

        String todayDay = "";

        switch (todayDate) {
            case 0:
                todayDay = "Sunday";
                break;
            case 1:
                todayDay = "Monday";
                break;
            case 2:
                todayDay = "Tuesday";
                break;
            case 3:
                todayDay = "Wednesday";
                break;
            case 4:
                todayDay = "Thursday";
                break;
            case 5:
                todayDay = "Friday";
                break;
            case 6:
                todayDay = "Saturday";
                break;
        }

            if (future_day==0) System.out.printf(" Today is %s and the future day will be Sunday! ", todayDay);
            else if (future_day==1) System.out.printf(" Today is %s and the future day will be Monday! ", todayDay);
            else if (future_day==2) System.out.printf(" Today is %s and the future day will be Tuesday! ", todayDay);
            else if (future_day==3) System.out.printf(" Today is %s and the future day will be Wednesday! ", todayDay);
            else if (future_day==4) System.out.printf(" Today is %s and the future day will be Thursday! ", todayDay);
            else if (future_day==5) System.out.printf(" Today is %s and the future day will be Friday! ", todayDay);
            else if (future_day==6) System.out.printf(" Today is %s and the future day will be Saturday! ", todayDay);


        }



    }

