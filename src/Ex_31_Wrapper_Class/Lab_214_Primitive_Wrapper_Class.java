package Ex_31_Wrapper_Class;

public class Lab_214_Primitive_Wrapper_Class {

    public static void main(String[] args) {
        int a = 10; // primitive
        //this is not an object
        //it will not have attribute or behaviour

        //WRAPPER CLASS -> in programming is class that encapsulates or wraps a primitive data type into an object.
        //What use of -> It is allowing primitive data types to be treated as objects.

        //Primitive data type -> char, byte. short, int, long, float, double, boolean //avoid them of using now

        //we will use the WRAPPER CLASSES
        //Character, Byte, Short, Integer, Long, Float, Double, Boolean

        Integer age = 10 ;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(age);
        System.out.println(age.intValue());
    }
}
