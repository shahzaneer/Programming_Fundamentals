import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fileName of in which you want to save your result");
        String fileName = input.next();

        File mf = new File(fileName+".txt");
        try {
            mf.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        calculating sum and average
        int sum = 0 ,counter =0;
        double average = 0;
        File myfile = new File("data.txt");
        try {
            Scanner scan  = new Scanner(myfile);
            while(scan.hasNextInt()){
                int number = scan.nextInt();
                counter++;
                sum+=number;
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        calculating average
        average = sum/counter;

        String details = String.format("The sum of Numbers is %d\nThe average of numbers is %f",sum,average);
        System.out.println(details);

//        writing details in result file
        try {
            FileWriter myfw = new FileWriter(fileName+".txt");
            myfw.write(details);
            myfw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
