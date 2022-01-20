//Shahzaneer Ahmed
//SP21-BCS-087
//Activity 1

//a. Write Java statements that declare the following variables: num1 , num2 , and num3 , and average
//        of type int .
//        b. Write Java statements that store 125 into num1 , 28 into num2 , and -25 into num3 .
//        c. Write a Java statement that stores the average of num1 , num 2 , and num3 into average.
//        d. Write Java statements that output the values of num1 , num2 , num3 , and average .
//        e. Compile and run your program

public class Activity1 {
    public static void main(String[] args) {
     int num1,num2,num3,average;
     num1= 125;
     num2= 28;
     num3=-25;
     average = (num1+num2+num3)/3;
        System.out.println("Num1 is "+num1);
        System.out.println("Num2 is "+num2);
        System.out.println("Num3 is "+num3);
        System.out.println("average is "+average);
    }
}
