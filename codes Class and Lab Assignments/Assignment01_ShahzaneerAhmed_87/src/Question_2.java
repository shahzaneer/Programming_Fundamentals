// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Question – 2: CLO-3
//        Write a program that computes the cost of painting and installing carpet in a room. Assume that
//        the room has one door, two windows, and one book-shelf. Your program must do the following
//         Prompts the user to enter, in feet, the length, width, and height of a room. Read the
//        dimensions of the room.
//         Prompts the user to enter the widths and heights, in feet, of the door, each window,
//        and the bookshelf. Read these quantities.
//         Prompts the user to enter the cost, per square foot, of painting the walls. Read these
//        quantities.
//         Prompts the user to enter of cost, per square foot, of installing carpet. Read these
//        quantities.
//         Outputs the cost of painting the walls and installing the carpet.

import java.util.Scanner;
public class Question_2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
//        input for room
        System.out.println("Enter the Length of the room  in feet :");
        double roomLength = obj.nextDouble();
        System.out.println("Enter the width of the room  in feet :");
        double roomWidth = obj.nextDouble();
        System.out.println("Enter the height of the room  in feet :");
        double roomHeight = obj.nextDouble();

//        input for door
        System.out.println("Enter the height of door in feet :");
        double doorHeight = obj.nextDouble();
        System.out.println("Enter the width of door in feet :");
        double doorWidth = obj.nextDouble();

//        input for book shelve
        System.out.println("Enter the height of book-shelve in feet :");
        double bookShelveHeight = obj.nextDouble();
        System.out.println("Enter the width of book-shelve in feet :");
        double bookShelveWidth = obj.nextDouble();

//        input for windows :
        System.out.println("Enter the height of first window in feet :");
        double window1Height = obj.nextDouble();
        System.out.println("Enter the width of first window in feet :");
        double window1Width = obj.nextDouble();

        System.out.println("Enter the height of Second window in feet :");
        double window2Height = obj.nextDouble();
        System.out.println("Enter the width of Second window in feet :");
        double window2Width = obj.nextDouble();

//        input for cost of painting the walls :
        System.out.println("Enter the cost ,per square foot, of painting the walls :");
        double costWallPainting = obj.nextDouble();

//        input for cost of installing the carpet :
        System.out.println("Enter the cost ,per square foot, of painting the walls :");
        double costCarpetInstallation = obj.nextDouble();

//        calculating cost of painting the walls :

        double totalCostPainting = ((2 * (roomLength * roomHeight) + 2 * (roomHeight * roomWidth))
                - (doorWidth * doorHeight) - (window1Width * window1Height) - (window2Width * window2Height)
                - (bookShelveHeight * bookShelveWidth)) * costWallPainting;

        double totalCostCarpetInstallation = (roomLength * roomWidth * costCarpetInstallation );

        System.out.printf("The total cost for painting the walls is : $ %.2f\n",totalCostPainting);
        System.out.printf("The total cost for installing the carpet  is : $ %.2f\n",totalCostCarpetInstallation);



    }
}
