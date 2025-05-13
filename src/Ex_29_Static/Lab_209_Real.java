package Ex_29_Static;

public class Lab_209_Real {
    public static void main(String[] args) {
        System.out.println(ATB.mentorName);
        System.out.println(ATB.courseName);

        ATB.doAssignment();
        ATB.joinZoom();

        ATB amit = new ATB();
        amit.setName("Amit");
        amit.setPhone("8935624");

        ATB lucky = new ATB();
        lucky.setName("Lucky");
        lucky.setPhone("8935624");

    }
}
class ATB{
    static {
        System.out.println("Load the class, i will execute");
    }
    {
        System.out.println("IIB - this is called when object is created");
//        what is the purpose->
//        here you can write code related to
//        start a website or anything before starting the
//        web automation or api automation
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private  String phone;
    static String courseName = "ATB11X";
    static String mentorName = "Promod";

    static void doAssignment(){
//        System.out.println(phone);//static method can not access the non-static method.
        System.out.println("Do Assignment");
    }
    static void joinZoom(){

        System.out.println("attend class");
    }

    void howTheyAssignment(){
        System.out.println("It is different");
    }
}
