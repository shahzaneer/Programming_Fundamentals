//Shahzaneer Ahmed
//SP21-BCS-087
//Activity-4
//        N students take K apples and distribute them among each other evenly. The remaining (the undivisible)
//        part remains in the basket. How many apples will each single student get? How many apples will remain in
//        the basket?
//        The program reads the numbers N and K. It should print the two answers for the questions above.
//        Input: Output:
//        6 8
//        50 2

import java.util.Scanner;
public class Activity4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the numbers of students");
        int n = obj.nextInt();
        System.out.println("Enter the number of Apples to be distributed");
        int k = obj.nextInt();

        int apples_in_the_basket = (k%n);
        int apples_each_student = (k/n) ;

        System.out.println("The no of Apples each student will get : "+apples_each_student);
        System.out.println("The Apples left in the basket   : "+apples_in_the_basket);

    }
}
