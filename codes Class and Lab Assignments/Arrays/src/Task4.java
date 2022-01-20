//4.	Initializing an Array by getting values from the user.
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter how many members of an array do you want :");
        int sizeArray = input.nextInt();

        int [] array =  new int [sizeArray];

//  for printing the default values of an array !
        for (int a : array) System.out.println(a);
    }
}
