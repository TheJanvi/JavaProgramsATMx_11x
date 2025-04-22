package Ex_19_OOPs_Constructor;

public class Lab_169_OOPs_Constructor {
    public static void main(String[] args) {
        baby b1 = new baby();
        new baby();
        baby b2;


    }

}
class baby{
    //Attributes
    String name;



    //Behaviour
    void cry(){
        System.out.println("cry");
    }
    void sleep(){
        System.out.println("sleep");
    }
    void eat(){
        System.out.println("eat");
    }
    //Default constructor
    baby(){
        System.out.println("i am called, default constructor!");
        //Fetch data from the MySQL database..
        // Read from CSV file, XLSX
        //Open a file and read the data. (json, testdata.xlsx, tx file)
    }

}
