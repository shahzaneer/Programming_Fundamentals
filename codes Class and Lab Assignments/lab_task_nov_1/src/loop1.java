//The length of Sequence: Given a sequence of non-negative integers, where each number
//        is written in a separate line. Determine the length of the sequence, where the sequence ends
//        when the integer is equal to 0. Print the length of the sequence (not counting the integer 0).
//        The numbers following the number 0 should be omitted.
//        Input: 1 2 3 4 5 6 7 0 1 2 3 Output:7



import java.util.Scanner;
public class loop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sequence terms and enter zero to finish the sequence and -1 to terminate the " +
                "sequence" );

        int integer = -2;
         int count = 0,counter=0;
         while(integer!=-1){
             integer = input.nextInt();
//             System.out.print(integer+" ");
             if (integer != 0)  count+=1;

             if (integer == 0) {
                 counter = count;
             }
        }
        System.out.print(counter);
    }
}
