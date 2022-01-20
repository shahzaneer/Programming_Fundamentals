// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Question – 1: This question focuses on the types of errors
//        a. Write JAVA statements that can produce Syntax Errors. Give three different examples
//        and write the names of errors
//        b. Write JAVA statements that can produce Logical Errors. Give three different examples
//        and briefly explain the reason (1-2 lines)
//        c. Write JAVA statements that can produce Run Time Errors. Give three different examples
//        and briefly explain the reason (1-2 lines)
//        d. The following program has syntax errors. Write clearly type of error and its correction
//        (in tabular form). After you have corrected the syntax errors, show the output of this
//        program.

// count = 1;
//         sum = count + PRIME;
//         x := 25.67;
//         newNum = count * ONE + 2;
//         sum + count = sum;
//         x = x + sum * COUNT;
//         System.out.println(" count = " + count + ", sum = "
//         + sum + ", PRIME = " + Prime);

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        int count = 1;  // count is not declared!
        int PRIME = 1;
        int sum = count + PRIME;  //sum was not declared and prime was not initialized
         double x = 25.67;  //invalid syntax for initializing  and declaring is absent
        int ONE = 1;
        int newNum = count * ONE + 2; //newNum and ONE were not declared!
        sum = sum+count; // we have to assign a value to the left and the components to the right.
        x = x + sum * count; //invalid identifier name
        System.out.println(" count = " + count + ", sum = "
                + sum + ", PRIME = " + PRIME); //invalid identifier name




    }
}
class A{
//    solution to a.
//    a.1
//     a = 10; // identifier expected
//    it can be resolved by putting the keyword of identifier which is int in this case

//    a.2
//    int ahmed(int x){
//        System.out.println("this is ahmed");
//    }  //missing return statement
//    the function is returning int and we have returned nothing so it is showing us an error

//    a.3
//public static void main(String[] args) {
//    System.out.println("Shahzaneer Ahmed!") //terminator missing error , semi colon was expected
//}
}

class B{
//    solution to b
//    b.1
//    int a=10 ,b= 3;
//    int sum = a*b; // a logical error as we were supposed to add them but we just multiplied them.

//    b.2
//    int a = 10 , b = 3 , c = 90;
//    int avg = (a+b+c)/100;  //we were supposed to get average of three numbers and instead of dividing it by 3 we
//    divided it by 100 which is a logical mistake

//    b.3
// int a = 10;
// int b = 100;

// int remainder = b/a; // instead of taking modulo % we have divided  which will give us quotient not the remainder
    // and this is also a logical mistake.

}

class C {
    //    solution to c
//    c.1
    static int a = 1;
//    int b = a/0; // division by zero is not possible the program will crash ultimately therefore it runtime error
//    as it shows upo during the execution of the program.

//    c.2
//public static void main(String[] args) {
//    System.out.printf("Im shahzaneer Ahmed! %s %d ", a);  //missing argument error , it is not a logical not a syntax
    // error but during the execution of program the program was collapsed

    //    c.3
//  Scanner obj = new Scanner(System.in);
//  int = obj.nextInt(); // instead to entering an integer value if I typed a String value the prgram will crash in the
    // meantime , not handling certain input values also results in runtime errors
    }


