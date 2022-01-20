public class abc {

    public static int my_method(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else{
            return c;
        }
    }

    public static void main(String args[]){
        System.out.println("--------");
        int a,b,c;
        a=4;
        b=7;
        c=3;
        System.out.println(my_method(a,b,c));
    }



}
