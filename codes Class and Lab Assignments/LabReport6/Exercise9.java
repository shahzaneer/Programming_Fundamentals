// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//The maximum of the Sequence: A sequence consists of integer numbers and ends with
//        the number 0. Determine the largest element of the sequence.

import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int number;
        int max=0;

        System.out.print("Enter integers; 0 being the ending number: ");
        do {
            number=input.nextInt();

            if(number>max) {
                max=number;

            }
        }while(number != 0);

        System.out.println("Maximum of sequence: "+max);



    }
}
