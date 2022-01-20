// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Question – 5: CLO-1
//        Write a program that calculates and prints the monthly paycheck for an employee. The net pay
//        is calculated after taking the following deductions:
//        Federal Income Tax: 15%
//        State Tax: 3.5%
//        Social Security Tax: 5.75%
//        Medicare/Medicaid Tax: 2.75%
//        Pension Plan: 5%
//        Health Insurance: $75.00
//        Your program should prompt the user to input the gross amount and the employee name.
//        Format your output to have two decimal places. A sample output follows:
//
import java.util.Scanner;
public class Question_5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name :");
        String employeeName = obj.nextLine();
        System.out.println("Enter your Gross Amount :");
        double grossAmount = obj.nextDouble();
        double federalIncomeTax , stateTax, socialSecurityTax, medicareTax, pensionPlan, healthInsurance, netPay;

        federalIncomeTax = grossAmount*0.15;
        stateTax = grossAmount*(3.5/100);
        socialSecurityTax = grossAmount*(5.75/100);
        medicareTax = grossAmount*(2.75/100);
        pensionPlan = grossAmount*0.05;
        healthInsurance = 75.00;
        double cutPay = federalIncomeTax+stateTax+socialSecurityTax+medicareTax+pensionPlan+healthInsurance;
        netPay = grossAmount - cutPay;

        System.out.printf("%s\n",employeeName);
        System.out.printf("Gross Amount:                      $ %10.2f\n",grossAmount);
        System.out.printf("Federal Tax :                      $ %10.2f\n",federalIncomeTax);
        System.out.printf("State Tax   :                      $ %10.2f\n",stateTax);
        System.out.printf("Social Security Tax:               $ %10.2f\n",socialSecurityTax);
        System.out.printf("Medicare Tax:                      $ %10.2f\n",medicareTax);
        System.out.printf("Pension Plan:                      $ %10.2f\n",pensionPlan);
        System.out.printf("Health Insurance:                  $ %10.2f\n",healthInsurance);
        System.out.printf("Net pay :                          $ %10.2f\n",netPay);

    }
}
