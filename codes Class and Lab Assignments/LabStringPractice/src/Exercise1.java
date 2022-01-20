//Write a program that checks whether a string is a palindrome. A string is a palindrome if it
//        reads the same forward and backward. The words “mom,” “dad,” and “noon,” for instance,
//        are all palindromes. Sample run:
//        Enter a string: noon
//        noon is a palindrome
//        Enter a string: moon
//        moon is not a palindrome

import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to check if it is palindrome or not :");
        String str1 = input.next();
        String str2="";

        for (int i = str1.length()-1; i >= 0; i--){
            str2 += str1.charAt(i);
//            System.out.println(str2);  //for back tracing what is really going on !
        }

        if (str1.equals(str2)) System.out.printf("%s is a palindrome !\n",str1);
        else System.out.printf("%s is not a palindrome !\n",str1);

    }

}
