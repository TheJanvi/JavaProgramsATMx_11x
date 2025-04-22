package Ex_19_OOPs_Constructor;

import java.io.FileInputStream;

public class Lab_170_Example2 {
    public static void main(String[] args) {
        WebAutomation w1 = new WebAutomation();
    }
}
class WebAutomation{

    //DC
    WebAutomation(){
        System.out.println("I want to read a csv file");
        System.out.println("Open the page before loading the scripts");
        System.out.println("You can do anything which you want to do, when object is created.");
        //FileInputStream fileInputStream = new FileInputStream("C://..")
    }


}
