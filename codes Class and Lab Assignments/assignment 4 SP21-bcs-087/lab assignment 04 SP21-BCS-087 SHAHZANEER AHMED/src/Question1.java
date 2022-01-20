//------------SHAHZANEER AHMED------------------------
//----------------SP21-BCS-087------------------------
//------------Lab Assignment 04-----------------------

//QUESTION #1 (CLO-3)
//
//        Write a Java program to keep accepting names and marks of students from user until a negative number is
//        entered against marks.
//        Save this data in a text file having name ‘students.txt’.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        arraylists are resizeable and highly manageable
        ArrayList<String> Students = new ArrayList<>();
        ArrayList<Integer> Marks = new ArrayList<>();

//        implementing the logic of problem
        int n = 0;
        String name;
        do{
            System.out.println("Enter the name of Student : ");
            name = input.nextLine();
            Students.add(name);

            System.out.println("Enter the marks : ");
            n = input.nextInt();
            input.nextLine(); //yeh next overflow line ko consume krlega!
            Marks.add(n);

        }while (n>0);
//        file creation
          File myFile = new File("students.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
         String data="";
        for (int i=0; i<Students.size()-1;i++){
//            System.out.printf("%s   ||  %d\n", Students.get(i), Marks.get(i));
            data+= String.format("%s:%d\n", Students.get(i), Marks.get(i));

        }

        try {
            FileWriter myFileWriter = new FileWriter("students.txt");
            myFileWriter.write(data);
            myFileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
