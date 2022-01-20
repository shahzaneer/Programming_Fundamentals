//Shahzaneer Ahmed
//SP21-BCS-087
//LAB 04

//Activity-1
//        Consider the statements:
//        double x = 75.3987;
//        double y = 982.89764;
//        What is the output of the following statements?
//        a. System.out.printf("%.2f %n", x);
//        b. System.out.printf("%.2f %n", y);
//        c. System.out.printf("%.3f %n", x);
//        d. System.out.printf("%.3f %n", y)

public class Activity1 {
    public static void main(String[] yahan_kuch_bhi_asakta_Hai) {
        double x = 75.3987;
        double y = 982.89764;

        System.out.printf("%.2f %n" , x);  //f is used for formatting %n is for for new line
//        field is less important , it only works when it is given more than the digits given.
        System.out.printf("%.2f %n" , y);  // 982.90  it also rounds off the number
        System.out.printf("%.3f %n" , x);  //75.399
        System.out.printf("%.3f %n" , y); //982.898

    }
}
