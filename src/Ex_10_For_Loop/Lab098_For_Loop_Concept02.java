package Ex_10_For_Loop;

public class Lab098_For_Loop_Concept02 {
    public static void main(String[] args) {
        for (long i = 1L; i < 10 ; i++) {
            System.out.println(i);
        }
        for (float f = 0; f < 10.6; f++) {
            System.out.println("Hi, Float ->"+f);
        }
    }
}
//Not Advisable b'cuz When we use for loops in api automation and web automation, most of the time we will be using the integer, and we want to increase them by integer only.
