package Ex_32_Execption;

public class Lab_224_Try_Catch_Multiple_IQ {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //Not possible as big exception is used before
//        catch (ArithmeticException a){
//            System.out.println(a.getMessage());
//        }

        }


    }


