// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//The length of Sequence: Given a sequence of non-negative integers, where each number
//        is written in a separate line. Determine the length of the sequence, where the sequence ends
//        when the integer is equal to 0. Print the length of the sequence (not counting the integer 0).
//        The numbers following the number 0 should be omitted.
//        Input: 1 2 3 4 5 6 7 0 1 2 3 Output:7

import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int number;
        int length=0;
        int maxLength=0;

        System.out.print("Enter integers; -1 being the ending number: ");
        do {
            number=input.nextInt();

            length= (number !=0 && number != -1)? ++length:length;

            if (number == 0 || number == -1) {

                maxLength= Math.max(maxLength, length);

                length=0;
            }
        }while(number != -1);
        System.out.println("Length of largest sequence: "+maxLength);

    }
}
