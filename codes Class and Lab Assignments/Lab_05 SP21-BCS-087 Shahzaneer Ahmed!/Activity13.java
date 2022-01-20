//Shahzaneer Ahmed
//SP21-BCS-087
//LAB 04

//Activity-13
//        Areas of Rectangles
//        The area of a rectangle is the rectangle’s length times its width. Write a program that
//        asks for the length and width of two rectangles. The program should tell the user which
//        rectangle has the greater area, or if the areas are the same.

import java.util.Scanner;
public class Activity13 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Length of 1st Rectangle :");
        double len1 = obj.nextDouble();
        System.out.println("Enter the width of 1st Rectangle :");
        double wid1 = obj.nextDouble();
        System.out.println("Enter the Length of 2nd Rectangle :");
        double len2 = obj.nextDouble();
        System.out.println("Enter the width of 2nd Rectangle :");
        double wid2 = obj.nextDouble();

        double  areaFirstRectangle = len1*wid1;
        double  areaSecondRectangle = len2*wid2;

        if (areaFirstRectangle>areaSecondRectangle) System.out.println("The first Rectangle has greater area that is " +areaFirstRectangle +" Units");
        if (areaFirstRectangle<areaSecondRectangle) System.out.println("The Second Rectangle has greater area that is" +
                " " +areaSecondRectangle +" Units");
        if (areaFirstRectangle==areaSecondRectangle) System.out.println("Both Rectangles have equal Areas i.e. " +
                " " +areaSecondRectangle +" Units each ");






    }

}
