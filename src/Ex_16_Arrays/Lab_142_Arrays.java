package Ex_16_Arrays;

public class Lab_142_Arrays {
    public static void main(String[] args) {
        int [] marks = {51,100,91,90,99,95,89};
        boolean [] isMarried_People = {true,false,true,false}; // Array contains elements.

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[-1]);//ArrayIndexOutOfBoundsException
       // System.out.println(marks[10]);//ArrayIndexOutOfBoundsException

        char c = 'A'; //character contains character.
        String name = "Jennie"; // string contains character.
    }
}
