//------------------------------------------------------------------
//--------------------SHAHZANEER AHMED------------------------------
//-----------------------SP21-BCS-087-------------------------------
//-----------------------Class Assignment---------------------------
//-----------------------Question 1---------------------------------
//------------------------------------------------------------------

//Question – 1: ______
//        Write a JAVA Program to Multiply Two Matrix Using Multi-Dimensional Arrays. This program
//        takes two matrices of order r1*c1 and r2*c2 respectively. Then, the program multiplies these two
//        matrices (if possible) and displays it on the screen.

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {

//        input of dimensions of matrices.
            System.out.println("Enter the number of rows in first Matrix");
            int r1 = input.nextInt();
            System.out.println("Enter the number of columns in first Matrix");
            int c1 = input.nextInt();
            System.out.println("Enter the number of rows in Second Matrix");
            int r2 = input.nextInt();
            System.out.println("Enter the number of columns in Second Matrix");
            int c2 = input.nextInt();

            if (c1 == r2) {

                int [][] Matrix_1 = new int [r1][c1];
                int [][] Matrix_2 = new int [r2][c2];
                int [][] newMatrix = new int[r1][c2];
                int r3 = r1;
                int c3 = c2;

                int row_m1 ,column_m1, row_m2,column_m2;

                System.out.println("The Matrix Multiplication is possible !");
                System.out.printf("Enter the constituents of First Matrix | A %dx%d Matrix \n",r1,c1);
//                taking input in first matrix;
                for( row_m1 = 0; row_m1<r1; row_m1++){
                    for (column_m1 = 0; column_m1<c1; column_m1++){
                        System.out.printf("Enter element at %dth row %dth column ",row_m1+1,column_m1+1);
                        Matrix_1[row_m1][column_m1] = input.nextInt();
                    }
                }

                System.out.printf("Enter the constituents of Second Matrix | A %dx%d Matrix \n",r2,c2);
//                input in second Matrix;
                for( row_m2= 0; row_m2<r2; row_m2++){
                    for (column_m2 = 0; column_m2<c2; column_m2++){
                        System.out.printf("Enter element at %dth row %dth column ",row_m2+1,column_m2+1);
                        Matrix_2[row_m2][column_m2] = input.nextInt();
                    }
                }

//             Main Multiplication Logic ..
                for (int i = 0; i<r3; i++){
                    for(int j = 0; j<c3;j++){
                        newMatrix[i][j] = 0; //so that no garbage value can effect the multiplication.
                        for(int k = 0; k<c1; k++){
//                            traversing k liay jo bhi cheez same houti hai wo use houti hai yani multiplication ki
//                            condition use hoti hai r2 ya c1 dono main se koi bhi use hoskta hai.
//                            hamain pta hai k matrix1 ki row ko matrix2 k column se multiply krna hai lekin dono
//                            cheezain alag alag nhi hotin mazeed inke saath specify krna houta hai dusre parameter
//                            ko jo condition wala houta hai so yun hm matrix 1 main row ko ith aur matrix 2 main
//                            column ko jth position dete hain aur dusre factor main hum dono jagah same value
//                            (multiplication ki condition ya tou r2 ya c1)
//                            dengay
                            newMatrix[i][j] = newMatrix[i][j] + Matrix_1[i][k] * Matrix_2[k][j];

                        }
                    }
                }

                System.out.println("The new Matrix is :");
                for (int i = 0; i<r3; i++){
                    for(int j = 0; j<c3;j++){
                        System.out.print(newMatrix[i][j]+" ");
                    }
                    System.out.println();
                }
                System.exit(0);

            }

            else {
                System.out.println("The Matrix Multiplication isn't possible.\nThe number of columns in first matrix " +
                        "should be equal to the number of columns in second matrix");
                System.out.println("Do you want to enter another Matrix? y or n");
                String option = input.next();
                if (option.equalsIgnoreCase("y")) continue;
                else if (option.equalsIgnoreCase("n")) System.exit(0);

            }

        }
    }
}
