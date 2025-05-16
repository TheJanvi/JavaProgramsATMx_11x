package Ex_32_Execption;

public class Lab_220_String_NullPointer {
    public static void main(String[] args) {
        String name = null;
        name.trim(); //java.lang.NullPointerException: Cannot invoke "String.trim()" because "name" is null
    }


}
