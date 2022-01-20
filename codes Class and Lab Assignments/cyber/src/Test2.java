import java.io.*;
import java.util.*;
public class Test2{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		try{
			File myObj = new File("Zohaib.txt");
			if(myObj.createNewFile()){
				System.out.println("true");
			}
			else{
				System.out.println("Error");
			}
		}
		catch(Exception a){
			System.out.print(a);
		}
			String[][] array = new String[2][];
			array[0]=new String[1];
			array[1]=new String[1];
			System.out.print("Enter Name : ");
			array[0][0]=input.next();
			System.out.print("Enter No : ");
			array[1][0]=input.next();
		write(array);
	}
	public static void write(String[][] array){
		try{
			FileWriter pen = new FileWriter("Zohaib.txt");
			pen.write(array[0][0]+"\n"+array[1][0]);
			pen.close();
			File myObj = new File("Zohaib.txt");
			input = new Scanner(myObj);
			while(input.hasNextLine()){
				String data = input.nextLine();
				System.out.print("Data In File Is : "+data+"\n");
			}
			input.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
