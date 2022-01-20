//------------------------------------------------------------------
//--------------------SHAHZANEER AHMED------------------------------
//-----------------------SP21-BCS-087-------------------------------
//--------------------------lAB-03----------------------------------
//-----------------------Question 1---------------------------------
//------------------------------------------------------------------

//Question – 1: ______
//        Write a Menu Driven JAVA program that creates a string array by taking input from user and
//        perform following tasks by displaying menu to user, the menu operations are implemented using
//        methods:
//        a) Calculate length of string.
//        b) Count number of words in string.
//        c) Check a string is palindrome or not.
//        d) Find a word within the String. If found display its starting position.
//        e) Convert a string in lowercase.
//        f) Convert a string in uppercase

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = input.nextLine();

        while(true) {
            System.out.println("Enter what operation do you want to perform on the string :");
            System.out.println("""
                    1. length of String
                    2. no of words in String
                    3. check if palindrome or not.
                    4. find a word with in String.
                    5. lowercase
                    6. uppercase
                    7. exit
                    """);


            int option = input.nextInt();

            if (option == 7) System.exit(0);

            switch (option) {
                case 1 -> System.out.println(lengthOfString(str));
                case 2 -> System.out.println(noOfWords(str));
                case 3 -> System.out.println(isPalindrome(str));
                case 4 -> {
                    if (findWord(str)==-1) System.out.println("Your word doesn't exist");
                    findWord(str);
                }
                case 5 -> System.out.println(lowerCase(str));
                case 6 -> System.out.println(upperCase(str));
                default -> System.out.println("Enter correct option please ");
            }
        }

    }

     static String upperCase(String str) {
        return str.toUpperCase();

    }

     static String lowerCase(String str){

        return str.toLowerCase();
    }

     static int findWord(String str) {
        Scanner findvar = new Scanner(System.in);
        System.out.println("Enter the word you want to find :");
         String word = findvar.next();
         int index = str.indexOf(word);
         System.out.println(index);
         return index;

    }

    static boolean isPalindrome(String str) {
        String s = "";
        for (int i = str.length()-1; i>=0;i--){
            s+=str.charAt(i);
        }
        if (s.equals(str)) return true;
        else return false;
    }

    static int noOfWords(String str) {
        String [] arr = str.split(" ");
        int noOfWords = arr.length;
        return noOfWords;
    }

    static int lengthOfString(String str) {

        return str.length();
    }

}
