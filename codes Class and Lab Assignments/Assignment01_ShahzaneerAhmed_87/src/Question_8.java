// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Question-8
//        A shipping company uses the following function to calculate the cost (in dollars) of shipping
//        based on the weight of the package (in pounds).
//        Write a program that prompts the user to enter the weight of the package and display the
//        shipping cost. If the weight is greater than 50, display a message “the package cannot be
//        shipped.”

import java.util.Scanner;
public class Question_8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the weight of object in pounds to be shipped : ");
        double weight  = obj.nextDouble();

        if ((weight>0) && (weight<=1)) System.out.println("The shipping cost is $ 3.5");
        else if ((weight>1) && (weight<=3)) System.out.println("The shipping cost is $ 5.5");
        else if ((weight>3) && (weight<=10)) System.out.println("The shipping cost is $ 8.5");
        else if ((weight>10) && (weight<=20)) System.out.println("The shipping cost is $ 10.5");
        else if (weight>=50) System.out.println("The package cannot be shipped");
    }
}
