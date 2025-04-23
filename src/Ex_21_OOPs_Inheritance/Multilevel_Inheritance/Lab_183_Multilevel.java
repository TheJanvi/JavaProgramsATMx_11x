package Ex_21_OOPs_Inheritance.Multilevel_Inheritance;

public class Lab_183_Multilevel {
    public static void main(String[] args) {

//       Son s1 = new GrandFather();
//        Son s1 = new Father();
        Son amit = new Son();

        GrandFather g1 = new Son();//Dynamic Dispatch
        g1.gf();
        g1.Home();

        GrandFather g2 = new Father();
        g2.Home();

        Father f2 = new Son();
        f2.Home();
//        Father f3 = new GrandFather();

//        WebDriver driver = new ChromeDriver();
    }
}
