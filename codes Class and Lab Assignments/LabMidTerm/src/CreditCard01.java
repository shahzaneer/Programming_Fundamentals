import java.util.*;
public class CreditCard01 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a credit card number as long integer: ");
            long creditCardNumber = input.nextLong();
//
            if (isValid(creditCardNumber)) System.out.printf("%d is valid !\n",creditCardNumber);
            else System.out.printf("%d is invalid",creditCardNumber);

        }

        /** Return true if the card number is valid */
        public static boolean isValid(long number){
            boolean validnumber = false;


            if(getSize(number)>=13 && getSize(number)<=16){
                validnumber=true;
            }
            else{
                validnumber=false;
            }


            String num = number + "";
            int[] prefixes = {4,5,6,37};
            for(int i=0;i<4;i++){
                if(prefixMatched(number, prefixes[i])){
                    validnumber = true;
                    break; //ager yeh na ho tou kia hoga ?
                }
                validnumber = false;
            }


            if((sumOfDoubleEvenPlace(number)+sumOfOddPlace(number))%10==0){
                validnumber=true;
            }
            else{
                validnumber=false;
            }


            return validnumber;
        }

        public static int sumOfDoubleEvenPlace(long number){
            String num = number + "";
            int sum=0;
            for(int i=num.length()-2;i>=0;i=i-2){
                sum+=getDigit(Character.getNumericValue(num.charAt(i)));
            }
            return sum;
        }


        public static int getDigit(int number){
            int num = number*2;
            return (num/10) + (num%10);
        }


        /** Return sum of odd-place digits in number */
        public static int sumOfOddPlace(long number){
            int sum = 0;
            String num = number + "";
            for(int i = num.length()-1;i>=0;i=i-2){
                sum+=Character.getNumericValue(num.charAt(i));
            }
            return sum;
        }


        public static boolean prefixMatched(long number, int d){
            String num = number + "";
            String prefix = d + "";
            return getPrefix(number, prefix.length()) == d; //ager d yani prefix k equal hogi tou true return hoga
            // werna false
        }


        /** Return the number of digits in d */
        public static int getSize(long d){
            String num = "" + d;
            int totalDigits = 0;
            for(int i=0;i<num.length();i++){
                if(Character.isDigit(num.charAt(i))){
                    totalDigits++;
                }
            }
            return totalDigits;
        }

        public static long getPrefix(long number, int k){
            String num = number + "";
            if(num.length()<k){
                return number; //number aur prefix ki length equal nhi hogi so false return hoga !
            }
            else{
                return Long.parseLong(num.substring(0,k));
            }
        }

    }

