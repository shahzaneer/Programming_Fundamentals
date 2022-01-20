import java.util.Random;
public class practice {
    public static void main(String[] args) {
//        String a = "Shahzaneer Ahmed";
//        String b = "Noor ul Ain";
//
//        System.out.println(a.charAt(3));
//        String c = b.substring(0,4);
//        System.out.println(c);
//        System.out.println(c.length());
//        System.out.println("This is "+a+" "+c+" "+b);
////        System.out.printf("this is %s %s %s",a,b,c); %s strings %d int byte long , %f float double
        Random rand = new Random();
//        int number  = 1000 + rand.nextInt(3);
//        System.out.println(number);
        String alphabets = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String upperCaseLetters = "";

        for (int i = 0; i<3;i++){
            int randomIndex = rand.nextInt(alphabets.length());
            char randomChar = alphabets.charAt(randomIndex);
            upperCaseLetters+=randomChar;

        }
        System.out.println(upperCaseLetters);



    }
}
