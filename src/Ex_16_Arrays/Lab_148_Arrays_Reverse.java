package Ex_16_Arrays;

public class Lab_148_Arrays_Reverse {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //5, 4, 3, 2, 1

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
