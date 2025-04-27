package Ex_22_OOPs_Polymorphism.Method_Overloading;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(3,4);
        c1.add(3.14, 4.56);
    }
}
