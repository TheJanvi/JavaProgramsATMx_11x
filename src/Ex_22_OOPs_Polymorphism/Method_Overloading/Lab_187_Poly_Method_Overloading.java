package Ex_22_OOPs_Polymorphism.Method_Overloading;

public class Lab_187_Poly_Method_Overloading {
    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();
        int r1 = mathOperation.add(3,4);
        int r2 = mathOperation.add(3,4,9);
        double r3 = mathOperation.add(3.14,4.46);


    }
}
class MathOperation{

    //In the same class, when you have a method with same
    //name but different arguments and different return type.

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a + b;
    }
}