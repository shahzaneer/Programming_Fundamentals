//------------------------------------------------------------
//----------------Shahzaneer Ahmed----------------------------
//////////////////SP21-BCS-087--------------------------------
//----------------Lab Assignment 02---------------------------
//------------------------------------------------------------

//Write a nested for loop that prints the following output:


public class Question1 {
    public static void main(String[] args) {
        int n = 4;

        for (int rows = 0; rows<2*n;rows++){
            int spaces = 2*n -rows+1;
            for (int space=1; space<=spaces; space++){
                System.out.print("  ");
            }

            for (int columns = 1; columns<=rows+1; columns++){
//
//                System.out.print((int) Math.pow(2,columns-1)+"  ");
                System.out.printf(" %d ",(int) Math.pow(2,columns-1));
            }

            for (int columns = rows; columns>0;columns--){
//
//                System.out.print((int) Math.pow(2,columns-1)+"  ");
                System.out.printf(" %d ",(int) Math.pow(2,columns-1));
            }

            System.out.println();

        }
    }
}
