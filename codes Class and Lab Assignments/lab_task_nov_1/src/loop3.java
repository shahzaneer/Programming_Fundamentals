//The number of even elements of the sequence: Determine the number of even elements
//        in the sequence ending with the number 0

import java.util.Scanner;
public class loop3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sequence and enter 0 to terminate it :");
        int integer = -1;
        int counter = 0;
        while (integer!=0){
            integer = input.nextInt();

            if ((integer%2==0) && (integer!=0)) counter+=1;
        }

        System.out.println("The no of even numbers in a statement are :"+counter);

    }
}
