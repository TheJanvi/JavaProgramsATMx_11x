package Ex_19_OOPs_Constructor;

public class Lab_174_PC_Real
{
    public static void main(String[] args) {
        Person p1 = new Person("Amit", 897665768, "ABC");
        Person p2 = new Person("Promod", 98985768, "XYZ");

        Person p3 = new Person();
        p3.name = "Shikha";
        System.out.println(p3.name);

        Person p4 = new Person("Lucky" ,812345679);
        System.out.println(p4.address);

        p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();
    }
}
class Person{
    String name;
    long phone;
    String address;

    Person(){

    }
    Person(String name_arg, long phone_arg, String address_arg){
        this.name = name_arg;
        this.phone = phone_arg;
        this.address = address_arg;
    }
    Person(String name_arg, long phone_arg) {
        this.name = name_arg;
        this.phone = phone_arg;
    }

        void eat(){
        System.out.println(this.name + " is eating");
    }

}
