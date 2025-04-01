package Ex_16_Arrays;

public class Lab_149_Sum_of_Arrays {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

        }
        System.out.println(sum);

        System.out.println("--------");

        System.out.println("--------For each-------");
        for (int n : numbers ) {
            sum = sum + n;
        }
        System.out.println(sum);

    }

}
