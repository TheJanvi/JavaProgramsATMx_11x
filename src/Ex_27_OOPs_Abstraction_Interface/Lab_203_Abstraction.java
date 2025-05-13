package Ex_27_OOPs_Abstraction_Interface;

public class Lab_203_Abstraction {

}

class concreateclass implements incomplete_interface{

    @Override
    public void display() {
        System.out.println("hi");
    }
}


interface incomplete_interface{
    int a = 10;
    void display();
}
abstract class  incomplete_abstract{
    abstract void display1();
}


