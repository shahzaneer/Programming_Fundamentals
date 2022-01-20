//------------------------------------------------------------------
//--------------------SHAHZANEER AHMED------------------------------
//-----------------------SP21-BCS-087-------------------------------
//--------------------------lAB-03----------------------------------
//-----------------------Question 2---------------------------------
//------------------------------------------------------------------

//Write a Menu Driven JAVA program that creates a two-dimensional array/Matrix of size n X m
//        where n represent the students and m represent the subjects and initialize it with user. The
//        program should do following Tasks using Menu, the menu operations are implemented using
//        methods:
//        a) Total_Marks: Calculates total/sum of the values in the specified row (student).
//        b) Avg_Subject: Calculates Average of the values in the specified column (subject).
//        c) Stud_Highest: Finds highest value in the specified row of the array and return
//        that subject name.
//        d) Stud_Lowest: Finds lowest value in the specified row of the array and return that
//        subject name.

import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of Students :");
        int noStudents = input.nextInt();
        System.out.println("Enter the no of Subjects :");
        int noSubjects = input.nextInt();

        String [][] studentsWithSubjects = new String[noStudents][noSubjects+1];
        int [][] rollNoWithMarks = new int[noStudents][noSubjects+1];

        inputDetails(studentsWithSubjects);
        allotRollNumbers(rollNoWithMarks);
        subjectsMarksInput(noSubjects,rollNoWithMarks);


      while(true){
          System.out.println("Enter the corresponding number to select an option :");
          System.out.println("""
                  1. Total Marks of a Student.
                  2. Average Marks of a subject.
                  3. Name of Subject in which a Student got highest marks.
                  4. Name of Subject in which a Student got lowest marks.
                  5. exit
                  """);
          int selection = input.nextInt();

          if (selection==5) System.exit(0);

          switch (selection){
              case 1 -> totalMarks(rollNoWithMarks,noSubjects,noStudents);
              case 2 -> averageSubjects(rollNoWithMarks,noSubjects,noStudents);
              case 3 -> highestMarks(studentsWithSubjects,rollNoWithMarks,noSubjects);
              case 4 -> lowestMarks(studentsWithSubjects,rollNoWithMarks,noSubjects);
          }
      }

        }




    static void inputDetails(String [][] studentsWithSubjects){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student name with his subjects separated by space");
        for(int i = 0; i<studentsWithSubjects.length;i++){
            for(int j = 0; j<studentsWithSubjects[i].length;j++){

                studentsWithSubjects[i][j] = input.next();

            }
        }

    }
    static void subjectsMarksInput(int subjects , int [][]rollNoWithMarks){
        Scanner input = new Scanner(System.in);
        for (int k = 1; k<=subjects;k++) {
            System.out.printf("Enter marks for subject-%d for each student according to his/her roll-number",k);
            for (int i = 0; i < rollNoWithMarks.length; i++) {
                for (int j = k; j < k+1; j++) {
                    rollNoWithMarks[i][j] = input.nextInt();
                }
            }
        }

        for(int i = 0; i<rollNoWithMarks.length;i++){
            for(int j = 0; j<rollNoWithMarks[i].length;j++){
                System.out.print(rollNoWithMarks[i][j]+" ");

            }
            System.out.println();
        }

    }
    static void allotRollNumbers (int [][] rollNoWithMarks){
        //Assigning roll_Numbers
        for (int i = 0; i<rollNoWithMarks.length;i++){
            for (int j =0 ;j<1; j++){
                rollNoWithMarks[i][j] = i+1;
            }

        }
        System.out.println("You Roll numbers are as :");
        for(int i = 0; i<rollNoWithMarks.length;i++){
            for(int j = 0; j<rollNoWithMarks[i].length;j++){
                System.out.print(rollNoWithMarks[i][j]+" ");

            }
            System.out.println();
        }
    }
    static void totalMarks (int [][] rollNoWithMarks, int subjects,int students){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the roll number whose total marks you want to calculate :");
        int rollNumber = input.nextInt();

        if (rollNumber<=students) {
            int totalMarks = 0;

            for (int i = rollNumber - 1; i < rollNumber; i++) {
                for (int j = 1; j < subjects + 1; j++) {
                    totalMarks += rollNoWithMarks[i][j];
                }
            }

            System.out.printf("The total marks of Roll number %d are : %d \n", rollNumber, totalMarks);
        }
        else System.out.println("Please enter valid roll number !");
    }
    static void averageSubjects (int[][] rollNoWithMarks,int subjects,int students){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subject no whose average marks you want to calculate :");
        int subjectNo = input.nextInt();

        if (subjectNo <= subjects) {

            int sum = 0;

            for (int i = 0; i < rollNoWithMarks.length; i++) {
                for (int j = subjectNo; j < subjectNo + 1; j++) {
                    sum += rollNoWithMarks[i][j];
                }
            }
            double average = sum / students;

            System.out.println("The average is " + average);
        } else System.out.println("Please enter valid subject number !");

    }
    static void highestMarks(String[][] studentsWithSubjects, int [][] rollNoWithMarks, int subjects){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the roll number whose highest marks in a subject you want to know :");
        int rollNumber = input.nextInt();

        int highestMarks = 0;
        int rowsIndex = 0,columnIndex = 0;
        for( int i = rollNumber-1;i<rollNumber;i++){
            for(int j = 1;j<subjects+1;j++){
                if(highestMarks<rollNoWithMarks[i][j]){
                    highestMarks = rollNoWithMarks[i][j];
                    rowsIndex = i;
                    columnIndex = j;

                }
            }
        }

        System.out.printf("Thus the highest marks are %d and are of %s subject ",highestMarks,
                studentsWithSubjects[rowsIndex][columnIndex]);
    }
    static void lowestMarks(String [][] studentsWithSubjects,int [][] rollNoWithMarks,int subjects){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the roll number whose lowest marks in a subject you want to know :");
        int rollNumber = input.nextInt();
        int lowestNumbers = 1000000;
        int rowsIndex=0,columnIndex=0;
        for( int i = rollNumber-1;i<rollNumber;i++){
            for(int j = 1;j<subjects+1;j++){
                if(lowestNumbers>rollNoWithMarks[i][j]){
                    lowestNumbers = rollNoWithMarks[i][j];
                    rowsIndex = i;
                    columnIndex = j;
                }
            }
        }
        System.out.printf("Thus the lowest marks are %d and are of %s subject \n",lowestNumbers,
                studentsWithSubjects[rowsIndex][columnIndex]);
    }


}
