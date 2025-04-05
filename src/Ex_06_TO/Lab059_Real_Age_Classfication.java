package Ex_06_TO;

public class Lab059_Real_Age_Classfication {
    public static void main(String[] args) {
        //age = 23 -> adult (age >18), minor(age <18), seniur(age >65)
        //input from user

        String age1= args[0];
        System.out.println(age1);
        System.out.println(age1 instanceof String);

        int age = Integer.parseInt(age1);
    }
}
