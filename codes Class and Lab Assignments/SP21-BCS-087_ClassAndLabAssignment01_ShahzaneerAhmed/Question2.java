// |----------------------------------------------------------|
// |------------------Shahzaneer Ahmed------------------------|
// |-------------------SP21-BCS-087---------------------------|
// |----------------------------------------------------------|

//Question – 2: This question focuses on the basic elements of JAVA language (comments,
//        Special Symbols, Reserve Words and Identifiers)
//        Consider following JAVA Code
///*This program will calculate product of three numbers */
//public class Product{
//    public static void main(String[] args){
//        int num1 = 10; // first number
//        int num2 = 20; // second number
//        int num3 = 1;// third number
//        int result; //product of numbers
//        result = num1 * num2 * num3;
//        System.out.println("Product of numbers: "+result);
//    }
//}
//    You are required to identify following (Show your answer as tabular form)
//- comments (Single Line, Multiline),
//        - Special symbols (three)
//        - Reserve words (three)
//        - Identifier (predefined and defined by user) (three each)
//        - Standard Input Stream Object
//        - Standard Output Stream Object

public class Question2 {
    public static void main(String[] args) {
        int num1 = 10; // first number
        int num2 = 20; // second number
        int num3 = 1;// third number
        int result; //product of numbers
        result = num1 * num2 * num3;
        System.out.println("Product of numbers: "+result);

        System.out.println("The Single line comments are written after // and multiline comments are written after /*..... */");
        System.out.println("In this case there are single line comments after the initialization of num1,num2,num3 " +
                "and declaration of result ");
        System.out.println("Special Symbols Include // , * , ; , ");
        System.out.println("Reserve words : public , static , void , main , int ,String ");
        System.out.println("For Standard input Stream we use Scanner class to get input from the keyboard but in this" +
                " case we have no Standard input Stream rather we have hardcoded the values");
        System.out.println("System.out.println() is the function which is standard output Stream ");


    }
}
