//------------------------------------------------------------
//----------------Shahzaneer Ahmed----------------------------
//////////////////SP21-BCS-087--------------------------------
//--------------CLASS Assignment 02---------------------------
//------------------------------------------------------------

//Question – 2: ______
//        Write a program that prompts the user to enter two strings and reports whether the second string
//        is a substring of the first string
//        Enter string s1: ABCD
//        Enter string s2: BC
//        BC is a substring of ABCD


import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  String 1");
        String s1 = input.nextLine();
        System.out.println("Enter  String 2");
        String s2 = input.nextLine();

        boolean isSubstring = s1.contains(s2); //boolean T/F

        if (isSubstring) System.out.println("String 1 is a substring of String 2");
        else System.out.println("The String 1 is not a substring of String 2");
    }
}
