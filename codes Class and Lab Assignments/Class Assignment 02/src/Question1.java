//------------------------------------------------------------
//----------------Shahzaneer Ahmed----------------------------
//////////////////SP21-BCS-087--------------------------------
//--------------CLASS Assignment 02---------------------------
//------------------------------------------------------------

//Question – 1: ______
//        Write a program that prompts the user to enter a Social Security
//        number in the format DDD-DD-DDDD, where D
//        is a digit. Your program should check whether the input is valid. Here are
//        sample runs:
//        Enter a SSN: 232-23-5435
//        232-23-5435 is a valid social security number
//        Enter a SSN: 23-23-5435
//        23-23-5435 is an invalid social security number

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter SSN in the format DDD-DD-DDDD");
        String ssn = input.nextLine();

        String a = ssn.substring(0,(ssn.indexOf('-')));
        String b = ssn.substring((ssn.indexOf('-')+1),(ssn.lastIndexOf('-')));
        String c = ssn.substring((ssn.lastIndexOf('-')+1),(ssn.length()));
        String d = a+b+c;


        try {
            int number = Integer.parseInt(d);

        if (a.length() == 3 && b.length() == 2 && c.length() == 4)
            System.out.printf("The %s is a valid social security number!", ssn);

        else
            System.out.printf("The %s is an invalid social security number!",ssn);
        }
        catch (NumberFormatException e){
            System.out.printf("The %s is an  invalid social security number! please enter Numbers only!",ssn);
        }
    }

}
