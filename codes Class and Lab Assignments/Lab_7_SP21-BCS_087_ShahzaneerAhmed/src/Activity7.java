//Shahzaneer Ahmed
//SP21-BCS-087
//Activity-7
//        A milk carton can hold 3.78 liters of milk. Each morning, a dairy farm ships cartons of milk to a local grocery
//        store. The cost of producing one liter of milk is $0.38, and the profit of each carton of milk is $0.27. Write a
//        program that does the following:
//        a. Prompts the user to enter the total amount of milk produced in the morning
//        b. Outputs the number of milk cartons needed to hold milk (Round your answer to the nearest
//        integer.)
//        c. Outputs the cost of producing milk
//        d. Outputs the profit for producing milk

import java.util.Scanner;
public class Activity7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the total amount of milk");
        double total_milk = obj.nextDouble();
        System.out.println("");
        double cartons = (total_milk/3.78);
        if (cartons==0){
            System.out.println("The Total No of cartons to hold milk is  : 1");
        }else{
            System.out.println("The total No of Cartons to Hold Milk are :"+(int)cartons);
        }

        double cost_milk = total_milk*0.38;
        double profit_milk = total_milk*0.27;

        System.out.println("The cost of Milk produced is :"+(float)cost_milk+" Dollars ");
        System.out.println("The profit of Milk produced is :"+(float)+profit_milk+" Dollars ");



    }
}
