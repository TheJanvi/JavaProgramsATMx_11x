package Ex_22_OOPs_Polymorphism.Method_Overriding;

public class Lab_189_Method_Overriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("animal sound");
    }
}

class Dog extends Animal{
    @Override
    void  sound(){
        System.out.println("Bark!");
    }
}