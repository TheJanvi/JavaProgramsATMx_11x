package Daily_Tasks;

public class Task021_28th_March_2nd_Highest_Number_Without_Function_Array {
    public static void main(String[] args) {

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

        int Largest = 0;
        int Second_Largest = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > Largest) {
                Second_Largest = Largest;
                Largest = numbers[i];
            } else if (numbers[i] > Second_Largest && numbers[i] != Largest ) {
                Second_Largest = numbers[i];
            }
        }
        System.out.println("First Largest Number is: "+Largest);
        System.out.println("Second Largest Number is: "+Second_Largest);



















    }
}
