//You are given a string.
//        In the first line, print the third character of this string.
//        In the second line, print the second to last character of this string.
//        In the third line, print the first five characters of this string.
//        In the fourth line, print all but the last two characters of this string.
//        In the fifth line, print all the characters of this string with even indices (remember indexing
//        starts at 0, so the characters are displayed starting with the first).
//        In the sixth line, print all the characters of this string with odd indices (i.e. starting with the
//        second character in the string).
//        In the seventh line, print all the characters of the string in reverse order.
//        In the eighth line, print every second character of the string in reverse order, starting from the
//        last one.
//        In the ninth line, print the length of the given string.
//        Sample Run:
//        Input: Hello
//        l
//        l
//        Hello
//        Hel
//        Hlo
//        el
//        olleH
//        olH
//        5

import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any String :");
        String str = input.next();
        System.out.println(str.charAt(2)); //first line -- Third character


        for (int i = str.length()-2;i<=str.length()-2;i++) System.out.print(str.charAt(i));
        System.out.println();  //In the second line, print the second to last character of this string.


        for (int i = 0; i<5;i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        //  In the third line, print the first five characters of this string.

        for (int i = 0 ; i<=str.length()-3; i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        //In the fourth line, print all but the last two characters of this string.


        for (int i = 0; i<str.length();i++){
            if (i%2==0) System.out.print(str.charAt(i));
        }
        System.out.println(); //In the fifth line, print all the characters of this string with even indices
                               // (remember indexing starts at 0, so the characters are displayed starting with the
        // first).


        for (int i = 0; i<str.length();i++){
            if (i%2==1) System.out.print(str.charAt(i));
        }
        System.out.println(); //In the sixth line, print all the characters of this string with odd indices (i.e. starting with the
//        second character in the string).

        for (int i = str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println(); //In the seventh line, print all the characters of the string in reverse order.

        for (int i = str.length()-1; i>=0;i-=2){

            System.out.print(str.charAt(i));
        }
        System.out.println(); //In the eighth line, print every second character of the string in reverse order, starting from the
//        last one.

        System.out.println(str.length());
        System.out.println(); //In the ninth line, print the length of the given string.



    }
}
