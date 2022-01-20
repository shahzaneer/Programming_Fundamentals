//recursion is a phenomenon in which a method calls itself continuously

public class infiniteRecursion {
    public static void main(String[] args) {
        abc();
    }
    static void abc(){
        System.out.println("this is pakistan!");
        abc();
    }
}
