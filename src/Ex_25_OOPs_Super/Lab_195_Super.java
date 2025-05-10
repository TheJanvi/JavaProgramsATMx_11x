package Ex_25_OOPs_Super;

public class Lab_195_Super{
    public static void main(String[] args) {

    }
}
class GOD{
    void sound(){
        System.out.println("God!");
    }
}

class Animal extends GOD{
    protected String color = "white";

    void sound(){
        System.out.println("Animal sound");
        super.sound();
    }

}

class dog extends Animal{
    private String color = "black";

    void display(){
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
    }
}

