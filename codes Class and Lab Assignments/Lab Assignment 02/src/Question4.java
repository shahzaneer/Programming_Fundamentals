//------------------------------------------------------------
//----------------Shahzaneer Ahmed----------------------------
//////////////////SP21-BCS-087--------------------------------
//----------------Lab Assignment 02---------------------------
//------------------------------------------------------------

//Question – 4: ______
//        Write a method that displays an n-by-n matrix using the following header: public static void
//        printMatrix(int n)
//        Each element is 0 or 1, which is generated randomly. Write a test program that prompts the user to
//        enter n and displays an n-by-n matrix. Here is a sample run:
//        Enter n: 3
//        0 1 0
//        0 0 0
//        1 1 1

import java.util.Scanner;
import java.util.Random;
public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the (n) the order of matrix :");
        int order = input.nextInt();

        printMatrix(order);


    }
    public static void printMatrix(int n){
        Random rand = new Random();

        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                int value = rand.nextInt(2);
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }

}
