// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|


//Factorial: In mathematics, the factorial of an integer n, denoted by n! is the following
//        product:
//        n!=1×2×…×n
//        For the given integer n calculate the value n!


import  java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a positive number to find its factorial :");
        int num = obj.nextInt();


        if (num==0) System.out.println("The factorial of 0 is 0");

        else {

            int factorial = 1;
            int i = num;
            while (i >= 1) {
                factorial *= i;
                i--;
            }
            System.out.printf("The factorial of %d is %d", num, factorial);
        }
    }
}
