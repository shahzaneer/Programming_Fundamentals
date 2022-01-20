//Shahzaneer Ahmed
//SP21-BCS-087
//LAB 04

//Activity-18
//        Book Club Points
//        Serendipity Booksellers has a book club that awards points to its customers based on
//        the number of books purchased each month. The points are awarded as follows:
//        • If a customer purchases 0 books, he or she earns 0 points.
//        • If a customer purchases 1 book, he or she earns 5 points.
//        • If a customer purchases 2 books, he or she earns 15 points.
//        • If a customer purchases 3 books, he or she earns 30 points.
//        • If a customer purchases 4 or more books, he or she earns 60 points.
//        Write a program that asks the user to enter the number of books that he or she has
//        purchased this month and displays the number of points awarded.
import java.util.Scanner;
public class Activity18 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no of books purchased in a month :");
        int bookPurchased = obj.nextInt();

        if (bookPurchased==0) System.out.println("You earned 0 points !");
        else if (bookPurchased==1) System.out.println("You earned 5 points !");
        else if (bookPurchased==2) System.out.println("You earned 15 points !");
        else if (bookPurchased==3) System.out.println("You earned 30 points !");
        else if (bookPurchased>=4) System.out.println("You earned 60 points !");
    }
}
