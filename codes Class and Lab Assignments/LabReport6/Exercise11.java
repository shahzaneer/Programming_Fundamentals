// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//The number of even elements of the sequence: Determine the number of even elements
//        in the sequence ending with the number 0.

import java.util.Scanner;
public class Exercise11 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int number;
        int countOfEven=0;

        System.out.print("Enter integers; 0 being the ending number: ");
        do {
            number=input.nextInt();

            if(number%2==0 && number!=0)
                countOfEven+=1;
        }while(number != 0);

        System.out.println("Number of even elements in sequence: "+countOfEven);


    }
}
