//12.	Shifting elements in array(right-shift)+(left-shift).

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
//        right shift
        rightShift(numbers);
//        left shift
        leftShift(numbers);

    }
    static void rightShift(int[] array){
//     right shift main akhiri element pehlay aajata hai! {1,2,3,4,5} --> {5,1,2,3,4}

        int [] temp = new int[array.length];
        for (int i = 0; i < array.length;i++){
            int newPosition = (i + 1) % array.length;
            temp[newPosition] = array[i];

        }
        System.out.println(Arrays.toString(temp));
    }
    static void leftShift(int [] array){
//     left shift main pehla element akhir main aajata hai! {1,2,3,4,5} --> {2,3,4,5,1}
        int [] temp = new int[array.length];
        for(int i = 0; i < array.length;i++){
        int newPosition = ((i-1) + array.length) % array.length;
        temp[newPosition] = array[i];
        }

        System.out.println(Arrays.toString(temp));
    }
}
