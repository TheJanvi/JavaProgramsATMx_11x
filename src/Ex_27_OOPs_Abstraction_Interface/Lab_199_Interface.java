package Ex_27_OOPs_Abstraction_Interface;

public class Lab_199_Interface {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(10, 10);

        Square s1 = new Square();
        s1.getArea(3, 4);
    }
}

class Square implements Polygon{

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area of Square ->" + 3.14 *length*breadth);
    }
}



class Rectangle implements Polygon{

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + ( length * breadth));
    }
}

interface Polygon{
    void getArea(int length, int breadth);
}