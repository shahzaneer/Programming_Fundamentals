//10.	Finding average of elements in an array.
public class Task10 {
    public static void main(String[] args) {
        int [] array =  {1,2,3,4,5,6,7,8,9,10};
        int sum = 0 ;

        for (int e : array){
            sum+=e;
        }
        int numberOfIntegers = array.length;

        double average = sum/numberOfIntegers;
        System.out.println("The average of the integers of arrays is  : "+average);

    }
}
