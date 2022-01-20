//Shahzaneer Ahmed
//SP21-BCS-087
//LAB 04

//Activity-12
//        Roman Numerals
//        Write a program that prompts the user to enter a number within the range of 1 through
//        10. The program should display the Roman numeral version of that number. If the
//        number is outside the range of 1 through 10, the program should display an error
//        message. The following table shows the Roman numerals for the numbers 1 through 10


import java.util.Scanner;
public class Activity12 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number between 1 to 10 ");
        int num = obj.nextInt();
        if (num>0 && num<=10){
            if (num == 1) System.out.println("I");
            if (num == 2) System.out.println("II");
            if (num == 3) System.out.println("III");
            if (num == 4) System.out.println("IV");
            if (num == 5) System.out.println("V");
            if (num == 6) System.out.println("VI");
            if (num == 7) System.out.println("VII");
            if (num == 8) System.out.println("VIII");
            if (num == 9) System.out.println("IX");
            if (num == 10) System.out.println("X");
        }
        else System.out.println("Error!! please Enter any number only in between 1 and 10 ");
    }
}
