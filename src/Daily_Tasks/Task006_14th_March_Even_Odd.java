package Daily_Tasks;

import java.util.Scanner;

public class Task006_14th_March_Even_Odd {
    public static void main(String[] args) {
        //Create a Program
        //Take User Input
        //Check weather the input is even or odd Number

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Number:");
        int Number = scanner.nextInt();
        if (Number%2==0){
            System.out.println(Number+"\n"+"Number is Even!");
        }
        else{
            System.out.println(Number+"\n"+"Number is Odd!");
        }
    }
}
