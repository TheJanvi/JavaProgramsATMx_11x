package Ex_16_Arrays;

public class Lab_146_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29 , 49};
        //can we take the input from user also? yes - later
        //Max and Min

        //Max
        int Max_output = Give_me_Max(array);
        System.out.println(Max_output);

        int Min_output = Give_me_Min(array);
        System.out.println(Min_output);
    }

    private static int Give_me_Min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    private static int Give_me_Max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > max){
                max = array[i];
            }

        }
        return max;
    }
}
