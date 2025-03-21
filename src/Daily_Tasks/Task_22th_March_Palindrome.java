package Daily_Tasks;

public class Task_22th_March_Palindrome {
    public static void main(String[] args) {
        String name= "level";
        String reversed ="";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversed += name.charAt(i);
        }
        System.out.println("Reversed:"+reversed);
    }
}
