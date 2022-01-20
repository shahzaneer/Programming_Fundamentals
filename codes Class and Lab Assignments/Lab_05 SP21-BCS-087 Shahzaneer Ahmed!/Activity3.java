//Shahzaneer Ahmed
//SP21-BCS-087
//LAB 04

//Activity-3
//        What is wrong in the following statements?
//        a. System.out.printf("%5d %d", 1, 2, 3);
//        b. System.out.printf("%5d %f", 1);
//        c. System.out.printf("%5d %f", 1, 2);

public class Activity3 {
    public static void main(String[] args) {
        System.out.printf("%5d %d", 1, 2, 3); // 5 spaces 1 1space 3 is ignored as it isn't used.
//        System.out.printf("%5d %f", 1);  //Exception in thread "main" java.util.MissingFormatArgumentException: Format specifier '%f'
//        %f is unnecessary  used.
      //  System.out.printf("%5d %f", 1, 2);  //invalid argument of formatted specifiers
//        Exception in thread "main" java.util.IllegalFormatConversionException: f != java.lang.Integer


    }
}
