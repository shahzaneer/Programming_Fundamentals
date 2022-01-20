public class factorial {
    public static void main(String[] args) {
        int fac = factorialRecursive(4);
        System.out.println(fac);
    }
    static int factorialRecursive(int n){

        if(n==0){
            return 1; //base condition
        }
        else{
            return (n*factorialRecursive(n-1));
        }

    }
}
