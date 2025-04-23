package Ex_21_OOPs_Inheritance;

public class Lab_176_Inheritance {
    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();

        Son s1 = new Son();
        s1.bhk3();
        System.out.println(s1.gold_f);
        s1.bhk2();
    }
}
class Father{
    int gold_f = 1000;//Attribute | Data variable | Property | Instance Variable

    void bhk2(){ // behaviour | method | function | data members
        System.out.println("Father - 2BHK");
    }
}


class Son extends Father{
    void bhk3(){
        System.out.println("3BHK Son");
    }
}

