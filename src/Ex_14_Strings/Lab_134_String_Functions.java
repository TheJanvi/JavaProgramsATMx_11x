package Ex_14_Strings;

public class Lab_134_String_Functions {
    public static void main(String[] args) {
        String s1 = "Hello;";
        String s2 = "Hello;";
        String s3 = "Hello;";
        String s4 = new  String("Hello;");

        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s4));
    }
}
