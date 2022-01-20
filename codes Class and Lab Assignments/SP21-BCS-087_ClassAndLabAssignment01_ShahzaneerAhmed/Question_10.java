// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Question-10
//        Write a program that prompts the user to enter a point (x, y) and checks whether the point is
//        within the circle centered at (0, 0) with radius 10. For example, (4, 5) is inside the circle and (9,
//        9) is outside the circle, as shown in Figure

import java.util.Scanner;
public class Question_10 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the x- coordinate of the point :");
        double x_coordinate = obj.nextDouble();
        System.out.println("Enter the y- coordinate of the point :");
        double y_coordinate = obj.nextDouble();

        double x2 = (x_coordinate*x_coordinate);
        double y2 = (y_coordinate*y_coordinate);
        double distanceF = Math.pow((x2+y2),0.5);

        int distanceFormula = (int) distanceF;

        int radius = 10;

        if (distanceFormula == 10) System.out.println("The point is on the circle !");
        else if (distanceFormula > 10) System.out.println("The point is outside/not inside the circle !");
        if (distanceFormula < 10) System.out.println("The point is inside the circle !");


//        System.out.println(distanceFormula);
    }
}
