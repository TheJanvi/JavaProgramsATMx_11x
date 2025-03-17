package Ex_07_Increment_Decrement_OP;

public class Lab_067_Example2 {
    public static void main(String[] args) {
        int a =10;
        System.out.println(++a + ++a);
        System.out.println(a);

        //A -> ExpA -> 11, a -> 11
        //+
        //b -> ExpB -> 12, a => 12
        //A+B -> ExpA + ExpB -> 11+12 -> 23, a -> 12
    }
}
