package Ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab114_While_Guessinng_Game {
    public static void main(String[] args) {
        //guess a number between 1 to 10
        //
        Random random= new Random();
        int numberToGuess = random.nextInt(10)+1;
        System.out.println(numberToGuess);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");

        int guess;
        int attempts = 0;

        while (true){

            guess=scanner.nextInt();
            attempts++;

            if (guess < numberToGuess){
                System.out.println("To low, Try Again");
            }
          else if (guess > numberToGuess){
               System.out.println("Too High, Try Again");
           }else
           {
               System.out.println("Correct! You guessed it in "+attempts+ "attempts");
               break;
            }
        }
    }







}
