//------------SHAHZANEER AHMED------------------------
//----------------SP21-BCS-087------------------------
//------------Lab Assignment 04-----------------------

//QUESTION #3 (CLO-3)
//
//        Suppose the weekly hours for all employees are stored in a two-dimensional array. Each row records an employee’s seven-day work
//        hours with seven columns. For example, the following array stores the work hours for eight employees.
//        Write a program that displays employees and their total hours.
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] employeesAndWorkHoursInWeek = {
                {0,2,4,3,4,5,8,8}
                ,{1,7,3,4,3,3,4,4}
                ,{2,3,3,4,3,3,4,4}
                ,{3,9,3,4,7,3,4,1}
                ,{4,3,5,4,3,6,3,8}
                ,{5,3,4,4,6,3,4,4}
                ,{6,3,7,4,8,3,8,4}
                ,{7,6,3,5,9,2,7,9}
        };

            for(int i = 0; i<8;i++){
                int totalhours = totalWorkHours(employeesAndWorkHoursInWeek,i);

                System.out.printf("The total work hours of employee %d are %d\n",i,totalhours);


            }


        }


    public static int totalWorkHours (int [][] arr,int targetedRow){
        int total = 0;
        for(int i = 0; i<targetedRow+1;i++){
            for(int j= 1; j<arr[i].length;j++){
                if(i==targetedRow){
                    total+=arr[i][j];
                }
            }
        }
        return total;
    }
}
