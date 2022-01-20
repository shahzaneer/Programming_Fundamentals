// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//The index of the maximum of a sequence: A sequence consists of integer numbers and
//        ends with the number 0. Determine the index of the largest element of the sequence. If the
//        highest element is not unique, print the index of the first of them.
//        Input:1 2 3 2 1 0 Output:3

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number;
        int max=0;
        int numIndex=0;
        int indexOfMax=0;
        System.out.print("Enter integers; 0 being the ending number: ");
        do {
            number=input.nextInt();
            ++numIndex;
            if(number>max) {
                max=number;
                indexOfMax=numIndex;
            }
        }while(number != 0);

        System.out.println("Maximum of sequence: "+max);
        System.out.printf("Index of %d: %d",max,indexOfMax);

    }
}
