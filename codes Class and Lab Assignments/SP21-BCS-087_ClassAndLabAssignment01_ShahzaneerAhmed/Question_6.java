// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Question – 6:
//        Mr. Ahmad would like to withdraw X $US from an ATM. The cash machine will only accept the
//        transaction if X is a multiple of 5, and Ahmad's account balance has enough cash to perform the
//        withdrawal transaction (including bank charges). For each successful withdrawal the bank
//        charges 0.50 $US. Calculate Ahmad's account balance after an attempted transaction.
//        Input
//        Positive integer 0 < X <= 2000 - the amount of cash which Ahmad wishes to withdraw.
//        Nonnegative number 0<= Y <= 2000 with two digits of precision - Ahmad's initial account
//        balance.
//        Example - Successful Transaction
//        Input: 30 120.00
//        Output: 89.50
//        Example - Incorrect Withdrawal Amount (not multiple of 5)
//        Input: 42 120.00
//        Output: 120.00
//        Example - Insufficient Funds
//        Input: 300 120.00
//        Output: 120.00
import java.util.Scanner;
public class Question_6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Ahmad's initial Account balance :");
        double initialAmount = obj.nextDouble();
        System.out.println("Enter the amount for withdrawal :");
        double withdrawalAmount = obj.nextDouble();

        double transactionFee = 0.5;

//        declaring boolean values to be used


//        if (initialAmount>withdrawalAmount){
//            withdrawalPossible = true;
//        }
        boolean withdrawalPossible = initialAmount > withdrawalAmount;
        boolean correctWithdrawal = withdrawalAmount%5==0;
        boolean insufficientFunds = initialAmount < withdrawalAmount;

        double newAmount;


//logic implementation using nested conditional structure
        if (withdrawalPossible){
            if (correctWithdrawal){
                newAmount = initialAmount - (withdrawalAmount + transactionFee);
                System.out.printf("input : %.2f \n output : %.2f \n" ,withdrawalAmount,newAmount);
            }
            else{
                System.out.printf("input : %.2f \n output : %.2f  \n ",withdrawalAmount , initialAmount);
            }
        }

        if (insufficientFunds){
            System.out.printf("input : %.2f \n output : %.2f \n ",withdrawalAmount , initialAmount);
        }


        //        logic implementation using relational operators

//        if (withdrawalPossible && correctWithdrawal) {
//            newAmount = initialAmount - (withdrawalAmount + transactionFee);
//            System.out.printf("input : %.2f \n output : %.2f \n" ,withdrawalAmount,newAmount);
//        }
//        else if (withdrawalPossible && (!correctWithdrawal)) {
//
//            System.out.printf("input : %.2f \n output : %.2f \n" ,
//                    withdrawalAmount,initialAmount);
//        }
//        else if (insufficientFunds) System.out.printf("input : %.2f \n output : %.2f \n" ,withdrawalAmount,initialAmount);


    }
}
