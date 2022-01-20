import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class forEachLoop {
    public static void main(String[] args) {
        File myfile = new File("AliAwan.txt");

        try {
            FileWriter myfw = new FileWriter("AliAwan.txt");
            myfw.write("khuda ki raza chahtay hain do aalam! khuda chahta hai raza e muhammad!");
            myfw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
