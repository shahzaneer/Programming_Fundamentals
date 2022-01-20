//Shahzaneer Ahmed
//SP21-BCS-087
//LAB 04

//Activity-17
//        Change for a Dollar Game
//        Create a change-counting game that gets the user to enter the number of coins required
//        to make exactly one dollar. The program should prompt the user to enter the number of
//        pennies, nickels, dimes, and quarters. If the total value of the coins entered is equal to
//        one dollar, the program should congratulate the user for winning the game. Otherwise,
//        the program should display a message indicating whether the amount entered was
//        more than or less than one dollar

import java.util.Scanner;
public class Activity17 {
    public static void main(String[] args) {

//        100 pennies are a dollar
//        20 nickels are a dollar
//        10 dimes are a dollar
//        4 quarters  are a dollar
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of Pennies:");
        int  pennies = obj.nextInt();
        System.out.print("Enter the number of Nickels:");
        int  nickels = obj.nextInt();
        System.out.print("Enter the number of Dimes:");
        int  dimes = obj.nextInt();
        System.out.print("Enter the number of Quarters:");
        int quarters = obj.nextInt();

        int  pennies_conversion = pennies/100;  //converting no of pennies in dollars
        int  nikels_conversion = nickels/20;    // ..........................nickels
        int  dimes_conversion = dimes/10;       //............................dimes
        int quarters_conversion = quarters/4;   //.........................quarters

//    now adding the total amount of dollar!
        double dollar = (pennies_conversion+nikels_conversion+dimes_conversion+quarters_conversion);



//        System.out.println(dollar);  // used it for checking it

        if(dollar == 1) System.out.println("Congratulations You Won a Dollar");

        else if(dollar>1) System.out.println("Amount is more than a Dollar");

        else if (dollar<1) System.out.println("Amount is less than a Dollar");







    }
}
