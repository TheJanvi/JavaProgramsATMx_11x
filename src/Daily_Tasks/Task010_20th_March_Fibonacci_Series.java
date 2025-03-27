package Daily_Tasks;

import java.util.Scanner;

public class Task010_20th_March_Fibonacci_Series {
    public static void main(String[] args) {
        //Fibonacci Series Generator
            Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a Fibonacci Sequence:");
        int n = Sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci series:" + first + ", " + second);

        for (int i = 2; i < n ; i++) {
            int next = first + second;
            System.out.println(", " + next);
            first = second;
            second = next;
        }
        Sc.close();
    }
}