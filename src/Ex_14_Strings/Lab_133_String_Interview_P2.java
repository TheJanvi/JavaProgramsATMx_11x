package Ex_14_Strings;

public class Lab_133_String_Interview_P2 {
    public static void main(String[] args) {
        String s1 = "Hello;";
        String s4 = "Hello;"; //SCP -> 1

        String s2 = new String("Hello;") ; //OA
        String s3 = new String("Hello;") ;
        String s5 = new String("hello;") ;// OA -> 3

        // == -> comparison -> String -> this check the location ref.
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println(s1 == s4);
        System.out.println(s3 == s5);

        //equal (content) -> value
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equalsIgnoreCase(s5));
        //equalIgnoreCase -> promod, Pramod, PRAMOD, PraMod. PramoD-> promod
        // == Compare the value -> check for the ref
        //= assignment the value


    }
}
