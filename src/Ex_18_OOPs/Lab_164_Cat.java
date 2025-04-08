package Ex_18_OOPs;

public class Lab_164_Cat {
    public static void main(String[] args) {
        cat c1 = new cat();
        cat c2 ;
        new cat();

        c1.running();
        //c2.running();

        new cat().running();
        System.out.println(new cat().name);

    }
}
class cat{
    String name;
    void running(){
        System.out.println("Running");
    }
}
