//Shahzaneer Ahmed
//SP21-BCS-087
//Activity-6
//        Given the integer N - the number of minutes that is passed since midnight - how many hours and minutes
//        are displayed on the 24h digital clock?
//        The program should print two numbers: the number of hours (between 0 and 23) and the number of
//        minutes (between 0 and 59).
//        For example, if N = 150, then 150 minutes have passed since midnight - i.e. now is 2:30 am. So the program
//        should print 2 30.
import java.util.Scanner;
public class Activity6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int no_of_min_passed;
        System.out.println("Enter the no of minutes passed after midnight");
        no_of_min_passed = obj.nextInt();
        int hours = 00;
        int min = 00;

        int new_hours = (no_of_min_passed/60);
        int new_mins = (no_of_min_passed%60);

        hours += new_hours;
        min += new_mins;

        if (no_of_min_passed <= 59){
            System.out.println("the new time is : 12 :"+min+" Am");
        }
        else{
            System.out.println("the new time is : " + hours + ":" + min + " Am");
        }


    }
}
