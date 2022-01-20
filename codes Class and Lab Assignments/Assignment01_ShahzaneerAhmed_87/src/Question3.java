// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Question – 3: This question focuses on the basic elements of JAVA language (Primitive Data
//        Types, Expressions and Assignments, Arithmetic Operators, Order of Precedence, Augmented
//        Assignment Operators, Type Conversion)
//        a. Write Java statements that accomplish the following.
//        o Declare int variables x and y.
//        o Initialize an int variable x to 10 and a char variable ch to ' B '.
//        o Update the value of an int variable x by adding 5 to it.
//        o Declare and initialize a double variable payRate to 12.50.
//        o Copy the value of an int variable firstNum into an int variable tempNum.
//        o Swap the contents of the int variables x and y. (Declare additional variables, if
//        necessary.)
//        o Suppose x and y are double variables. Output the contents of x , y , and the
//        expression x +12/ y – 18.
//        o Declare a char variable grade and set the value of grade to 'A'.
//        o Declare int variables to store four integers.
//        o Copy the value of a double variable z to the nearest integer into an int variable
//        x.
//        b. Suppose a, b and c are int variables and a = 5, b = 6, d = 2. What value is assigned to
//        each variable after each statement executes? If a variable is undefined at a particular
//        statement, report UND (undefined)
//        Statements a b c d
//        a = (b++) + 3 * ++d;
//        c = 2 * d + (++b) + a;
//        b = 2 * (++c) - (a++);
//        d = d++ + d + b++ + b;
//        c. Suppose a, b, and sum are int variables and c is a double variable. What value is
//        assigned to each variable after each statement executes? Suppose a = 3 , b = 5 ,
//        and c = 14.1
//        Statements a b c sum
//        sum = a + b + ( int) c;
//        c /= a;
//        b += (int) c - a;
//        a *= 2 * b + (int) c

public class Question3 {
    public static void main(String[] args) {
//        solution to a.
//        int x,y;
//        x = 10;
//        char ch = 'B';
//        x = x+5;
//        double payRate = 12.50;
//        int firstNum = 4;
//        int tempNum;
//        tempNum = firstNum;
//
//        x = 12;
//        y = 10;
//        int tempVar = 0;
//        tempVar = y;
//        x = y;
//        y = x;

//        double x = 44.55, y = 55.45;
//        System.out.println("x :"+x);
//        System.out.println("y :"+y);
//        System.out.println((x+12/y-18));  //26.766411181244358
//
//        char grade = 'A';
//        int variable = 3333;
//
//        double z = 66.77;
//        x = (int) z; //66.0
//        System.out.println(x);

// solution to b.
//        int a = 5, b = 6, d=2;

//        a = (b++) + 3 * ++c;
//        System.out.printf("%d %d %d %d", a,b,c, d);  //15 7 UN 3
//        int  c = 2 * d + (++b) + a;
//        System.out.printf("%d %d %d %d", a,b,c ,d); //5 7 16 2
//          b = 2 * (++c) - (a++);
//        System.out.printf("%d %d %d %d", a,b,c ,d);  // 6 29 17 2
//        d = d++ + d + b++ + b;
//        System.out.printf("%d %d %d %d", a,b,c ,d); //5 8 16 20

//        solution to c.
        int a = 3 , b = 5 ;
        double c = 14.1;
        int sum = a+b+ (int)c;
        //System.out.printf("%d %d %f %d", a,b,c ,sum); // 3 5 14.100000 22

        c /= a;
        //System.out.printf("%d %d %f %d", a,b,c ,sum); //3 5 14.100000 223 5 4.700000 22

        b += (int) c - a;
//        System.out.printf("%d %d %f %d", a,b,c ,sum); //3 6 4.700000 22

        a *= 2 * b + (int) c;
        System.out.printf("%d %d %f %d", a,b,c ,sum); //48 6 4.700000 22







    }
}
