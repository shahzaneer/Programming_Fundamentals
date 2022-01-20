//11.	shuffling elements randomly in an array.

import java.util.Arrays;
import java.util.Random;
public class Task11 {
    public static void main(String[] args) {
        int [] integers = {1,2,3,4,5};
//        String [] words = {"Shah", "Ahmed", "Raza", "iqbal"};

        shuffle(integers);

//        array reference type hai iska behaviour integer type se different hota hai aur values jo hum function main
//        modify krdete hain wohi rehtin hain.
//        it passes by reference/object.
//        it do not passes by value as in the case of integers.

        for (int i = 0 ; i < integers.length;i++) System.out.print(integers[i]+ " ");
//        System.out.println(Arrays.toString(integers));

    }

    static void shuffle(int [] array){

        Random rand = new Random();
        for (int i = 0; i < array.length;i++){
            int s = rand.nextInt(array.length);

            int temp = array[s];
            array[s] = array[i];
            array[i] = temp;
        }
    }

}
