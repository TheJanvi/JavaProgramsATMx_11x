package Ex_29_Static;

public class Lab_208_Static {
    public static void main(String[] args) {
        B.commonToAll();
        System.out.println(B.b);


        B b_ref = new B();
        b_ref.display();
        System.out.println(b_ref.a);
    }
}
class B{
    static {
        System.out.println("SIB, called once, class is loaded");
    }
    int a = 10;
    static int b = 10;

    void display(){
        System.out.println("Non static F(n)");

    }
    static  void commonToAll(){
//        System.out.println(a);//this is not possible , can use non-static in static function
        System.out.println("Static F(n)");
    }
//    static  class C{
//        //not usefully
//    }
}
