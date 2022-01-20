//14.	deleting elements from k’th location.
import java.util.Arrays;
import java.util.Scanner;
public class Task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the index of array :");
        int index = input.nextInt();
        int [] array  = new int [index];
        System.out.println("Enter  the elements of array with a space separating one another :");
        for (int i = 0; i<array.length;i++){
            array[i] = input.nextInt();
        }
        System.out.println("Enter the position where you do want to delete the item ");
        int deletePosition = input.nextInt();

        int [] newArray = new int[index-1];

        for(int i = 0; i < deletePosition;i++){
            newArray[i] = array[i];
        }
        for (int i = deletePosition+1; i < array.length;i++){
            int newPosition = i-1;
            newArray[newPosition]  = array[i];
        }

        System.out.println(Arrays.toString(newArray));

    }
}
