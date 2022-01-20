// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|


//Given two integers A and B (A ≤ B). Print all numbers from A to B inclusively.
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Starting value A :");
        int a = obj.nextInt();
        System.out.println("Enter the Ending value B :");
        int b = obj.nextInt();

        if (a>b){
            System.out.println("Value A is smaller to B , counting not possible");
        }

        else if (a<=b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }

    }
}
