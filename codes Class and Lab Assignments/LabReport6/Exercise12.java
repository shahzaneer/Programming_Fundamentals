// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//The number of elements that are greater than the previous one: A sequence consists of
//        integer numbers and ends with the number 0. Determine how many elements of this
//        sequence are greater than their neighbours above.
//        Input: 1 5 2 4 3 0 Output:

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number;
        int prevNumber=0;
        int count=-1;

        System.out.print("Enter integers; 0 being the ending number: ");
        do {
            number=input.nextInt();

            if((number > prevNumber) && (number != 0))
                count++;

            prevNumber=number;
        }while(number != 0);

        System.out.println("Elements greater than their neighbour above: "+count);

    }
}
