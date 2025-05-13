package Ex_30_ENUM;

public class Lab_211_ENUM {
    public static void main(String[] args) {
        System.out.println(Day.Friday);
        System.out.println(PROJECT_URLs.katalon);
//        A a = new A();
//        System.out.println(a.days[4]);
    }


}
//ENUM -> Special Data type -> allows you to define a collection of constants.
// Short form of Enumeration
//Representing a fixed set of related values, such as days, week, state in process or categories of items.

//class A{
//    String [] days = {"Mon", "Tue", "Wed", "Thurs", "Fri", "Sat", "Sun" };
//
//
//}

enum Day{
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}
enum PROJECT_URLs {
    google, restassured, katalon, vwo
}
