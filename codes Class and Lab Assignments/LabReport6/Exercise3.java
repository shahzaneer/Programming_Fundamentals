// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//10 numbers are given in the input. Read them and print their sum. Use as few variables as
//        you can.

import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 10 integers :");

        int sum = 0;
        int i = 1;
        while (i<=10){
            int integer = obj.nextInt();
            sum+=integer;
            System.out.println("Integer "+i +" is "+integer);
            i++;
        }
        System.out.println("The sum is :"+sum);
    }
}