
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of the Items you want to enter :");
        int num = input.nextInt();
        String [] arr = new String [num];

        for (int i = 0; i<num;i++){
            arr[i] = input.next();
        }

        for (String e: arr){
            System.out.println(e);
        }
    }
}
