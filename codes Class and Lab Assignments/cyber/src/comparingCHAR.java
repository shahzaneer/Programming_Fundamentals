public class comparingCHAR {
    public static void main(String[] args) {
        char ch = '\\';

        if (ch >= 'A' && ch <= 'Z')
            System.out.println(ch + " is an uppercase letter");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println(ch + " is a lowercase letter");
        else if (ch >= '0' && ch <= '9')
            System.out.println(ch + " is a numeric character");


        System.out.println("1" + 1);
        System.out.println('1' + 1);
        System.out.println("1" + 1 + 1);
        System.out.println("1" + (1 + 1));
        System.out.println('1' + 1 + 1);

        String s1 = "Welcome to Java";
        String s2 = "Welcome to Java";
        String s3 = "Welcome to C++";
        System.out.println (s1.compareTo(s2)); // Both are equal->0
        System.out.println (s1.compareTo(s3)); // s1 is greater than s3->7 ASCII of J=74 and C=67 (74-67)
        System.out.println (s3.compareTo(s1)); // s3 less than s1 ->7 ASCII of J=74 and C=67 (67-74)

    }
}
