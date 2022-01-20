//Given a string consisting of exactly two words separated by a space. Print a new string with
//        the first and second word positions swapped (the second word is printed first).
//        This task should not use loops and if.
//        Sample Run:
//        Input: Hello, world!
//        Correct Answer: world! Hello,

import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String consisting of two words separated by a space :");
        String str1 = input.next(); //here we have implemented the concept of buffer memory; next k case main white
        // spaces se terminate houti hai string.
        String str2 = input.next();

        String str3 = str2 +" "+ str1;
        System.out.println(str3);
    }
}
