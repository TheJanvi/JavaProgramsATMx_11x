package Ex_34_Collection_Framework.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab_256_AL_Student {
    public static void main(String[] args) {
        Student student = new Student("1", "janvi");
        Student student1 = new Student("2", "Jennie");
        Student student2 = new Student("3", "Chand");

        List<Student> myStudent = new ArrayList<>();
        myStudent.add(student);
        myStudent.add(student1);
        myStudent.add(student2);

        System.out.println(myStudent);

        student.PrintDetails();
        student1.PrintDetails();
        student2.PrintDetails();



    }
}
