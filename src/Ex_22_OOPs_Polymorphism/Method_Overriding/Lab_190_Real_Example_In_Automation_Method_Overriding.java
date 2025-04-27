package Ex_22_OOPs_Polymorphism.Method_Overriding;

public class Lab_190_Real_Example_In_Automation_Method_Overriding {
    public static void main(String[] args) {
//        ChromeTC c1 = new ChromeTC();
//        c1.OpenBrowser();
//
//        Firefox F1 = new Firefox();
//        F1.OpenBrowser();
//
//        CommonToAll commonToAll = new CommonToAll();
//        commonToAll.OpenBrowser();

        //Dynamic Dispatch

        CommonToAll c2 = new ChromeTC();
        c2.OpenBrowser();

        CommonToAll c3 = new Firefox();
        c3.OpenBrowser();

//        ChromeTC c4 = new CommonToAll();
//        c4.OpenBrowser(); - > incompatible types: Ex_22_OOPs_Polymorphism.Method_Overriding.CommonToAll cannot be converted to Ex_22_OOPs_Polymorphism.Method_Overriding.ChromeTC

//        ChromeTC c5 = new Firefox(); // NO RELATION
//        c5.OpenBrowser();// Incompatible error occur.

//        Firefox c6 = new ChromeTC(); // NO RELATION
//        c6.OpenBrowser();// Incompatible error occur.

//        Firefox f2 = new CommonToAll();
//        f2.OpenBrowser();// Incompatible error occur.

    }


}

class CommonToAll{
    void OpenBrowser(){
        System.out.println("Open the IE browser!");
    }
}

class ChromeTC extends CommonToAll{
    @Override
    void OpenBrowser(){
        System.out.println("Chrome will open now!");
    }
}

class Firefox extends CommonToAll{
    @Override
    void OpenBrowser(){
        System.out.println("Firefox Will Start!");
    }
}