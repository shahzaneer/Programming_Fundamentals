//------------SHAHZANEER AHMED------------------------
//----------------SP21-BCS-087------------------------
//------------Class Assignment 04---------------------

//QUESTION #3 (CLO-3)
//
//        Write a method that sums all the numbers in the major diagonal in an n * n matrix of double
//        values using the following header:
//
//public static double sumMajorDiagonal(double[][] m)
//
//        Write a test program that reads a 4-by-4 matrix and displays the sum of all its elements on the major diagonal.
//        Here is a sample run:


import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of rows :");
        int rows = input.nextInt();
        System.out.println("Enter the size of columns :");
        int columns = input.nextInt();

        double [][] arr = new double[rows][columns];
        System.out.println("Enter the elements in your 2D array :");
        for(int i=0; i< arr.length;i++){
            for(int j = 0; j< arr[i].length;j++){
                System.out.printf("Enter Element at position at %dth row %dth column :",i,j);
                arr[i][j] = input.nextDouble();
            }
        }


            double sum = sumMajorDiagonal(arr);
            System.out.printf("The sum of Major diagonal is %.1f\n",sum);


    }

    public static double sumMajorDiagonal(double[][] arr) {
        double Majorsum = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                if (i==j){
                    Majorsum+=arr[i][j];
                }
            }
        }
        return Majorsum;
    }
    }

