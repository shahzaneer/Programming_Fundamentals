// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Question – 5:
//        The two roots of a quadratic equation ax2
//        + bx + c = 0 can be obtained using the following
//        formula:
//        b
//        2
//        - 4ac is called the discriminant of the quadratic equation. If it is positive, the equation has two
//        real roots. If it is zero, the equation has one root. If it is negative, the equation has no real roots.
//        Write a program that prompts the user to enter values for a, b, and c and displays the result
//        based on the discriminant. If the discriminant is positive, display two roots. If the discriminant is
//        0, display one root. Otherwise, display “The equation has no real roots”.
//        Note that you can use Math.pow(x, 0.5) to compute . Here are some sample runs.

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("for a quadratic equation ax^2 + bx + x + c = 0 ");
        System.out.println("Enter the value for a :");
        double   a = obj.nextDouble();
        System.out.println("Enter the value for b :");
        double   b = obj.nextDouble();
        System.out.println("Enter the value for c :");
        double   c = obj.nextDouble();

        double disc = (b*b) - (4*a*c);
        double x  = Math.pow(disc,0.5);
        double root_1 = ((-b + x)/(2*a));
        double root_2 = ((-b - x)/(2*a));
        double root = (-b)/(2*a);

        int discriminant = (int) disc;

//        System.out.printf(" %f %f %f %f %f" , disc,x,root_1,root_2,root);  chal rha hai k nhi chal rha hai statement!

        if ( discriminant==0){
            System.out.println("The equation has One real root");
            System.out.println("The root is :"+root);
        }
        else if ( discriminant > 0){
            System.out.println("The equation has two real roots");
            System.out.printf("The roots are %f and %f" , root_1 , root_2);
        }
        else if (discriminant < 0){
            System.out.println("The equation has No real root");
        }

    }
}
