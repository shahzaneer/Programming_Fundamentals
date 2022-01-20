//8.	finding smallest value in array.
public class Task8 {
    public static void main(String[] args) {
        int [] array =  {23,6,777,8,99};
        int min = Integer.MAX_VALUE;

        for (int i= 0 ; i <array.length;i++){
            if (array[i] < min) min = array[i];
        }

        System.out.println("The Smallest number of this  array is "+min);

    }
}
