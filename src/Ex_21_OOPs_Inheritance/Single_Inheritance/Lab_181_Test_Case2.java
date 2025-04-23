package Ex_21_OOPs_Inheritance.Single_Inheritance;

public class Lab_181_Test_Case2 extends Lab_179_Common_To_All {
    void runningTC2(){
        startBrowser();
        System.out.println("Running TC2");
        readExcelFile();
        readDataBaseFile();
        closeBrowser();
    }
}
