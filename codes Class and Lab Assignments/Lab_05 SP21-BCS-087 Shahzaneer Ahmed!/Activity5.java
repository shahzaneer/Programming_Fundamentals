
//Shahzaneer Ahmed
//SP21-BCS-087
//LAB 04

//Relational Operators; Logical Operators; Boolean Data Type;
//        Activity-5
//        Suppose that x, y, and z are int variables and x = 10 , y = 15 , and z = 2 0. Determine
//        whether the following expressions evaluates to true or false .
//        a. !(x > 1 0)
//        b. x <= 5 || y < 15
//        c. (x != 5 ) && (y != z)
//        d. x >= z || (x + y >= z)
//        e. (x <= y – 2) && (y >= z) || (z – 2 != 20)

public class Activity5 {
    public static void main(String[] args) {
        int x,y,z;
        x =10;
        y =15;
        z =20;

        System.out.println(x>10); //False
        System.out.println((x <= 5) || (y < 5)); // false
        System.out.println((x!=5) && (y!=z));   //True
        System.out.println( (x >= z) || (x + y >= z));  //True

        boolean s1 = (x <= (y-2));
        boolean s2 = (y >= z);

        int d = ((z-2));
        boolean s3 = (d!=20);

        System.out.println(s1 && s2 || s3); //false

//        System.out.println((x <= (y – 2)) && (y >= z)) || ((z – 2) != 20);

    }
}
