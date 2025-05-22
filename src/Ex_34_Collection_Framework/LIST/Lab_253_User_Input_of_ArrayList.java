package Ex_34_Collection_Framework.LIST;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_253_User_Input_of_ArrayList {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String continueInput = "Y"; //Control variavle for input loop

        while (continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter the name " );
            String name = scanner.nextLine();
            names.add(name);

            System.out.println("Enter the age " );
            Integer age = scanner.nextInt();
            ages.add(age);

            scanner.nextLine();
            System.out.println("Do you want to enter another record? (Y/N): ");
            continueInput = scanner.nextLine();

        }
        for (Object o: names){
            System.out.println(o);

        }
        for (Object o1: ages){
            System.out.println(o1);
        }
        scanner.close();


    }
}
