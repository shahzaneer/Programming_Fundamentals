
//3.	Declaring and Initializing Array ( Assigning values at each index of array).
public class Task3 {
    public static void main(String[] args) {
        int [] integers = new int [2];
//        assigning values to the subscripted variables.
        integers[0] = 1;
        integers[1] = 2;
        char [] characters = new char [2];
        characters[0] = 'a';
        characters[1] = 'b';
        String [] words = new String [2];
        words[0] = "Shahzaneer";
        words[1] = "Ahmed";
        boolean [] isTrue = new boolean [2];
        isTrue[0] = true;
        isTrue[1] = true;
        double [] floatingNumbers = new double[2];
        floatingNumbers[0] = 23.4;
        floatingNumbers[1] = 256.7;


        for (int e : integers) System.out.println(e);
        for (char e : characters) System.out.println(e);
        for (String e : words) System.out.println(e);
        for (double e : integers) System.out.println(e);
        for (boolean e : isTrue) System.out.println(e);
    }
}
