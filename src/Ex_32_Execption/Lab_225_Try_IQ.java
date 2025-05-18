package Ex_32_Execption;

public class Lab_225_Try_IQ {
    public static void main(String[] args) {
        try {
            String s = null;
            s.trim();
            int a = 10/0;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (Exception E){
            System.out.println(E.getMessage());
        }

    }


}
