package Daily_Tasks;

public class Task_14th_March_CLI02 {
    public static void main(String[] args) {
        int number_1 = Integer.parseInt(args[0]);
        int number_2 = Integer.parseInt(args[1]);
        String result= (number_1>number_2) ? "Your First Number is Greater" : "Your Second Number is Greater";
        System.out.println(result);
    }
}
