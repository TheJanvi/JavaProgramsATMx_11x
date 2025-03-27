package Ex_15_StringBuffer_Builder_StringFunctions;

public class Lab_136_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        // String - 90%

        String s0 = "Promod";

        String s1 = new String("Promod");

        //less than >10% use
        StringBuffer stringBuffer = new StringBuffer("Promod");

        StringBuilder stringBuilder = new StringBuilder("Promod");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}
