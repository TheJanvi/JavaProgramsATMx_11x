package Ex_32_Execption;

public class Lab_228_Try_Catch_Finally {
    public static void main(String[] args) {
        int a = 1;
        int c = 0;
        try {
            c = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I will be always executed!");
        }

    }
}
