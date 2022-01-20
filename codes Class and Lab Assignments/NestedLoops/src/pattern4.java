public class pattern4 {
    public static void main(String[] args) {
        for (int rows = 6; rows>=1; rows--){
            int n = 6;
            for (int spaces = n-rows; spaces>=1; spaces--){
                System.out.print(" ");
            }

            for (int columns = 1; columns<=rows;columns++){
                System.out.print(columns);
            }
            System.out.println();
        }

    }
}
