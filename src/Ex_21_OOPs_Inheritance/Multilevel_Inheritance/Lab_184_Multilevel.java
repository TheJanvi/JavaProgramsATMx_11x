package Ex_21_OOPs_Inheritance.Multilevel_Inheritance;

public class Lab_184_Multilevel {
    public static void main(String[] args) {
//        Son s1 = new GrandFather();
//        Son s1 = new Father();
//        Son amit = new Son();
//        amit.s();
//        amit.f();
//        amit.gf();
//        amit.Home();
//        System.out.println(amit.gold_gf);
//
//        Father f1 = new Father();
//        f1.Home();

        GrandFather gf1 = new GrandFather();
        gf1.Home();

        GrandFather grandFather = new Son();
        grandFather.Home();


    }
}
