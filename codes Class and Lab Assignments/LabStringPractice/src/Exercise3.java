//Given a string that may or may not contain a letter of interest. Print the index location of the
//        first and last appearance of f. If the letter f occurs only once, then output its index. If the
//        letter f does not occur, then do not print anything.
//        Input: office
//        Correct Answer: 1 2

import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str1 = input.next();
            int counter = 0;
            if (str1.contains("f")){
            int indexOfF = str1.indexOf('f');
            int lastIndexOfF = str1.lastIndexOf('f');

            if (indexOfF == lastIndexOfF) System.out.println(indexOfF);
            else {
                System.out.print(indexOfF + " ");
                System.out.print(lastIndexOfF);
            }
            }
            else System.out.print("");;


        }


    }

