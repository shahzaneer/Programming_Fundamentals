//Shahzaneer Ahmed
//SP21-BCS-087


//Activity-9
//        A cricket game is to be held in a stadium and there are five seating categories available for the
//        audience. Class A seats cost $20, Class B seats cost $15, Class C seats cost $10, and Class D seats cost $5.
//        You should write a JAVA program that asks how many tickets for each class of seats were sold and finally
//        display the income generated income corresponding to ticket sales.

import java.util.Scanner;
public class Activity9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("how many tickets do you want from class A?");
        int class_a_tickets = obj.nextInt();

        System.out.println("how many tickets do you want from class B?");
        int class_b_tickets = obj.nextInt();

        System.out.println("how many tickets do you want from class C?");
        int class_c_tickets = obj.nextInt();

        System.out.println("how many tickets do you want from class D?");
        int class_d_tickets = obj.nextInt();
        int income_from_a = class_a_tickets*20;
        int income_from_b = class_b_tickets*15;
        int income_from_c = class_c_tickets*10;
        int income_from_d = class_d_tickets*5;

        int income_generated = income_from_a+income_from_b+income_from_c+income_from_d;

        System.out.println(+class_a_tickets +" no of tickets from A were sold out");
        System.out.println(+class_b_tickets +" no of tickets from B were sold out");
        System.out.println(+class_c_tickets +" no of tickets from C were sold out");
        System.out.println(+class_d_tickets +" no of tickets from D were sold out");

        System.out.println();

        System.out.println("The total income generated  by the sale is "+income_generated +" Dollars");



    }
}
