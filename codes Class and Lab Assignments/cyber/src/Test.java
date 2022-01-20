import java.util.*;
import java.io.*;
public class Test{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] array2D = new int [3][3];
		for(int i=0; i<array2D.length ; i++){
			for(int j =0; j<array2D[0].length;j++){
				System.out.print("Enter Value At Row "+(i+1)+" And Col "+(j+1)+" : ");
				array2D[i][j]=input.nextInt();
			}
		}
		int number0=0,number1=1,number2=2,number3=3,number4=4,number5=5,number6=6,number7=7,number8=8,number9=9;
		int count0=0,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0;
		for(int i = 0; i<array2D.length;i++){
			for(int j =0; j<array2D[0].length;j++){
				if(array2D[i][j]==number0){
					count0++;
				}
				else if (array2D[i][j]==number1) {
					count1++;
				}
				else if (array2D[i][j]==number2) {
					count2++;
				}
				else if (array2D[i][j]==number3) {
					count3++;
				}
				else if (array2D[i][j]==number4) {
					count4++;
				}
				else if (array2D[i][j]==number5) {
					count5++;
				}
				else if (array2D[i][j]==number6) {
					count6++;
				}
				else if (array2D[i][j]==number7) {
					count7++;
				}
				else if (array2D[i][j]==number8) {
					count8++;
				}
				else if (array2D[i][j]==number9) {
					count9++;
				}
			}
		}
		System.out.print("Number 0 Appears "+count0+" Times"+"\n"+
						 "Number 1 Appears "+count1+" Times"+"\n"+
						 "Number 2 Appears "+count2+" Times"+"\n"+
						 "Number 3 Appears "+count3+" Times"+"\n"+
						 "Number 4 Appears "+count4+" Times"+"\n"+
						 "Number 5 Appears "+count5+" Times"+"\n"+
						 "Number 6 Appears "+count6+" Times"+"\n"+
						 "Number 7 Appears "+count7+" Times"+"\n"+
						 "Number 8 Appears "+count8+" Times"+"\n"+
						 "Number 9 Appears "+count9+" Times"+"\n");
	}
}