//Shahzaneer Ahmed
//SP21-BCS-087
//LAB 04

//Activity-4
//        Write JAVA statements using System.out.prinf() statement to display output as given
//        below
//public class DemoFormat {
//    public static void main(String[] args) {
//        // Display the header of the table using System.out.printf()
//        int degrees = 30;
//        double radians = Math.toRadians(degrees);
//        double sin = Math.sin(radians);
//        double cos = Math.cos(radians);
//        double tan = Math.tan(radians);
//        // Display the Data of the table using System.out.printf()
//
//        degrees = 60;
//        radians = Math.toRadians(degrees);
//        sin = Math.sin(radians);
//        cos = Math.cos(radians);
//        tan = Math.tan(radians);
//        // Display the Data of the table using System.out.printf()
//    }
//}
//    Degrees Radians Sine Cosine Tangent
//        30 0.5236 0.5000 0.8660 0.5773
//        60 1.0472 0.8660 0.5000 1.732


import java.math.*;
public class Activity4 {
    public static void main(String[] args) {
//         Display the header of the table using System.out.printf()
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        // Display the Data of the table using System.out.printf()

        int _degrees = 60;
        double _radians = Math.toRadians(degrees);
       double _sin = Math.sin(radians);
        double _cos = Math.cos(radians);
        double _tan = Math.tan(radians);
        // Display the Data of the table using System.out.printf()

        System.out.println("Degrees Radians Sine Cosine Tangent");
        System.out.printf("%-5d %6.4f %6.4f %6.4f %6.4f \n",degrees,radians,sin,cos,tan);
        System.out.printf("%-5d %6.4f %6.4f %6.4f %6.4f ",_degrees,_radians,_sin,_cos,_tan);

//        Degrees Radians Sine Cosine Tangent
//        30 0.5236 0.5000 0.8660 0.5774
//        60 0.5236 0.5000 0.8660 0.5774


    }
}

