import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileManipulation {
    public static void main(String[] args) {
     File myFile = new File("abc.txt");
        try {
            Scanner scan = new Scanner(myFile);
            int count = 0;
            while(scan.hasNext()){

                String name = scan.next();
                double score = scan.nextDouble();
                System.out.printf("Your name is %s and your score is %f\n",name,score);

            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Scanner scan = new Scanner(myFile);
            int count = 0;
            while(scan.hasNextDouble()){

                String name = scan.next();
                double score = scan.nextDouble();
                System.out.printf("Your name is  and your score is %f\n",score);

            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
