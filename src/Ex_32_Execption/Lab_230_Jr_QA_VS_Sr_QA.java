package Ex_32_Execption;

public class Lab_230_Jr_QA_VS_Sr_QA {
    public static void main(String[] args) {
        String ip = null;
        try {
            ip = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        int a = 0;
        try {
            a = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());        }
        try {
            int b = 100/a;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());        }


    }
}
