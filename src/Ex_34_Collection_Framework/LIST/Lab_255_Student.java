package Ex_34_Collection_Framework.LIST;

public class Lab_255_Student {

}
class Student{
    private String name;
    private  String rollNo;

    public Student(String rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void PrintDetails(){
        System.out.println("Student Name: " + this.name);
        System.out.println("Student RollNo: " + this.rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }
}
