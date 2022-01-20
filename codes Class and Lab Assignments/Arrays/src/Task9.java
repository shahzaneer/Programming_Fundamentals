//9.	finding index of smallest and largest element.
public class Task9 {
    public static void main(String[] args) {
        int [] array =  {23,6,777,8,99,8888,0};
        int min = 10000;
        int max = 0;
        int maxIndex = 0;
        int minIndex = 0;

        for (int i= 0 ; i <array.length;i++){
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }

        }
        for (int i= 0 ; i <array.length;i++){
            if (array[i]> max) {
                max = array[i];
                maxIndex = i;

            }
        }

        System.out.println("The Smallest number of this  array is on index  "+minIndex);
        System.out.println("The largest number of this  array is on index "+maxIndex);

    }
    }

