package Ex_32_Execption;

public class Lab_227_IQ {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            b = 10/a;//Vulnerable code that should be try and catch!
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
