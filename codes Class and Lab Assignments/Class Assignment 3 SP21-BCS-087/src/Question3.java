//------------------------------------------------------------------
//--------------------SHAHZANEER AHMED------------------------------
//-----------------------SP21-BCS-087-------------------------------
//-----------------------Class Assignment---------------------------
//-----------------------Question 3---------------------------------
//------------------------------------------------------------------

//Question – 3: ______
//        Write a Menu Driven JAVA program that creates one-dimensional array arr[] and initialize it
//        with user. The program should do following Tasks using Menu, the menu operations are
//        implemented using methods:
//        1. Write a method count(), that counts the occurrences of x (a number) in arr[].
//        2. Write a method partition(), that take the first element of the array x and put x in a
//        position such that all smaller elements (smaller than x) are before x, and put
//        all greater elements (greater than x) after x.
//        3. Write a method duplicates(),which calculate the frequencies of all the elements
//        and display them.
//        4. Write a method circular(),which replace every element of the array by the sum of
//        next two consecutive elements in a circular manner i.e.
//        arr[0] = arr[1] + arr[2], arr[1] = arr[2] + arr[3], … arr[n – 1] = arr[0] + arr[1].
//        5. Write a method shiftCircular(), which shifts an array circularly left by two
//        positions. Thus, if p[0] = 15, p[1]= 30, p[2] = 28, p[3]= 19 and p[4] = 61 then
//        after the shift p[0] = 28, p[1] = 19, p[2] = 61, p[3] = 15 and p[4] = 30

import java.util.Arrays;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the Elements of array ");

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter element at %d index : ", i);
            array[i] = input.nextInt();
        }

        while (true) {
            System.out.println("Enter corresponding number to find the result :");
            System.out.println("""
                    1. Count the Appearance of an element (x).
                    2. Partition (takes the first element and shifts smaller elements to left and greater on right)
                    3. Duplicates (Frequency of each element in array)
                    4. Circular  (prints the sum of next two terms at ith position WRT array indexing)
                    5. ShiftCircular (shifts two positions the elements to left)
                    6. Exit
                    """);
            int selection = input.nextInt();

            if (selection == 6) System.exit(0);

                switch (selection) {
                    case 1 -> counts(array);
                    case 2 -> partition(array);
                    case 3 -> duplicate(array);
                    case 4 -> circular(array);
                    case 5 -> shiftCircular(array);

                }
            }

    }
        static void shiftCircular ( int[] array){
            int[] shiftCircularArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                shiftCircularArray[i] = array[((array.length + (i - 3)) % array.length)];
            }

            System.out.println(Arrays.toString(shiftCircularArray));

        }

        static void circular ( int[] array){
            int[] arrayCircular = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                arrayCircular[i] = array[(i + 1) % array.length] + array[(i + 2) % array.length];
            }

            System.out.println(Arrays.toString(arrayCircular));

        }

        static void duplicate ( int[] array){
            int[] visitedArray = new int[array.length]; //creating array of equal size as of array.
            int visited = -1; //a flag value to be used at the index of visitedArray if the element is already visited!

            for (int i = 0; i < array.length; i++) {
                int count = 1;
                for (int j = 1 + i; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        visitedArray[j] = visited;
                    }
                }

                if (visitedArray[i] != visited) {
                    visitedArray[i] = count;
                }
            }

            for (int i = 0; i < array.length; i++) {
                if (visitedArray[i] != visited) {
                    System.out.printf("The frequency of %d in array is %d \n", array[i], visitedArray[i]);
                }
            }
        }


        static void partition ( int[] array){
            int target = array[0];
            int countTargetGreater = 0;
            int countTargetSmaller = 0;
            int counterTarget = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] > target) countTargetGreater++;
                else if (array[i] < target) countTargetSmaller++;
                else if (array[i] == target) counterTarget++;
            }
            int[] greaterElements = new int[countTargetGreater];
            int[] smallerElements = new int[countTargetSmaller];
            int[] targetElements = new int[counterTarget];


            int greaterElementsIndex = 0;
            for (int i : array) {
                if (i > target) {
                    greaterElements[greaterElementsIndex] = i;
                    greaterElementsIndex++;
                }
            }

            int smallerElementsIndex = 0;
            for (int i : array) {
                if (i < target) {
                    smallerElements[smallerElementsIndex] = i;
                    smallerElementsIndex++;
                }
            }

            int targetElementsIndex = 0;
            for (int i : array) {
                if (i == target) {
                    targetElements[targetElementsIndex] = i;
                    targetElementsIndex++;
                }
            }
//        now filling the required array!
            int[] partitionArray = new int[greaterElementsIndex + smallerElementsIndex + targetElementsIndex];

//        copying elements in index;
//        System.arraycopy(smallerElements,0,partitionArray,0,smallerElementsIndex);
//        System.arraycopy(targetElements,0,partitionArray,smallerElements.length,targetElements.length);
//        System.arraycopy(greaterElements,0,partitionArray,targetElements.length,greaterElements.length);

            int index = 0;
            for (int i : smallerElements) {
                partitionArray[index] = i;
                index++;
            }
            for (int i : targetElements) {
                partitionArray[index] = i;
                index++;
            }
            for (int i : greaterElements) {
                partitionArray[index] = i;
                index++;
            }

//      displaying
            System.out.println(Arrays.toString(partitionArray));


        }

        static void counts ( int[] array){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number whose occurrence you want to find :");
            int number = input.nextInt();
            int counter = 0;
            for (int j : array) {
                if (j == number) counter++;
            }
            System.out.printf("The number %d appeared %d times in the array !\n", number, counter);
        }

}
