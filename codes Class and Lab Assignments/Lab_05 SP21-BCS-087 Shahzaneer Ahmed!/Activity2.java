//Shahzaneer Ahmed
//SP21-BCS-087
//LAB 04

//Activity-2
//        Show the output of the following statements.
//        a. System.out.printf("amount is %f %e\n", 32.32, 32.32);
//        b. System.out.printf("amount is %5.2%% %5.4e\n", 32.327, 32.32);
//        c. System.out.printf("%6b\n", (1 > 2));
//        d. System.out.printf("%6s\n", "Java");
//        e. System.out.printf("%-6b%s\n",(1 > 2), "Java");
//        f. System.out.printf("%6b%-8s\n",(1 > 2), "Java");

public class Activity2 {
    public static void main(String[] args) {

        System.out.printf("amount is %f %e\n",32.32 , 32.32);
//       amount is 32.320000 3.232000e+01

//        Notice these answers are only true when using System.out.printf() or
//        System.out.format() or the Formatter object.
//        If you use %n in System.out.println(), it will simply produce
//        a %n, not   a newline.

        System.out.printf("amount is %5.2f %5.4e\n", 32.327, 32.32);
//        amount is 32.33 3.2320e+01

        System.out.printf("%6b\n",(1 > 2)); // false with one space to the left

        System.out.printf("%6s\n", "Java"); //  java two spaces on left

        System.out.printf("%-6b%s\n",(1 > 2), "Java"); // false Java

        System.out.printf("%6b%-8s\n",(1 > 2), "Java"); //  falseJava

    }

}
