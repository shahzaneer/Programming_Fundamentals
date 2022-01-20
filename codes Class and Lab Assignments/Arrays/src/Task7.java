//7.	finding largest value in an array.
public class Task7 {
    public static void main(String[] args) {
       int [] array =  {23,6,777,8,99}; //hard-coded  array
       int max = 0;

       for (int i= 0 ; i <array.length;i++){
           if (array[i]> max) max = array[i];
       }

        System.out.println("The largest number of this  array is "+max);


    }
}
