//------------------------------------------------------------------
//--------------------SHAHZANEER AHMED------------------------------
//-----------------------SP21-BCS-087-------------------------------
//-----------------------Question 4---------------------------------
//------------------------------------------------------------------

//Write a program that display a multiplication table as shown
public class Exercise4 {
    public static void main(String[] args) {

        System.out.print("       "); //spacing before the first line
        for(int i = 1; i<=9;i++ ) {
            System.out.printf("%3d ",i);
//            printing the first row
        }
        System.out.println();
        System.out.println("------------------------------------------");
//        printing the pattern

        for(int i = 1 ;i<=9;i++) {

            System.out.printf("%4d |",i);
//            printing the left most column
            for(int j=1;j<=9;j++) {
                System.out.printf("%4d",i*j);
//                printing the tables
            }
            System.out.println();
//            printing the new line .
        }


    }
}
