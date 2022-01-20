//------------------------------------------------------------
//----------------Shahzaneer Ahmed----------------------------
//////////////////SP21-BCS-087--------------------------------
//--------------CLASS Assignment 02---------------------------
//------------------------------------------------------------

//Question – 5: ______
//        Write a program that prompts the user to enter a decimal integer and displays its corresponding
//        binary value. Don’t use Java’s Integer.toBinaryString(int) in this program


import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your decimal value :");
        int decimal = input.nextInt();
        int num = decimal;
        String value = "";
        while (num!=0){
            int rem = num%2;
            value+=rem;
            num = num/2;
        }
        String binary = "";
        for (int i = value.length()-1; i>=0;i--){
            binary+=value.charAt(i);
        }

        System.out.println("The binary of given number is :"+binary);
    }
}
