//------------SHAHZANEER AHMED------------------------
//----------------SP21-BCS-087------------------------
//------------Class Assignment 04---------------------

//QUESTION #2 (CLO-3)
//
//        Write a method that returns the sum of all the elements in a specified column in a matrix using the following header:
//
//public static double sumColumn(double[][] m, int columnIndex)
//
//        Write a test program that reads a 3-by-4 matrix and displays the sum of each
//        column. Here is a sample run:


import java.util.Scanner;
public class Question2 {
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

        for(int i = 0; i<columns;i++){
            double sum = sumColumn(arr,i);
            System.out.printf("The sum of column %d is %.1f\n",i,sum);
        }

    }
    public static double sumColumn(double [][] arr, int columnNumber){
        double sum = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                if (j == columnNumber){
                sum+=arr[i][j];
                }
            }
        }
        return sum;
    }
}
