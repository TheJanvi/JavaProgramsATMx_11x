package Ex_17_Arrays_2D;

import java.util.Scanner;

public class Lab_157_2D_Right_Triangle {
    public static void main(String[] args) {
        //How pattern we want
        //*
        //**
        //***
        // R = N = 3

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number eg. n=3");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }



    }
}
