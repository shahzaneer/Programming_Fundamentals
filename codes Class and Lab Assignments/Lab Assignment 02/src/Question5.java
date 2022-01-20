
//------------------------------------------------------------
//----------------Shahzaneer Ahmed----------------------------
//////////////////SP21-BCS-087--------------------------------
//----------------Lab Assignment 02---------------------------
//------------------------------------------------------------


//Question – 5: ______
//        The area of a pentagon can be computed using the following formula:
//        Write a method that returns the area of a pentagon using the following header:
//public static double area(double side)
//        Write a main method that prompts the user to enter the side of a pentagon and displays its area
//        Sample Run
//        Enter the side: 5.5
//        The area of the pentagon is 52.0444413678162

import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the side of a pentagon");
        double side = input.nextDouble();
        double AREA = area(side);
        System.out.println(AREA);
    }

    public static double area(double side){
        return ((5*(side*side))/(4*(Math.tan(Math.PI/5))));
    }

}
