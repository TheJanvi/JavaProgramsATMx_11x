package Daily_Tasks;

public class Task_14th_March_In_De02 {
    public static void main(String[] args) {
        int a =20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);

        //A -> --a -> ExpA -> 19, a-> 19
        //+
        //B -> a++ -> ExpB -> 19, a -> 20
        //+
        //C -> a-- -> ExpC -> 20, a -> 19
        //A+B+C -> ExpA + ExpB + ExpC -> 19+19+20 -> 58, a -> 19
    }
}
