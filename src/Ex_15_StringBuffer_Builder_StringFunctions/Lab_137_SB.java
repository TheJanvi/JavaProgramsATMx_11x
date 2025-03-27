package Ex_15_StringBuffer_Builder_StringFunctions;

public class Lab_137_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Jennie");
        stringBuffer.append("123");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());

        String s1 = "hello";
        String s2 = "world";
        String s3 = s1 + s2;// create a new string "hello world"
        System.out.println(s3);// output : hello world
        System.out.println(s1);




    }
}
