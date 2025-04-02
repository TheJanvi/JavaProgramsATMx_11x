package Ex_17_Arrays_2D;

import java.util.Scanner;

public class Lab_158_2D_Multiplication_Table {
    public static void main(String[] args) {
        //Multiplication of matrix

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int Size_of_the_Table = scanner.nextInt();

        for (int i = 1; i <= Size_of_the_Table; i++) {
            for (int j = 1; j <= Size_of_the_Table; j++) {
                System.out.print(i +"x"+ j +"="+ (i * j) + "\t");
                System.out.println("\t");
            }
            System.out.println();
        }
    }
}
