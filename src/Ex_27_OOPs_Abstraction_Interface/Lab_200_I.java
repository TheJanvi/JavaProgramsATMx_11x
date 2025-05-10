package Ex_27_OOPs_Abstraction_Interface;

public class Lab_200_I {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        c1.drive();

    }

}
class Car1 implements Engine1, Break{

    void drive(){
        startEngine();
        applyBreak();
        stopEngine();
    }





    @Override
    public void applyBreak() {
        System.out.println("Apply Check");
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }

    @Override
    public void test() {
        Engine1.super.test();
    }
}






























interface  Break{
    void applyBreak();
}
interface Engine1{
    void startEngine();
    void stopEngine();
    default void test(){
        System.out.println("concrete complete");
    }
}