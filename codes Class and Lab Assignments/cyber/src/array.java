import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //object creation
        double [] numbers = new double[5];
        for (int i=0;i<numbers.length;i++){
            System.out.print("Enter element at position "+i);
            numbers[i] = input.nextDouble();
        }

        System.out.println(Arrays.toString(numbers));
//        for(int i=0;i<numbers.length;i++){
//            System.out.println(numbers[i]);
//        }
    }
}
