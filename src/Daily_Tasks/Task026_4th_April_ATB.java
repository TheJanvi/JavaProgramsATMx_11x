package Daily_Tasks;

public class Task026_4th_April_ATB {
    public static void main(String[] args) {
//        ATB atb = new ATB("Automation Testing Course", 12000.0);
//        System.out.println("-----Getter------");
//        atb.getCourse_Name();
//        System.out.println(atb.getCourse_Name());
//
//        atb.getCourse_Price();
//        System.out.println(atb.getCourse_Price());
//
//        System.out.println("\n-----Setter------");
//
//        atb.setCourse_Name("Python Automation Testing Course", false);
//        atb.setCourse_Price(10000.00, false);
    }
}
class ATB{
    //Private instance variable
    private  String Course_Name;
    private double Course_Price;

    //Param Constructor
//    ATB(String Course_Name, double Course_Price){
//       this.Course_Name = Course_Name;
//       this.Course_Price = Course_Price;
//    }
    ATB(){
        this.Course_Name = "Automation Testing Course";
        this.Course_Price = 12000.0;
    }
//getter for Course Name
    public String getCourse_Name() {
        return Course_Name;
    }
//setter for Course Name
    public void setCourse_Name(String course_Name, boolean IsAdmin) {
        if (IsAdmin){this.Course_Name = course_Name;}
        else {
            System.out.println("Please Purchase course!!");
        }
    }
//getter for Course price
    public double getCourse_Price() {
        return Course_Price;
    }
//Setter fot course price
    public void setCourse_Price(double course_Price, boolean IsAdmin) {
        if (IsAdmin){this.Course_Price = course_Price;}
        else {
            System.out.println("You are not allowed to set price! ");
        }
    }

}
