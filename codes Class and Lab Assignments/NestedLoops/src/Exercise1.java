//------------------------------------------------------------------
//--------------------SHAHZANEER AHMED------------------------------
//-----------------------SP21-BCS-087-------------------------------
//-----------------------Question 1---------------------------------
//------------------------------------------------------------------

//Write a program that reads an unspecified number of integers, determines how many
//        positive and negative values have been read, and computes the total and average of the
//        input values (not counting zeros). Your program ends with the input 0. Display the
//        average as a floating-point number. Here is a sample run:
//        Enter an integer, the input ends if it is 0: 1 2 -1 3 0
//        The number of positives is 3
//        The number of negatives is 1
//        The total is 5.0
//        The average is 1.25


import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  counter=0;
        int positiveCounter=0;
        int negativeCounter=0;
        float sum = 0f , average;
        System.out.println("Enter Integers and 0 to terminate the loop !");

        while (true){
            int num = input.nextInt();
            if (num==0) break;
            else{
                counter+=1;
                sum+=num;
                if(num>0) positiveCounter+=1;
                else if (num<0) negativeCounter+=1;

            }
        }

        average = sum/counter;
        System.out.println("The no of positive numbers are :"+positiveCounter);
        System.out.println("The no of negative numbers are :"+negativeCounter);
        System.out.println("The sum is "+sum);
        System.out.println("The average is is "+average);

        }
    }

