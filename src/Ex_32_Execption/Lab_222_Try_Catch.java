package Ex_32_Execption;

public class Lab_222_Try_Catch {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 10/0;
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("2");

    }




}
