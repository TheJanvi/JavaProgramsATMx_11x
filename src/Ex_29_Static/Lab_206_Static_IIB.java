package Ex_29_Static;

public class Lab_206_Static_IIB {
    public static void main(String[] args) {
        P p1 = new P();
        P p2 = new P();
        P p3 = new P();

        //IIB -> 3 -> Object
        //SIB -> 1 -> Class - one time you loaded the class, another time you can't
    }

}
class P{
    P(){
        System.out.println("DC");
    }
    {

        System.out.println("IIB");
    }
    static {
        System.out.println("SIB");
    }
}

