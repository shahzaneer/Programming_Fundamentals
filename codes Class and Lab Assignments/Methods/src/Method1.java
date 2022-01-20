//Write a method that computes the sum of the digits in an integer.
// Use the following method header:
// public static int sumDigits(long n)For example, sumDigits(234) returns 9 (2 + 3 + 4).


public class Method1 {
    public static void main(String[] args) {
        sumDigits(1000);
    }


    public static void sumDigits(long n){
        long number = n;
        long sum = 0;
        while(number!=0){
            long rem = number%10;
            sum+=rem;
            number = number/10;
        }
        System.out.println("The sum of digits are  "+sum);


    }
}
