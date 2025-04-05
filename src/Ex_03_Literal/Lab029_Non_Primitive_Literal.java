package Ex_03_Literal;

public class Lab029_Non_Primitive_Literal {
    public static void main(String[] args) {
        //Primitive Data type
        //Defined by java guys
        //Max,Min,Size defined
        byte b = 10;//1 byte -> 8 bits
        int age = 65;// 4 byte -> 32 bits

        //Non-Primitive data type , Reference data types
        //Defined by users
        //max,min
        //8 byte, 64 bits
        //String, Arrays, Classes, enum..
        String Name= "Jennie"; //String is bunches of char.
        int[] arrays_of_items= new int[10];// memory address->[I@4e50df2e(hash code)

        System.out.println(b+age+Name+arrays_of_items);//without convert array into string it will compile as how default reference representation of an integer array in java, meaning the memory address (hash code)  of the array object
    }
}
