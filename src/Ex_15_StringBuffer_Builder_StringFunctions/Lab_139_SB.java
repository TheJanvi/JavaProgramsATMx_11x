package Ex_15_StringBuffer_Builder_StringFunctions;

public class Lab_139_SB {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append("Programming");
        System.out.println(sb);
        System.out.println(sb);
        sb.delete(5,16);
        sb.replace(0,4, "C++");
        System.out.println(sb);
    }
}
