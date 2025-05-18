package Ex_32_Execption;

public class Lab_223_Try_Catch_Multiple {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        }catch (ArithmeticException a){
            System.out.println(a.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }




}
