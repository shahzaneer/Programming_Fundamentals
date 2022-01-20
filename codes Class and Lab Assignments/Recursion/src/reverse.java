public class reverse{
    public static void main(String[] args) {
        System.out.print(Reverse("Ahmad-SP21-BCS-052"));
    }
    public static String Reverse(String s){
        if (s.length() == 1){
            return s;
        }

        else{
            return Reverse(s.substring(1))+s.charAt(0);
        }
    }
}