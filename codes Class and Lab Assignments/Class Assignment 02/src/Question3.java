//------------------------------------------------------------
//----------------Shahzaneer Ahmed----------------------------
//////////////////SP21-BCS-087--------------------------------
//--------------CLASS Assignment 02---------------------------
//------------------------------------------------------------

//Question – 3: ______
//        Assume a vehicle plate number consists of three uppercase letters followed by four digits. Write a
//        program to generate a plate number.
//        ABC0087


import java.util.Random;
public class Question3 {
    public static void main(String[] args) {

        Random rand = new Random();
        int numbers = 1000 + rand.nextInt(10000);
//        System.out.println(numbers);
        String alphabets = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String upperCaseLetters = "";

            for (int i = 0; i<3;i++){
                int randomIndex = rand.nextInt(alphabets.length());
                char randomChar = alphabets.charAt(randomIndex);
                upperCaseLetters+=randomChar;

            }
//        System.out.println(upperCaseLetters);

        System.out.printf("The randomly generated Number plate is : %s%d", upperCaseLetters,numbers);



    }
}
