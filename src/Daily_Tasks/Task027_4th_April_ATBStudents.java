package Daily_Tasks;

public class Task027_4th_April_ATBStudents {
    public static void main(String[] args) {
        Student S[] = new Student[3];

        S[0] = new Student("Janvi", 21, true);
        S[1] = new Student("Jennie", 20, false);
        S[2] = new Student("JD", 22, false);
        for (Student s : S){
            System.out.println(s);
        }
    }



}
class Student extends ATB {
    private String Student_Name;
    private int Student_Age;
    private boolean Course_Enrolled;

    Student (String Student_Name, int Student_Age, boolean Course_Enrolled){
//        super(Course_Name, Course_Price);
        super();
        this.Student_Name = Student_Name;
        this.Student_Age = Student_Age;
        this.Course_Enrolled = Course_Enrolled;
    }

    @Override
    public String toString() {
        if (!Course_Enrolled ) {
            return "ATB11x {" +
                    "Student Name='" + Student_Name + '\'' +
                    ", Student Age=" + Student_Age +
                    ", Course Enrolled=" + Course_Enrolled +
                    ", Course Info= Purchase the course!!}";
        }

        return "ATB11x {" +
                "Student Name='" + Student_Name + '\'' +
                ", Student Age=" + Student_Age +
                ", Course Enrolled=" + Course_Enrolled +
                ", Course Name=" + getCourse_Name() + '\'' +
                ", Course Price=" + getCourse_Price() +
                '}';


    }

}

