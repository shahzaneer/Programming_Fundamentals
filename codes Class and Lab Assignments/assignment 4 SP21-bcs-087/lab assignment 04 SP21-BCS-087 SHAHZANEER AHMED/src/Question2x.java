import java.util.*;
import java.io.*;
import java.nio.file.*;
public class Question2x{
    public static void main(String[] args) {
        try{

            Scanner filereader = new Scanner(new File("students.txt"));
            filereader.useDelimiter("[\n]");
            Path file = Paths.get("students.txt");
            long lines = Files.lines(file).count();
            String[] mainArray = new String[(int)lines];
            int i = 0;
            while (filereader.hasNextLine()){
                mainArray[i] = filereader.nextLine();
                i++;
            }

            for (int k = 0; k < mainArray.length; k++){
                for (int j = k + 1; j < mainArray.length; j++){
                    String[] alpha = mainArray[k].split(":");
                    String[] beta = mainArray[j].split(":");
                    if (Integer.parseInt(beta[1]) > Integer.parseInt(alpha[1])){
                        String temp = mainArray[k];
                        mainArray[k] = mainArray[j];
                        mainArray[j] = temp;
                    }
                }
            }

            for (String s : mainArray) {
                System.out.println(s);
            }

        }
        catch (IOException e){
            System.out.println("ok");
        }

    }
}