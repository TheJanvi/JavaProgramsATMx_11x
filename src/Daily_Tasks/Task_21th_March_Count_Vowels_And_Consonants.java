package Daily_Tasks;

import java.util.Scanner;

public class Task_21th_March_Count_Vowels_And_Consonants {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String  vowels_consonants = Sc.nextLine();

        vowels_consonants = vowels_consonants.toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < vowels_consonants.length(); i++) {
            char ch = vowels_consonants.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++;
            } else if (ch >= 'a' && ch <='z') {
                consonantCount++;
            }


        }

        System.out.println("Vowels:" + vowelCount);
        System.out.println("Consonants:" + consonantCount);


        Sc.close();

    }
}
