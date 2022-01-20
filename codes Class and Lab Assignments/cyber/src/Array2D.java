import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int[][] array2d = new int[3][3];
        Scanner inp = new Scanner(System.in);
//        3X3 , 3X2 1X3

//        System.out.println(array2d[0][0]);



        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j]);
            }
            System.out.println();
        }
    }
}