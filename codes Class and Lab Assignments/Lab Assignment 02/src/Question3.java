//------------------------------------------------------------
//----------------Shahzaneer Ahmed----------------------------
//////////////////SP21-BCS-087--------------------------------
//----------------Lab Assignment 02---------------------------
//------------------------------------------------------------

//Question – 3: ______
//        Write a function capitalize(lower_case_word) that takes the lower case word and returns the word
//        with the first letter capitalized. Eg., System.out.println(capitalize(“word”)) should print the word
//        Word.
//        Then, given a line of lowercase ASCII words (text separated by a single space), print it with the first
//        letter of each word capitalized using the your own function capitalize().

import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String to capitalize the first letters of its words :");
        String str = input.nextLine();
        Capitalize(str);
    }

    public static  void Capitalize(String lowerCase) {

        String[] words = lowerCase.split(" ");
        String remainingWord;
        String newString = "";
        for (int i = 0; i<words.length;i++){

            String firstLetter = words[i].substring(0,1);
            String firstLetterCapitalize = firstLetter.toUpperCase();
            newString +=firstLetterCapitalize;

             remainingWord = words[i];

             String remainingWord1 = remainingWord.substring(1);
             String space = " ";
             String remainingWord2 = remainingWord1+space;
             newString+=remainingWord2;

            }
            System.out.println(newString);



        }
    }
