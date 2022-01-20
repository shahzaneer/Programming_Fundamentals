// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Question – 4:
//        Write a program that prompts the user to enter an integer and determines whether it is divisible
//        by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both.
//        Here is a sample run of this program:

import java.util.Scanner;
public class Question_4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any Integer :");
        int integer = obj.nextInt();

        boolean divisibleOr = false , divisibleAnd = false , divisibleXor = false;

        if ((integer%5==0) && (integer%6==0)) divisibleAnd = true;
        if ((integer%5==0) ^ (integer%6==0)) divisibleXor = true;
        if((integer%5==0) || (integer%6==0)) divisibleOr = true;

        System.out.printf("IS The integer %d  divisible by 5 and 6 ? : %b\n" ,integer,divisibleAnd);
        System.out.printf("IS The integer %d  divisible by 5 or 6 ? : %b\n" ,integer,divisibleOr);
        System.out.printf("IS The integer %d  divisible by 5 or  6  but not both? : %b\n" ,integer,divisibleXor);

    }
}
