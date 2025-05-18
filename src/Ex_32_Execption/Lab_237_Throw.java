package Ex_32_Execption;

import java.util.Scanner;

public class Lab_237_Throw {

    public static void main(String[] args) throws Exception {


        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Your Age");
            int age = scanner.nextInt();
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    private static void validateAge(int age) throws Exception {
        if (age < 18){
            throw new Exception("You cant go, else you will be out of the house");
//            throw new NotValidAgeException("Not a valid age");
        }


    }


}
