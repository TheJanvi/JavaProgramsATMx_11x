package Ex_07_Increment_Decrement_OP;

public class Lab_064_Post_In_Example {
    public static void main(String[] args) {
        int a = 10;
        int result = a++;
        System.out.println(a);
        System.out.println(result);

        //Line No | a | Exp(Result)
        // 5 | 10 | NA
        // 6 | 11 | 10
        // 7 | 11 | NA
        // 8 | NA | 10

    }
}
