//13.	enter elements at k’th location.

import java.util.Arrays;
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the index of array :");
        int indexArray = input.nextInt();
        int [] array = new int[indexArray];
        System.out.println("Enter elements of arrays separated by a space :");
        for (int i = 0; i<array.length;i++){
            array[i] = input.nextInt();
        }
        System.out.println("Enter the index where you want to add up an element :");
        int newIndex = input.nextInt();
        int [] newArray = new int [indexArray+1];
        System.out.println("Enter element you wanted to added :");
        int newElement = input.nextInt();

        for (int i = 0; i<newIndex;i++){
            newArray[i] = array[i];
        }
        newArray[newIndex] = newElement;

        for (int i = newIndex; i<array.length; i++){
//            int newPosition = (i+1) % array.length;
            int newPosition = (i+1); // haven't used the modulus here because we need to increase the index not to
            // placed it on the first position like in previous case.
            newArray[newPosition] = array[i];
        }


// {11,22,33,44,55} ---> {11,22,12,33,44,55}

        System.out.println(Arrays.toString(newArray));
    }
}
