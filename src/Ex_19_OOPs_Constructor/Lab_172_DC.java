package Ex_19_OOPs_Constructor;

public class Lab_172_DC {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Tesla";
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.Model);

        System.out.println("------");

        Car c2 = new Car();
        System.out.println(c2.name);
        System.out.println(c2.year);
        System.out.println(c2.Model);

    }
}
class Car{
    String name;
    int year;
    String  Model;

    //DC
    Car(){
        name = "Unknown Car";
        year = 1991;
        Model = "XXX";
    }
}