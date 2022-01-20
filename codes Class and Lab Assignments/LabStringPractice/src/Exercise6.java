//Given a string. Replace every occurrence of the letter h by the letter H, except for the first and
//        the last ones.
//        Input: In the hole in the ground there lived a hobbit
//        Correct Answer: In the Hole in tHe ground tHere lived a hobbit

public class Exercise6 {
    public static void main(String[] args) {
        String  str = "In the hole in the ground there lived a hobbit";
        String str1 = str.replace('h','H');
       String strFirstHalf = str.substring(0,(str.indexOf('h')+1));
       String strLastHalf = str.substring(str.lastIndexOf('h'),(str.length()));
       String  strMiddle = str1.substring(str1.indexOf('H')+1 , (str1.lastIndexOf('H')));
       String  modeifiedString = strFirstHalf+strMiddle+strLastHalf;
        System.out.println(modeifiedString);



        }


    }

