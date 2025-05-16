package Ex_31_Wrapper_Class;

public class Lab_216_Wrapper_Conversion_Part_2 {
    public static void main(String[] args) {
        String num = "10";
        int A = 10;

        //String -> wrapper -> parseX(), Integer.parseInt(num); Double.parseDouble();
            Integer a = Integer.parseInt(num);
            Integer b = Integer.valueOf(num);

        //String -> Primitive
        int aaa = Integer.parseInt(num);

        //Wrapper -> toString
        System.out.println(a.toString());

        //Primitive to String
        int age = 20;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString());

















    }
}
