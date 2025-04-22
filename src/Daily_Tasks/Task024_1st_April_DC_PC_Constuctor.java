package Daily_Tasks;

public class Task024_1st_April_DC_PC_Constuctor {
    public static void main(String[] args) {
        Person2 P1 = new Person2("Jennie", (byte) 21, "XYZ", 989898l, false);

        P1.eat();
        P1.sleep();
        P1.walk();
        P1.doHome();
        System.out.println("------------");
        P1.Print_Detail();



    }
}
class Person2{
    String Name;
    byte age;
    String Address;
    long Phone;
    boolean isMale;

    //DC
    Person2(){

    }
    //PC
    Person2(String Name_arg, byte age_arg, String Address_arg, long Phoen_arg, boolean isMale_arg){
        this.Name = Name_arg;
        this.age = age_arg;
        this.Address = Address_arg;
        this.Phone = Phoen_arg;
        this.isMale = isMale_arg;


        }
    void eat(){
        System.out.println(this.Name + "is Eating");
    }

    void sleep(){
        System.out.println(this.Name + "is Sleeping");
    }

    void walk(){
        System.out.println(this.Name + "is Walking");
    }

    void doHome(){
        System.out.println(this.Name + "Doing Homework");
    }

    void Print_Detail(){
        System.out.println("Name: " + this.Name);
        System.out.println("Address: " + this.Address);
        System.out.println("Age: " + this.age);
        System.out.println("Phone Number: " + this.Phone);
        System.out.println("Name: " + this.Name);
        System.out.println("Is Male: " + this.isMale);

    }
}