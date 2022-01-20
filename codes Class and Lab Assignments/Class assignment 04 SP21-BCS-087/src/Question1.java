//------------SHAHZANEER AHMED------------------------
//----------------SP21-BCS-087------------------------
//------------Class Assignment 04---------------------

//QUESTION #1 (CLO-3)
//
//        Write a Java program to keep accepting 10 integer values from user until valid values are entered.
//        If the user enters invalid integer values then ask the user to enter it again.
//        For example if the given input is as below…
//        11
//        2
//        99
//        21abc
//
//        Then your program should ask the user to enter the fourth value again as it is invalid
//        .User should not be asked to enter the valid values again.
//
//        Once all the values are entered then sort these values in ascending order.

import java.util.Arrays;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
       int [] arr = new int[10];
       for(int i = 0; i< arr.length;i++){
           try{
               System.out.printf("Enter an element at %dth position ",i);
               int number = input.nextInt();
               arr[i] = number;
           }
           catch (Exception e){
               System.out.printf("invalid input! kindly enter the value at %dth position again! \n",i);
               String x = input.nextLine(); // it will temporarily store  the invalid input (Buffer Scenezz)
               i--; // loop main chunkay abhi aik barhayga but error ki soorat main hum dubara same iteration per
               // repeat krna chahtay hain tou aik kam krdengay.

           }
       }
       sorting(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void sorting(int [] arr){
        for (int i = 0; i< arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
//                    swapping
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

}
