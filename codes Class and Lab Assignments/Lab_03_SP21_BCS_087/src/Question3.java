//------------------------------------------------------------------
//--------------------SHAHZANEER AHMED------------------------------
//-----------------------SP21-BCS-087-------------------------------
//--------------------------lAB-03----------------------------------
//-----------------------Question 3---------------------------------
//------------------------------------------------------------------

//Question – 3: ______
//        Consider an integer array, the number of elements in which is determined by the user. The
//        elements are also taken as input from the user. Write a program to find those pairs of elements
//        that have the maximum and minimum difference among all element pairs

import java.util.Arrays;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = input.nextInt();
        int [] array = new int[size];

        for(int i = 0; i<array.length;i++){
            System.out.printf("Enter element at  index %d :\n",i);
            array[i] = input.nextInt();
        }

        sort(array);
        difference(array);



    }
    static void sort(int [] array){
        for (int i = 0; i< array.length; i++){
            for(int j= 1+i; j<array.length; j++){
                if (array[i]>array[j]){
                    int temp;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    static void difference(int [] array){
        int maxValue = array[array.length-1];
        int minValue = array[0];
        int secondMinValue = array[1];
        int maxDifference = maxValue-minValue;
        int minDifference = secondMinValue-minValue;
        System.out.printf("The pair with maximum difference in all pairs of the given array is (%d,%d) with " +
                "difference %d units: \n",maxValue,minValue,maxDifference);
        System.out.printf("The pair with minimum difference in all pairs of the given array is (%d,%d) with " +
                "difference %d units: \n",secondMinValue,minValue,minDifference);


    }
}
