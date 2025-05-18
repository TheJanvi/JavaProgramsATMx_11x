package Ex_32_Execption;

import java.util.Scanner;

public class Lab_229_TryCatch_Finally_Purpose {
    public static void main(String[] args) {
        Scanner scanner= null;
        scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        try {
            int b = 10/v;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
                scanner.close();
            System.out.println("End of Program, Scanner Closed!");
        }
    }
}
