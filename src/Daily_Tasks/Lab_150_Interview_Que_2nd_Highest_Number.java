package Daily_Tasks;

import java.util.Arrays;

public class Lab_150_Interview_Que_2nd_Highest_Number {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        //100, 34

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
        System.out.println(numbers[numbers.length-3]);

    }
}
