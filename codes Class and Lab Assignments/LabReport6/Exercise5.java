// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Sum of Cubes: For the given integer N calculate the following sum:
//        1
//        3
//        +2
//        3
//        +…+N
//        3


import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter N till what you wanted to get sum of cubes :");
        int num = obj.nextInt();

        int sum = 0;
        int i = 1;
//        loop simulation

        while (i<=num){
            sum+=(i*i*i);
            i++;
        }

        System.out.println("The sum of cubes  is :"+sum);


//        Mathematical Formula Simulation

//         sum = ((num*num)*((num+1)*(num+1))/4);
//        System.out.println("The sum of cubes is :"+sum);



    }
}
