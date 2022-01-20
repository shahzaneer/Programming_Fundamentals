//Shahzaneer Ahmed
//SP21-BCS-087
//Activity 2

//Consider the following Java program in which the statements are in the incorrect order. Rearrange the
//        statements so that it prompts the user to input the length and width of a rectangle and output the area
//        and perimeter of the rectangle.
//public class Activity2
//{
//    Scanner console = new Scanner(System.in);
//import java.util.*;
//    {
//        public static void main(String[] args)
//        int width;
//        System.out.print("Enter the length: ");
//        width = console.nextInt();
//        System.out.println();
//        int length;
//        System.out.print("Enter the width: ");
//        length = console.nextInt();
//        System.out.println();
//        area = length * width;
//        System.out.println("Area = " + area);
//        System.out.println("Perimeter = " + perimeter);
//        perimeter = 2 * (length + width);
//        int area;
//        int perimeter;
//    }

import java.util.Scanner;
public class Activity2 {
    public static void main(String[] args) {
        int length ,width;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the Length :");
         length = console.nextInt();
        System.out.println("Enter the Width :");
         width = console.nextInt();
        System.out.println();

        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("The area of rectangle is "+ area +" Units " );
        System.out.println("The area of rectangle is "+ perimeter+ " Units "  );
    }

}
