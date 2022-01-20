//------------------------------------------------------------
//----------------Shahzaneer Ahmed----------------------------
//////////////////SP21-BCS-087--------------------------------
//----------------Lab Assignment 02---------------------------
//------------------------------------------------------------


import java.util.Scanner;
public class Question3 {

    public static void main(String...args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine();
        System.out.print(capatalize(str));
    }
    public static String capatalize(String lower_case_word){
        String firstLetStr = lower_case_word.substring(0, 1);
        String remLetStr = lower_case_word.substring(1);
        firstLetStr = firstLetStr.toUpperCase();
        String firstLetterCapitalizedName = firstLetStr + remLetStr;
        String c = (firstLetterCapitalizedName);
        return c;
}
}