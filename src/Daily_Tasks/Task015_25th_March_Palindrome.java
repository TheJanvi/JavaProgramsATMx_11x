package Daily_Tasks;

import java.util.Scanner;

public class Task015_25th_March_Palindrome {
    //Array of char

    public static void main(String[] args) {
        //madam -> madam, naman -> reverse -> naman

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input, Check Palindrome!!");
        String userInput = sc.next();
        String newString = reverseString(userInput);

        if (newString.equalsIgnoreCase(userInput)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        



    }

    private static String reverseString(String userInput) {
        StringBuilder stringBuilder = new StringBuilder(userInput);
        return stringBuilder.reverse().toString();

    }
}
