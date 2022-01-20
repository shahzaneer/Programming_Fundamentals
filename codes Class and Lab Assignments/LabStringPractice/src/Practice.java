public class Practice {
    public static void main(String[] args) {
        String s1 = "Hello"; //s1 main memory location save hai string ki
        String s2 = "Hello"; // s2 main memory location save hai string ki
        String s3 = "hell0";
        String st3 = "hello"; // There is no special character for termination of String in java . the last character
        // is determined by the length function. it will print \0 as well !
        int s3l = s3.length();
// strings main == addresses k through comparison krta hai jbke .equals character by character ascii code ko compare
// krta hai!
//        why it comes to be true?
//        ager strings var alag alag bhi hon aur string value same ho tou bhi diff var same memory location ko point
//        krta hai is liay yeh true return hua hai.



//
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3);
        System.out.println(s3l);


    }
}
