package Ex_07_Increment_Decrement_OP;

public class Lab_062_Post_InDe {
    public static void main(String[] args) {
        int a =10;
        System.out.println(++a);
        System.out.println(a);

        //Post-Increment -> Print first and then increased value.
        int a_post = 20;
        System.out.println(a_post++);
        System.out.println(a_post);

    }
}
