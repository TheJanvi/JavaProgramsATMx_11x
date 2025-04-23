package Daily_Tasks;

public class Task025_2nd_APRIL_why_multiple_inheritance_not_possible {
    public static void main(String[] args) {

    }
    //Student have Class of Maths Subject

}
class Teacher1{
  void TeachingMaths(){
      System.out.println("teacher 1 is Teaching maths");
  }
}
class Teacher2{
    void TeachingMaths(){
        System.out.println("teacher 1 is Teaching maths");
    }
}
class Students { //extends Teacher1, Teacher2{
    //Student cant learn from 2 teacher
    //in java also one class cant extends 2 or more class
    //this will cause error Class cannot extend multiple classes
}