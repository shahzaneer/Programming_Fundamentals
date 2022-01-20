//------------SHAHZANEER AHMED------------------------
//----------------SP21-BCS-087------------------------
//------------Lab Assignment 04-----------------------

//QUESTION #2 (CLO-3)
//
//        Write another program to read all the data from the file ‘students.txt’ created in Q1 above
//        . Display this data in descending order according to their marks.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question2 {
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
            input.nextLine(); // it will consume the next overflow line!
            Marks.add(n);

        }while (n>0);
//        file creation
        File myFile = new File("students2.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
//now making arrays of arraylists for sorting them in the manner of ascending to descending marks
        int sizeOfmarks = Marks.size();
        int [] marks = new int[sizeOfmarks];
        for(int i = 0; i<Marks.size();i++){
            marks[i]= Marks.get(i);
        }

        int sizeOfStudents = Students.size();
        String  [] students = new String [sizeOfStudents];
        for(int i=0; i<Students.size();i++){
            students[i]= Students.get(i);
        }
//        array sorted in ascending to descending manner!
        sortingArrays(marks,students);




        String data="";
        for (int i=0; i<marks.length-1;i++){
//            System.out.printf("%s   ||  %d\n", Students.get(i), Marks.get(i));
            data+= String.format("%s:%d\n",students[i],marks[i]);

        }

        try {
            FileWriter myFileWriter = new FileWriter("students2.txt");
            myFileWriter.write(data);
            myFileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

// fetching (reading) the file on console
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String readData = sc.nextLine();
                System.out.println(readData);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
    public static void sortingArrays(int [] arr ,String [] strArr){
        for (int i = 0; i< arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]<arr[j]){
//                    swapping
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

//                    swapping the strArray
                    String tempStr = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = tempStr;

                }
            }
        }



    }

}
