package Ex_11_While;

import java.util.Scanner;

public class Lab113_While_Int_Que
{
    public static void main(String[] args) {
        //Factorial Program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program\nEnter the Number Whose Factorial you want:");
        int number = scanner.nextInt();

        int factorial = 1;
        if (number <= 0) {
            System.out.println(factorial);
        }
        else
        {
            for (int i = 1; i <= number ; i++) {
                factorial = factorial*i;

            }
        }
        System.out.println("Factorial is -> "+factorial);
    }
}
