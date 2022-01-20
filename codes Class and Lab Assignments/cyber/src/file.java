import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {

//        file creation
//        File myFile = new File("noor.txt"); //file object creation
//
//        try {
//            myFile.createNewFile();
//        }
//        catch (IOException e) {
//            System.out.println("no such file exists!");
//        }
// file writing
//        try {
//            FileWriter myfileWriter = new FileWriter("noor.txt");
//            myfileWriter.write(details);
//            myfileWriter.write(2);
//            myfileWriter.write(3);
//            myfileWriter.write(4);
//            myfileWriter.write(5+"/n");
//            myfileWriter.write(6+"/n");
//            myfileWriter.write(7+"/n");
//            myfileWriter.write(8+"/n");
//            myfileWriter.write(9+"/n");
//            myfileWriter.write(10+"/n");
//
//            myfileWriter.close();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }

//        file reading
//        File myFile = new File("noor.txt");
//        try {
//            Scanner myScanner = new Scanner(myFile);
//            while(myScanner.hasNextLine()){
//                String abc = myScanner.nextLine();
//                System.out.println(abc);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

//        file manipulation

//        int sum = 0;
//
//        File myFile = new File("noor.txt");
//        try {
//            Scanner obj = new Scanner(myFile);
//            while(obj.hasNextInt()){
//                int num = obj.nextInt();
//                sum+=num;
//            }
//            System.out.println(sum);
//        }
//
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//    String a = "this";
//    String b = "shah";
//    String c = "ahmed";
//
//    String details = String.format("my message for you is %s",a);
//
//

        {
            try {
                Scanner sc = new Scanner(System.in);
                FileWriter mfw = new FileWriter("noor.txt");
                System.out.println("Enter details ");
                mfw.write(sc.nextLine());
                mfw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}