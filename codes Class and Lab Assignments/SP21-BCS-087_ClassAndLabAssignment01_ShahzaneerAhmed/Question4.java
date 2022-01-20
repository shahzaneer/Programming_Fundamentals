// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Question – 4: This question focuses on the Selection Structure in JAVA Language
//        a. Suppose that you have the following declaration:
//        int j = 0;
//        The output of the statement:
//        if ((8 > 4) || (j++ == 7))
//        System.out.println("j = " + j);
//        is:
//        j = 0
//        while the output of the statement:
//        if ((8 > 4) | (j++ == 7))
//        System.out.println("j = " + j);
//        is:
//        j = 1
//        Explain why?
//        b. Suppose that x, y, and z are int variables and x = 10 , y = 15 , and z = 20.
//        Determine whether the following expressions evaluates to true or false.
//        Expression Result
//        !(x > 1 0)
//        x <= 5 || y < 15
//        (x != 5 ) && (y != z)
//        x >= z || (x + y >= z)
//        (x <= y – 2) && (y >= z) || (z – 2 != 20)
//        c. Rewrite the following expressions using the conditional operator
//        Expressions Conditional Operator
//        if (x >= y)
//        z = x - y;
//        else
//        z = y - x;
//        if (hours >= 40.0)
//        wages = 40 * 7.50 + 1.5
//        * 7.5 * (hours - 40);
//        else
//        wages = hours * 7.50;
//        if (score >= 60)
//        str = "Pass";
//        else
//        str = "Fail"

public class Question4 {
    public static void main(String[] args) {
//        solution to a.
        int j = 0;
        if ((8 > 4) || (j++ == 7) )
            System.out.println("j = " + j);
// Reason :
//        here j = 0 , and then there is an  or operator between two statements we know that or operator returns true
//        if any one statement is true , the program will look for the first statement to be true if it is true then it
//        will overlook the second statement without evaluating it. therefore the value of j remains zero!

        if ((8 > 4) | (j++ == 7))
        System.out.println("j = " + j);
//  Reason :
//         here  bitwise or is used for which the statements are firstly executed and then converted to binary forms .
//         After this or operation is performed . Therefore j transformed in j = 1.

//        solution to b.
        int x = 10 , y = 15;
//                z = 20;
//        System.out.println((!(x > 10)));  //True
//        System.out.println(x <= 5 || y < 15);  //False
//        System.out.println((x != 5 ) && (y != z));   //True
//        System.out.println(x >= z || (x + y >= z)); //True
//        boolean bool1 = (x <= 13);
//        boolean bool2 = (y >= z);
//        boolean bool3 = (18!= 20);

//        System.out.println( bool1 && bool2 || bool3 ); //True

//        solution to c.
//        c.1
        int z  ;
        z = (x > y || x==y) ? x - y: y - x;

//        c.2
        double wages,hours=12;
        wages = (hours >= 40.0) ? 40 * 7.50 + 1.5 * 7.5 * (hours - 40) : hours *7.50;

//        c.3
        String str ;
        int score = 80;
        str = (score >= 60) ? "pass":"fail";





    }
}
