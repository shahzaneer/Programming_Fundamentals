//The maximum of the Sequence: A sequence consists of integer numbers and ends with
//        the number 0. Determine the largest element of the sequence.
//        The index of the maximum of a sequence: A sequence consists of integer numbers and
//        ends with the number 0. Determine the index of the largest element of the sequence. If the
//        highest element is not unique, print the index of the first of them.
//        Input:1 2 3 2 1 0 Output:3


import java.util.Scanner;
public class loop2 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int max = 0;
        System.out.println("Enter the sequence and enter 0 to terminate the input : ");
        int integer = -1;
        int counter = -1; // counter starts from -1
        int index = 0;
        while(integer!=0){
            integer = input.nextInt();
            counter+=1; //after getting first value we put it on the first index i.e zero
            if (integer>max) {
                max = integer;
                index = counter;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
