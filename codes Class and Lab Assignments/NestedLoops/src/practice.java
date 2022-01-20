public class practice {
    public static void main(String[] args) {
//        pattern1(7);
//        pattern2(5);
//        pattern3(6);
//        pattern4(6);
//        pattern5(5);
//        pattern6(5);
        pattern7(5);
//        pattern8(4);

//        0,1,1,2,3,5,8,13.....

    }

    static void pattern1(int n){
        for (int row = 1 ;row<=n; row++){
            for (int column = 1; column<=row; column++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row<=n;row++){
            for (int column = 1; column<=n;column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 1; row<=n; row++){
            for (int column = 1; column<=n-row+1;column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row = 1; row<=n;row++){
            for (int column=1; column<=row;column++){
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 1; row<2*n; row++){
            if (row<=n){
                for(int column = 1;column<=row; column++){
                    System.out.print("* ");
                }
            }
            else if (row>n){
                    for (int column = 1; column <= ((2*n)-row); column++)
                    {
                        System.out.print("* ");
                    }
            }
            System.out.println();
        }

    }

    static void pattern6(int n){

        for (int rows = 1; rows < 2*n;rows++){
            int totalColumnsInRows = rows>n? 2*n-rows : rows;
            int spaces = n - totalColumnsInRows;
            for ( int space = 1; space<=spaces; space++){
                System.out.print(" ");
            }
            for (int columns = 1; columns<=totalColumnsInRows; columns++){
                System.out.print("* ");
            }

//            if(rows<=n){
//                for (int columns=1; columns<=rows; columns++){
//                    System.out.print("* ");
//                }
//            }
//            else if (rows>n){
//                for (int columns = 1; columns<=2*n - rows; columns++){
//                    System.out.print("* ");
//                }
//            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int rows = 1; rows<=5;rows++){
            for (int spaces = 1; spaces<= n-rows;spaces++){
                System.out.print("  ");
            }
            for (int columns = rows; columns>=1;columns--){
                System.out.print(columns+" ");
            }
            for (int columns = 2; columns<=rows;columns++){
                System.out.print(columns+" ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for (int rows = 1; rows <2*n ; rows++){
            int noOfColumns = rows>n? 2*n-rows:rows;
            int spaces = n - noOfColumns;

            for (int space = 1; space <=spaces; space++){
                System.out.print(" ");
            }
            for (int column = noOfColumns; column>=1;column--){
                System.out.print(column);
            }
            for (int column = 2; column<=noOfColumns;column++){
                System.out.print(column);
            }
            System.out.println();


        }
    }

}
