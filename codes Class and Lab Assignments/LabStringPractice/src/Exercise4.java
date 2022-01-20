//Given a string in which the letter h occurs at least twice. Remove from that string the first and
//        the last occurrence of the letter h, as well as all the characters between them.
//        Sample Run:
//        Input: In the hole in the ground there lived a hobbit
//        Correct Answer: In tobbit


public class Exercise4 {
    public static void main(String[] args) {
        String str1 = "In the hole in the ground there lived a hobbit";
        String strPart1 = str1.substring(0,(str1.indexOf('h')));
        String strPart2 = str1.substring((str1.lastIndexOf('h')+1),(str1.length()));

        String strFixed = strPart1+strPart2;
        System.out.println(strFixed);



    }
}
