//Shahzaneer Ahmed
//SP21-BCS-087
//LAB 04

//Activity-16
//        Color Mixer
//        The colors red, blue, and yellow are known as the primary colors because they cannot
//        be made by mixing other colors. When you mix two primary colors, you get a secondary
//        color, as shown here:
//        When you mix red and blue, you get purple.
//        When you mix red and yellow, you get orange.
//        When you mix blue and yellow, you get green.
//        Design a program that prompts the user to enter the names of two primary colors to
//        mix. If the user enters anything other than “red,” “blue,” or “yellow,” the program
//        should display an error message. Otherwise, the program should display the name of
//        the secondary color that results

import java.util.Scanner;
public class Activity16 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two colors to mix among red , yellow and blue :");
        System.out.println("Color 1 :");
        String color1 = obj.next();
        System.out.println("Color 2 :");
        String color2 = obj.next();

        if (color1.equals("red") && color2.equals("blue")) System.out.println(" Purple");
        else if (color1.equals("blue") && color2.equals("red")) System.out.println(" Purple");
        else if (color1.equals("red") && color2.equals("yellow")) System.out.println(" Orange");
        else if (color1.equals("yellow") && color2.equals("red")) System.out.println(" Orange");
        else if (color1.equals("blue") && color2.equals("yellow")) System.out.println(" Purple");
        else if (color1.equals("yellow") && color2.equals("blue")) System.out.println(" Purple");
        else System.out.println("error! please enter  primary colors !!");

    }
}
