package Ex_05_TypeCasting;

public class Lab051_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;
        //byte b= val;//Invalid = Narrowing = Implicit Casting is not allowed.
        byte b2=(byte)val;// Valid- Narrowing - Doing by Explicit Casting - Allowed.
        //Data Loss.
        System.out.println(b2);
    }
}
