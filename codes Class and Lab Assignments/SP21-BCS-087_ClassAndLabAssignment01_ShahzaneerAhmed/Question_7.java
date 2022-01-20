// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Question-7
//        School students like to play a game in which they have blocks each denoting some integer from
//        0 to 9. These are arranged together in a random manner without seeing to form different
//        numbers keeping in mind that the first block is never a 0. Once they form a number they read in
//        the reverse order to check if the number and its reverse is the same. If both are same then the
//        player wins.
//        Now they want to simulate the same in computer. For simulating, the first step is to take input
//        (a number) from the user and check if the number and its reverse number are same or not. If
//        the number and its reverse number are same then user wins otherwise user loses the game.
//        Input: An integer N (3 digit number Only)
//        Output: Win/Lose
//        Example Win
//        Input: 323
//        Output: Win
//        Example Lose
//        Input: 445
//        Output: Lose

import java.util.Scanner;
public class Question_7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a three digit num");
        int num = obj.nextInt();

        int number = num;
        int rev = 0;
        while (num != 0) {
            int lastDigit = num%10;
             rev = rev * 10 + lastDigit;
             num = num/10;

            lastDigit = num%10;
            rev = rev * 10 + lastDigit;
            num = num/10;

            lastDigit = num%10;
            rev = rev * 10 + lastDigit;
            num = num/10;
        }
        if (number == rev) System.out.println("You won!");
        else System.out.println("You lose!");
    }



}
