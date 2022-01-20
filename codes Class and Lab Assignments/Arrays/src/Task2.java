//2.	 Check default values for each type.
import java.util.Arrays;
public class Task2 {
    public static void main(String[] args) {
//        we know the default values of these types of array are 0 for integer 0.0 for float/double /u0000(null
//        character) for character, false for boolean, null for String.
//        we will check these by printing these.

        int [] integers = new int [2];
        System.out.println(Arrays.toString(integers)); //address return hoga
//        {0,0};
        char [] characters = new char [2];
        String [] words = new String [2];
        boolean [] isTrue = new boolean [2];
        double [] floatingNumbers = new double[2];

        for (int e : integers) System.out.println(e);
        for (char e : characters) System.out.println(e);
        for (String e : words) System.out.println(e);
        for (double e : integers) System.out.println(e);
        for (boolean e : isTrue) System.out.println(e);



    }

    }

