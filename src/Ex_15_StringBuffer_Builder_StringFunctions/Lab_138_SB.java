package Ex_15_StringBuffer_Builder_StringFunctions;

public class Lab_138_SB {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append("123");
        System.out.println(stringBuilder);

        String s1 = "hello";
        String s2 = "123";
        String s3 = s1 + s2;// create a new string "hello world"
        System.out.println(s3);// output : hello world
        System.out.println(s1);
    }
}
