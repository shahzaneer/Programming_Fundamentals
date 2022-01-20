// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Given two integers A and B. Print all numbers from A to B inclusively, in ascending order, if A
//< B, or in descending order, if A ≥ B

import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the  value for  A :");
        int a = obj.nextInt();
        System.out.println("Enter the  value for  B :");
        int b = obj.nextInt();

//        same purpose k liay if aur while ikhattay use krne ki zarurat nhi!

//        while loop simulation
            while(a<b) {
                System.out.println(a);
                a++;
            }

            while (a>=b){
                System.out.println(a);
                a--;
            }


//        for loop simulation
//        if (a<b){
//            for (int i = a; i<=b;i++){
//                System.out.println(i);
//            }
//        }
//        else if (a>=b){
//            for (int i = a; i>=b; i--){
//                System.out.println(i);
//            }
//
//        }
    }
}
