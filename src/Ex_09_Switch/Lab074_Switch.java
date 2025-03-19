package Ex_09_Switch;

import java.util.Scanner;

public class Lab074_Switch {
    public static void main(String[] args) {
        //switch

        //Take user input and tell them the day which they have told
        //1 to 7 -> 1 -> Monday, 5 -> Friday
        //8 -> Not allowed pr Error

       //int day = Integer.parseInt(args[0]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Day Number (1 TO 7):");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid, Day Number");
                break;
        }

    }
}
