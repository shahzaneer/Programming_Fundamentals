// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Question – 7:
//        Write a program that prompts the user to enter three integers and display the integers in nondecreasing orde
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter integer 01 ");
        int integer1 = obj.nextInt();
        System.out.println("Enter integer 02 ");
        int integer2 = obj.nextInt();
        System.out.println("Enter integer 03 ");
        int integer3 = obj.nextInt();

        int big=0 , small=0 , mid=0;
//for big value
        if (integer1>integer2 && integer1>integer3) big = integer1;
        if (integer2>integer1 && integer2>integer3) big = integer2;
        if (integer3>integer1 && integer3>integer2) big = integer3;

// for mid value
        if (integer1>integer2 && integer1<integer3) mid = integer1;
        if (integer1>integer3 && integer1<integer2) mid = integer1;

        if (integer2>integer1 && integer2<integer3) mid = integer2;
        if (integer2<integer1 && integer2>integer3) mid = integer2;

        if (integer3>integer1 && integer3<integer2) mid = integer3;
        if (integer3<integer1 && integer3>integer2) mid = integer3;

//  for smaller value

        if (integer1<integer2 && integer1<integer3) small = integer1;
        if (integer2<integer1 && integer2<integer3) small = integer2;
        if (integer3<integer1 && integer3<integer2) small = integer3;


        System.out.printf("The values in non decreasing orders are %d %d %d:" , big, mid , small);





    }
}
