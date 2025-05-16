package Ex_31_Wrapper_Class;

public class Lab_215_Wrapper_Conversion {
    public static void main(String[] args) {

        int a = 10;
        Integer b = a; //this boxing -> automatically JVM will store the value
        //primitive to wrapper -> AutoBoxing
        System.out.println(b.intValue()); //Behaviour
        System.out.println(Integer.MIN_VALUE);//Behaviour

        Integer a2 = 42;
        int v = a2; //Unboxing -> wrapper is removed, attribute, behaviour is lost.
        System.out.println(v);

    }
}
