public class pattren3 {
    public static void main(String[] args) {
        int n = 6;
    for (int i = 1 ; i<=n;i++){

        for (int j = n-i; j>=1; j--){
            System.out.print(" ");
        }
        for (int k = i; k>=1;k--){
            System.out.printf("%1d",k);
        }
        System.out.println();
    }
    }
}
