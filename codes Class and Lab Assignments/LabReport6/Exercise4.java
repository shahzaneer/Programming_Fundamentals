// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Sum of N numbers: N numbers are given in the input. Read them and print their sum.
//        The first line of input contains the integer N, which is the number of integers to follow. Each
//        of the next N lines contains one integer. Print the sum of these N integers.

import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter No of natural :");
        int n = obj.nextInt();
//        have used array to display the elements entered!
//        if we disable the array initialization, modification and printing statement the program will be still
//        executable

        int arr [] = new int[n];
        int i = 0;

        while(i<n){
            int natural = obj.nextInt();
            sum+=natural;
            arr[i]=natural;
            i++;
        }
//        System.out.print(arr);
        System.out.println("The no of natural number are :"+n);
        for (int j=0; j<n; j++){
            System.out.println(arr[j]);
        }
        System.out.println("The sum is :"+sum);


    }
}
