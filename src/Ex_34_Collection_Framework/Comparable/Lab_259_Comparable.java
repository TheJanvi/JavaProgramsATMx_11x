package Ex_34_Collection_Framework.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_259_Comparable {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Vijay", 23);
        Student s2 = new Student(104, "jay", 21);
        Student s3 = new Student(106, "Ajay", 27);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        //Collections.sort(studentList); there is no way t sort them or compare them for sorting.
        //If we create lits of adding a marks

        List marks = new ArrayList();
        marks.add(91);
        marks.add(86);
        marks.add(90);
        marks.add(98);
        marks.add(78);

        //if we want sorted marks, then we print and get sorting.
        Collections.sort(marks);
        System.out.println(marks);//[78, 86, 90, 91, 98]

        //Now for studentList we want sorting then, we have to Implements Comparable Interface.
        Collections.sort(studentList);
        System.out.println(studentList);

    }

}
class Student implements Comparable<Student>{
    private int rollNo;
    private String name;
    private int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.rollNo-o.rollNo;
//    }
//@Override
//public int compareTo(Student o) {
//    return this.age-o.age;
//}
@Override
public int compareTo(Student o) {
    return this.name.compareTo(o.name);
}
}