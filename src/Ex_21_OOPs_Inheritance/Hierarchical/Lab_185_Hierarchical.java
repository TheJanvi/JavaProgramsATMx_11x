package Ex_21_OOPs_Inheritance.Hierarchical;

public class Lab_185_Hierarchical {
    public static void main(String[] args) {
        Father f1 =  new Father();
        Ruhani r1 = new Ruhani();

        r1.home();
        f1.home();

        Pramod p1 = new Pramod();
        p1.home();

        Lucky l1 = new Lucky();
        l1.l2();
        l1.home();

    }
}
class Father{
    void home(){
        System.out.println("3bhk");
    }
}
class Pramod extends Father {
    void h2() {
        System.out.println("H2 - PROMOD");
    }
}

    class Lucky extends Father {
        void l2() {
            System.out.println("Lucky");
        }
    }

        class Ruhani extends Father {
            void r2() {
                System.out.println("Ruhani");
            }
        }

