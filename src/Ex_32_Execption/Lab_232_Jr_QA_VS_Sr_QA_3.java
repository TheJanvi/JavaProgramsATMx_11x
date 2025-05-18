package Ex_32_Execption;

public class Lab_232_Jr_QA_VS_Sr_QA_3 {
    public static void main(String[] args) {
        // QA
        try {
            String ip = null;
            int a = Integer.parseInt(ip);
            int b = 100/a;
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }

    }
}
