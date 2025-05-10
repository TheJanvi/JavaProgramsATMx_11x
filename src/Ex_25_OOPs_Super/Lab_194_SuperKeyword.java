package Ex_25_OOPs_Super;

public class Lab_194_SuperKeyword {
    public static void main(String[] args) {
        Car c1 = new Car(100);
        c1.display();




    }
}
class Vehicle{
    public int maxSpeed = 180;

    //Default Constructor
    Vehicle(){
        System.out.println("Default Const");
    }

    //Param Constructor
    Vehicle(int a){
        System.out.println("Param Const");
    }

    //Method Overloading-> same name function, with different arguments.
    void message(){
        System.out.println("No return, No argument");
    }

    void message(int a){
        System.out.println("PC - argument");
    }

    //Normal Function
    void display(){
        System.out.println("Vehicle parents");
    }


}

class Car extends Vehicle{
    private int maxSpeed = 281;

    Car(){
    super();//DC of parent
    }
    Car(int a){
    super(10);//PC of parent
    }

    //Method Overloading

    @Override
    void display(){
        System.out.println(this.maxSpeed);

        //Parent
        System.out.println(super.maxSpeed);
        super.message();
        super.message(10);

        System.out.println("Override");
    }
}
