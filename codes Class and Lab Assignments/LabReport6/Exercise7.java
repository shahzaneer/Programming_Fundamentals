// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Number of zeros: Given N numbers: the first number in the input is N, after that N integers
//        are given. Count the number of zeros among the given integers and print it.
//        You need to count the number of numbers that are equal to zero, not the number of zero
//        digits.
//        Input: 5 0 700 0 200 2 Output: 2
//        Input: 6 0 0 0 0 0 0 Output: 6


import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no of Integers you wanted to enter :");
        int numbers = obj.nextInt();
        System.out.println("Now please enter "+numbers +" Numbers");
        int count = 0;
        int i = 1;
        while(i<=numbers){
            int integer = obj.nextInt();
            if (integer==0) count+=1;
            i++;
        }
        System.out.println(count);
    }
}
