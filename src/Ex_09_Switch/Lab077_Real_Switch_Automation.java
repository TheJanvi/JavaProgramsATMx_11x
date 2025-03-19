package Ex_09_Switch;

import java.util.Scanner;

public class Lab077_Real_Switch_Automation {
    public static void main(String[] args) {
        //Web Automation
        //I  will ask the user to give me input from browser which she wants to use to
        //I will start the automation in that browser


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Browser Name:");
        String browser = sc.next();

        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println(".......");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
            case "edge":
                System.out.println("Starting the edge code");
            default:
                System.out.println("I have no idea which browser is this");
        }
    }
}
