//5.	Initializing an Array by Random numbers.

import java.util.Random;
public class Task5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int arraySize = 1 + rand.nextInt(50);
        int [] array = new int [arraySize];
        for (int i :array) System.out.println(i);

//        for (int i = 0 ; i < array.length;i++) System.out.println(rand.nextInt(50));
    }

}
