package Ex_26_OOPs_Abstraction_Abstract_Class;

public class Lab_197_AB_Cars {
    public static void main(String[] args) {
        Wagonr car = new Wagonr();
        car.drive();
    }

}
abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();

    void normal(){
        System.out.println("Normal function!");
    }

}
class Wagonr extends Engine{

    @Override
    void startEngine() {
        System.out.println("Starting the car!");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopinng the car!");
    }

    void drive(){
        startEngine();
        stopEngine();
    }

}//complete class - no abstract method
