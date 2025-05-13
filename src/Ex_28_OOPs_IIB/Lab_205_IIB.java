package Ex_28_OOPs_IIB;

public class Lab_205_IIB {
    //IIB
    //instance initialization block == IIB
    //I will be executed when object is created.


    public static void main(String[] args) {
        A1 a ;
        new A1();

    }

}

class A1{
    A1(){
        System.out.println("DC");
    }
    {
        System.out.println("Hi, IIB");
        System.out.println("If you want to execute or call something when object is created.");
        //mysql connection
        //read a csv, xlsx file
        //read json, xml
        //read a text file or env file
    }
    {
        System.out.println("Hi, i am IIB 2");
    }
    {
        System.out.println("Hi, i am IIB 3");
    }
}
