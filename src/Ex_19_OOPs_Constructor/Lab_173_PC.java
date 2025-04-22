package Ex_19_OOPs_Constructor;

public class Lab_173_PC {
    public static void main(String[] args) {

        Car2 c1 = new Car2();
        Car2 c2 = new Car2();
        System.out.println(c1.name);
        System.out.println(c2.name);

        Car2 c3 = new Car2("Tesla", "Model 3", 2015);
        System.out.println(c3.name);


        Car2 c4 = new Car2("Scorpio", "Mahindra", 2020);
        System.out.println(c4.name);

        Car2 c5 = new Car2("CURVV", "TATA", 2024);

    }
}
class Car2{

    String name;
    int year;
    String Model;

    //DC
    Car2(){
        name = "Unknown car";
        year = 1990;
        Model = "XXX";
        System.out.println("DC");
    }

    //Param - Constructor
    Car2(String name_OC_arg, String Model_OC_arg, int year_OC_arg){
            this.name = name_OC_arg;
            this.Model = Model_OC_arg;
            this.year = year_OC_arg;
    }

}