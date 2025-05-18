package Ex_32_Execption;

public class Lab_231_Jr_QA_VS_Sr_QA_2 {
    public static void main(String[] args) {
        //JR QA
        try {
            String ip = null;
            int a = Integer.parseInt(ip);
            int b = 100/a;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
