

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
