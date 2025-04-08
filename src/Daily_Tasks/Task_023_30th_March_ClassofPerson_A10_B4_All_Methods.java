package Daily_Tasks;

public class Task_023_30th_March_ClassofPerson_A10_B4_All_Methods {
    public static void main(String[] args) {
        Person p1 = new Person();

        // Using Method 1: no parameters, no return type
        p1.introduce();

        // Using Method 2: no parameters, but returns a value
        String blood = p1.getBloodGroup();
        System.out.println("Blood Group: " + blood);

        // Using Method 3: parameters but no return
        p1.setDetails("JD", 21, true, "O+", "Black", "Brown", 34.0, 152, 50000.0);

        // Using Method 4: parameters and return value
        double yearlySalary = p1.calculateYearlySalary(50000.0);
        System.out.println("Yearly Salary: ₹" + yearlySalary);
    }
}
class Person{
    String Name;
    int Age;
    boolean isMale;
    String BloodGroup;
    String HairColor;
    String EyeColor;
    double weight;
    int height;
    double Salary;

    // Method Type 1: No parameters, no return
    void introduce() {
        System.out.println("Hi, I'm a person class object!");
    }

    // Method Type 2: No parameters, but returns a value
    String getBloodGroup() {
        return BloodGroup;
    }

    // Method Type 3: Parameters but no return value
    void setDetails(String name, int age, boolean male, String blood, String hair, String eyes, double wt, int ht, double sal) {
        Name = name;
        Age = age;
        isMale = male;
        BloodGroup = blood;
        HairColor = hair;
        EyeColor = eyes;
        weight = wt;
        height = ht;
        Salary = sal;

        System.out.println("Details set successfully.");
    }

    // Method Type 4: Parameters and return value
    double calculateYearlySalary(double monthlySalary) {
        return monthlySalary * 12;
    }
}

