package Ex_32_Execption;

public class Lab_226_IQ {
    public static void main(String[] args) {
        try {
            String input_user = args[0];//java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(input_user);//java.lang.NumberFormatException: For input string: "me"
            int output = 100 / a;
        } catch (NumberFormatException |ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
