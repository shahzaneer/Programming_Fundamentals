// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Question – 1:
//        Cindy uses the services of a brokerage firm to buy and sell stocks. The firm charges 1.5% service
//        charges on the total amount for each transaction buy or sell. When Cindy sells stocks, she would
//        like to know if she gained or lost on a particular investment. Write a program that allows Cindy
//        to input the number of shares sold the purchase price of each share, and the selling price of
//        each share. The program outputs the amount invested, the total service charges, amount gained
//        or lost, and the amount received after selling the stock.

import java.util.Scanner;
public class Question_1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double BROKERAGE_SERVICE_CHARGES = 1.5/100;
        System.out.println("Enter the no of shares sold : ");
        double noOfShares  = obj.nextDouble();
        System.out.println("Enter the purchase price of each Share : ");
        double purchasePrice = obj.nextDouble();
        System.out.println("Enter the Selling price of each share : ");
        double sellingPrice = obj.nextDouble();

        double investedAmount = (noOfShares*purchasePrice);
        double totalServiceCharges = noOfShares*sellingPrice*BROKERAGE_SERVICE_CHARGES;
        double amountReceived = investedAmount+totalServiceCharges;

        boolean amountGained = amountReceived>investedAmount;
        boolean amountLost = amountReceived<investedAmount;

        System.out.printf("The total invested amount is $ %.2f\n",investedAmount);
        System.out.printf("The total amount received  is $ %.2f\n",amountReceived);
        System.out.printf("The total Service Charges  are  $ %.2f\n",totalServiceCharges);

        if(amountGained) System.out.println("The Stock exchange was a gain!");
        else if (amountLost) System.out.println("The Stock exchange was a lost!");









    }
    
}
