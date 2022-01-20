//The number of elements that are greater than the previous one: A sequence consists of
//        integer numbers and ends with the number 0. Determine how many elements of this
//        sequence are greater than their neighbours above.
//        Input: 1 5 2 4 3 0 Output: 2

import java.util.Scanner;
public class loop4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sequence of integers and enter 0 to terminate it :");
        int counter = -1;
        int previousNumber = 0, number = -1;
        while (number!= 0){
            number = input.nextInt();

            if ((number>previousNumber) && (number!=0)) {
                counter+=1;
            }
            previousNumber = number;
        }
        System.out.println(counter);
        }

    }
