package Daily_Tasks;

public class Task_14th_March_In_De01 {
    public static void main(String[] args) {
        //
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        //A -> ++a -> ExpA -> 11, a -> 11
        //+
        //B -> a++ -> ExpB -> 11, a -> 12
        //+
        // c -> a++ -> ExpC -> 12, a -> 13
        //A+B+C -> ExpA + ExpB + ExpC -> 11+11+12 -> 34, a -> 13
    }
}
