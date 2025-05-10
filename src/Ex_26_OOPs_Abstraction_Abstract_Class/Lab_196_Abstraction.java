package Ex_26_OOPs_Abstraction_Abstract_Class;

public class Lab_196_Abstraction {
    public static void main(String[] args) {
            Child c = new Child();
            c.loan50k();
            c.loan25k();
//            Father f1 = new Father();

    }


}
 abstract class Father{
    abstract void loan50k();
    void loan25k()
    {
        System.out.println("given 25k");
    }
}

class Child extends Father{

    @Override
    void loan50k() {
        System.out.println("Child will pay a loan");
    }
}


