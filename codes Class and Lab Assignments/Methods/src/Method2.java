//Write a method with the following header to display an integer in reverse order
//        :public static void reverse(int number)For example, reverse(3456)displays 6543.
//        Write a test program that prompts the user to enter an integer and displays its reversal.

import java.util.Scanner;
public class Method2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get its reversal :");
        int num = input.nextInt();
        reverse(num);
    }
public static void reverse(int number){
        int num = number;
        int reverseNumber = 0;
        while (num!=0){
            int rem = num%10;
            reverseNumber = (reverseNumber*10) + rem;
            num = num/10;
    }
    System.out.println("The reverse of the given number is "+reverseNumber);
}

}
