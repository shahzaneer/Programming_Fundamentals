//------------------------------------------------------------------
//--------------------SHAHZANEER AHMED------------------------------
//-----------------------SP21-BCS-087-------------------------------
//-----------------------Question 2---------------------------------
//------------------------------------------------------------------

//Write a program that prints the characters in the ASCII character table from! To ~.
//        Display ten characters per line. Characters are separated by exactly one space.
public class Exercise2 {
    public static void main(String[] args) {
        int counter = 0;

        for (int i = 33; i<=126; i++){
//            the ascii value of ! is 33 and ~ is 126.
//            all the other values/Ascii characters are in between these ascii characters

            counter+=1;

            if (counter%10!=0) System.out.print((char)i+" ");

            else if (counter%10==0) System.out.println((char)i);
        }

    }
}
