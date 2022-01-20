import java.util.*;
import java.io.*;
public class prac4{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean counter = true, check = true;
        while(check){
            try{
                File myfile = new File("score.txt");
                PrintWriter output = new PrintWriter(myfile);
                while(counter){
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Score:");
                    double score = sc.nextDouble();
                    output.println(name+" "+score);
                    if(score<0){
                        counter = false;
                        check = false;
                    }
                }
                output.close();

            }
            catch(Exception e){
                System.out.println("\nError occured");
                sc.nextLine();
            }
        }

        int length = 0;

        try{
            Scanner input = new Scanner(new File("score.txt"));
            while(input.hasNext()){
                String s = input.nextLine();
                String[] data = s.split("\n");
                length++;
                System.out.println(Arrays.toString(data));
            }
            input.close();

        }catch(Exception e){
            System.out.print("Error occured");
        }

        String[] names = new String[length];
        double[] scores = new double[length];
        int i = 0;
        try{
            Scanner input = new Scanner(new File("score.txt"));
            while(input.hasNext()){
                String name = input.next();
                double score = input.nextDouble();
                names[i] = name;
                scores[i] = score;
                i++;

            }
            input.close();
        }catch(Exception e){
            System.out.print("Error");
        }

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(scores));

        System.out.println("total Students are: "+names.length);
        double sum = 0;
        for (int j = 0;j<scores.length ;j++ ) {
            sum += scores[j];
        }
        double avg = sum/scores.length;
        System.out.println("Average is: "+ avg);

        int above_avg = 0;
        for (int z = 0;z< scores.length; z++) {
            if (scores[z]>=avg)
                above_avg++;

        }

        System.out.print("Total Students above average are: "+above_avg);
    }
}