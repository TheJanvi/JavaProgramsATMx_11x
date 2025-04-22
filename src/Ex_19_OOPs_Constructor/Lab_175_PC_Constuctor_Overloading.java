package Ex_19_OOPs_Constructor;


public class Lab_175_PC_Constuctor_Overloading
{
    public static void main(String[] args) {
        Person1 p1 = new Person1("Amit", 897665768, "ABC");
        Person1 p2 = new Person1("Promod", 98985768, "XYZ");

        Person1 p3 = new Person1();
        p3.name = "Shikha";
        System.out.println(p3.name);

        Person1 p4 = new Person1("Lucky" ,812345679);
        System.out.println(p4.address);

        p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();
    }
}
class Person1{
    String name;
    long phone;
    String address;

    Person1(){

    }
    Person1(String name_arg, long phone_arg, String address_arg){
        this.name = name_arg;
        this.phone = phone_arg;
        this.address = address_arg;
    }
    Person1(String name_arg, long phone_arg) {
        this.name = name_arg;
        this.phone = phone_arg;
    }

    void eat(){
        System.out.println(this.name + " is eating");
    }

}
