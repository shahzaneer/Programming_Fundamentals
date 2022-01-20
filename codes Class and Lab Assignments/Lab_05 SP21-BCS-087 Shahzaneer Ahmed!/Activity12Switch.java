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
public class Activity12Switch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any number between 1 to 10 ");
        int num = obj.nextInt();
        switch (num) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;

            default:
//                if non case is followed then it will be followed!
                System.out.println("Error!! please Enter any number only in between 1 and 10 ");
        }
    }
}
