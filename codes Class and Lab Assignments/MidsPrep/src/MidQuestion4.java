import java.util.Scanner;
public class MidQuestion4 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int max1=0,max2=0,max3=0;
//        int num = -1;
//        System.out.println("Enter sequence of numbers and enter 0 to exit :");
//        while (num!=0){
//            num = input.nextInt();
//            if (num>max1 && num!=0) max1 = num;
//            else if (num<max1 && num>max2 && num!=0) max2 = num;
//            else if (num<max1 && num<max2 && num>max3) max3 = num;
//
//        }
//
//        System.out.println(max1+" "+max2+" "+max3+" ");
        Scanner input = new Scanner(System.in);
        int count = 0;
        int greatest=0;
        int middle=0;
        int smallest=0;
        int number;
        do{
            number = input.nextInt();
            if(count==0){
                greatest=number;
            }
            else if (count==1){
                if(number>greatest){
                    middle=greatest;
                    greatest=number;}
                else{
                    middle = number;
                }
            }
            else{

                if(number>greatest){
                    smallest=middle;
                    middle =greatest;
                    greatest=number;

                }

                else if (number>middle && number<greatest){
                    smallest=middle;
                    middle=number;
                }
                else if (number<middle&&number>smallest){
                    smallest=number;
                }
            }
            ++count;
        }while(number!=0);

        System.out.print(greatest+" > "+middle+" > "+smallest);
    }
    }

