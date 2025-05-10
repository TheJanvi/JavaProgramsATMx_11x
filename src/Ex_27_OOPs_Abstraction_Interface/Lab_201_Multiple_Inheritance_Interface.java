package Ex_27_OOPs_Abstraction_Interface;

public class Lab_201_Multiple_Inheritance_Interface {
    public static void main(String[] args) {
        child c1 = new child();
        c1.money();
    }


}
interface mother{
    void money();
}

interface father {

    void money();
}
class child implements mother,father{

    @Override
    public void money() {
        System.out.println("Child money");
    }
}