//------------------------------------------------------------------
//--------------------SHAHZANEER AHMED------------------------------
//-----------------------SP21-BCS-087-------------------------------
//-----------------------Class Assignment---------------------------
//-----------------------Question 2---------------------------------
//------------------------------------------------------------------

//Question – 2: ______
//        An array my_Array[] consisting ‘a’ s, ‘b’ s and ‘c’s. The task is to write a method that arranges
//        the array such that all ‘a’s are placed first, then all ‘b’s and then all ‘c’s in last.

import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        char [] my_Array = {'a','b','a','c','b','a','a','c','b'};
     // arrays containing character a's , b's , c's .
//     System.out.println((int)'a');  //the ascii code for characters a , b and c are 97,98,99 respectively.
//        we can compare them as integers and the comparison will take place in view of their ASCII equivalents.

//        System.out.println(('a'>'b')); //as 97>98 always returns to be false
            arrangeArray(my_Array);
        System.out.println(Arrays.toString(my_Array));

//        built-in Method to sort a character Array!
//        Arrays.sort(my_Array);
//        System.out.println(Arrays.toString(my_Array));
    }
    static void arrangeArray(char [] array){

        for (int i = 0; i<array.length;i++){
            for(int j = i+1; j<array.length;j++){
                if (array[i] > array[j]){
                    char temp;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}
