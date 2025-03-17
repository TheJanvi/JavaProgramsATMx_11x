package ex_08_if_Condition;

import java.util.Scanner;

public class Lab072_If_Else {
    public static void main(String[] args) {
        //Allowed tp vote or not
        //If age > 18 -> allowed to vote.
        //Else age < 18 -> Not Allowed to vote.

    //How to Take User Input
        //->1.CLI Option
        //int age = Integer.parseInt(args[0]);

        //-> 2. Scanner Class
        Scanner scanner = new Scanner((System.in));
        System.out.println("Enter Your Age!");
        int age = scanner.nextInt();

        if (age > 18 ){
            System.out.println("Yes, You are Allowed to Vote!");
        }else{
            System.out.println("No,You are Not Allowed to Vote!!");
        }
    }
}
