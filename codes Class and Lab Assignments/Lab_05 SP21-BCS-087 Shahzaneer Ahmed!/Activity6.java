//Shahzaneer Ahmed
//SP21-BCS-087
//LAB 04

//Activity-6
//        Suppose that x, y, z,and w are int variables and x = 3, y = 4, z = 7,and w =1. What is the
//        output of the following statements?
//        a. System.out.println("x == y: " + (x == y ));
//        b. System.out.println("x != z: " + (x != z ));
//        c. System.out.println("y == z – 3: " + (y == z – 3) );
//        d. System.out.println("!(z > w): " + ! (z > w));
//        e. System.out.println("x + y < z: " + (x + y < z));


public class Activity6 {
    public static void main(String[] args) {
        int x,y,z,w;
        x = 3;
        y = 4;
        z = 7;
        w = 1;
        System.out.println("x == y: " + (x == y )); // false //x == y: false
        System.out.println("x != z: " + (x != z )); //true // x != z: true
        int i = z-3;
        System.out.println("y == z – 3: " + (y == i)); //true //y == z – 3: true

        System.out.println("!(z > w): " + ! (z > w));// false //!(z > w): false
        System.out.println("x + y < z: " + (x + y < z)); //false // x + y < z: false


    }
}
