//jvm sbse pehle static block ko execute krta hai iske  bad krta hai static methods ko then bananta hai necessary
// objects program k liay phir jata hai instance methods ki trff.

public class jvm {
    public static void main(String[] args){
//        System.out.println("Hello");
    }
    static //static block
    {
//        static block main method k bagair bhi execute krta hai
        System.out.println("Static block");
    }
}
