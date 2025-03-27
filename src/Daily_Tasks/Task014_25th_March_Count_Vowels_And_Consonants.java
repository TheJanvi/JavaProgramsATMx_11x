package Daily_Tasks;

public class Task014_25th_March_Count_Vowels_And_Consonants {
    public static void main(String[] args) {
        String input = "Java Program to count vowels and consonants";
        int vowels = 0;
        int consonants = 0;

        input = input.toLowerCase();
        System.out.println(input);

        for (int i = 0; i < input.length() ; i++) {
            char ch  = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels = vowels + 1;
            }else  {consonants = consonants + 1;}

        }
        System.out.println("Number of vowels :" + vowels);
        System.out.println("Number of consotants:" + consonants);
    }
}
