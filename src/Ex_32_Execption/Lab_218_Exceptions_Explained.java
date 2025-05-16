package Ex_32_Execption;

public class Lab_218_Exceptions_Explained {
    public static void main(String[] args) {


        System.out.println("Starting the program");
        String input_user = args[0];//java.lang.ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(input_user);//java.lang.NumberFormatException: For input string: "me"
        int output = 100 / a;//java.lang.ArithmeticException: / by zero
        System.out.println(output);
        System.out.println("End of the program");
        //Unchecked Example ->
//java.lang.NumberFormatException: For input string: "me"
//java.lang.ArithmeticException: / by zero
//java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0

     }
}
