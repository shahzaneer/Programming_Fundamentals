
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
