//------------------------------------------------------------
//----------------Shahzaneer Ahmed----------------------------
//////////////////SP21-BCS-087--------------------------------
//--------------CLASS Assignment 02---------------------------
//------------------------------------------------------------

//Question – 4: ______
//        Write a program that displays all the leap years, ten per line, from 101 to 2100, separated by
//        exactly one space. Also display the number of leap years in this period


public class Question4 {
    public static void main(String[] args) {

        int count = 0;

        for (int i=101; i<=2100;i++){

            //Condition for LEap year
            if ((i%4==0) && (i%400==0 || i%100!= 0)){
                System.out.print(i+ " ");
                count= count + 1;

                //Printing new line after 10 leap years
                if (count%10==0){
                    System.out.printf("\n");
                }
            }
        }

        //Displying total number of leap years
        System.out.println("Total leap years are: " + count);
    }
}
