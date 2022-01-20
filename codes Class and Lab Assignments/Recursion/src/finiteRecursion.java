public class finiteRecursion {
    static int count = 0; //making it static will make it a class variable (scope will be of class level)
    public static void main(String[] args) {
     abc();
    }
    static void abc(){
        if (count<5){
            System.out.println("baat itni bhi khatarnaak nhi! daaman e aimaal ger khali hai;daaman e rehmat tou bhara hua hai! ~ Wasif Ali Wasif");
            count++;
            abc();

        }
    }
}
