// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Question – 3:
//        In the Chess game, King moves horizontally, vertically or
//        diagonally to any adjacent cell as shown in figure. Given
//        two different cells of the chessboard, determine whether a
//        king can go from the first cell to the second in one move.
//        Write a program that will receive the input of four
//        numbers from 1 to 8, each specifying the column and row
//        number, first two - for the first cell, and then the last two -
//        for the second cell. The program should output YES if a
//        king can go from the first cell to the second in one move
//        or NO otherwise

//In chess, we know that there are 8 rows and 8 columns and a total of about 64 cells to move on!
import java.util.Scanner;
public class Question_3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter in between (1-8) ");
        System.out.println("Enter the row no of first cell :");
        int rowFirstCell = obj.nextInt();
        System.out.println("Enter the Column no of first cell :");
        int columnFirstCell = obj.nextInt();
        System.out.println("Enter the row no of Second cell :");
        int rowSecondCell = obj.nextInt();
        System.out.println("Enter the column no of Second cell :");
        int columnSecondCell = obj.nextInt();

        int row, column;
        boolean columnSubGreaterThanZero = (columnFirstCell - columnSecondCell > 0);
        boolean rowSubGreaterThanZero = (rowFirstCell - rowSecondCell > 0);


        if (rowFirstCell>8 || rowSecondCell>8 || columnFirstCell>8 || columnSecondCell>8) {
            System.out.println("Invalid No of rows or column");
        }

        else {

            if (columnSubGreaterThanZero) column = columnFirstCell - columnSecondCell;
            else if (!columnSubGreaterThanZero) column = columnSecondCell - columnFirstCell;
            else column = 0;

            if (rowSubGreaterThanZero) row = rowFirstCell - rowSecondCell;
            else if (!rowSubGreaterThanZero) row = rowSecondCell - rowFirstCell;
            else row = 0;


            if ((column == 1 && row == 0) || (column == 0 && row == 1) || (column == 1 && row == 1))
                System.out.println("Yes! The king can move in a single step!");
            else System.out.println("No! The king cannot move in a single step!");


        }


    }
}
