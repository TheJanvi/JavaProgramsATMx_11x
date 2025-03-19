package Ex_09_Switch;

public class Lab084_JDK13 {
    public static void main(String[] args) {
        int itemCode = 006;

        switch(itemCode){
            case 001,002,005:
                System.out.println("All them are electronic gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mrch");
                break;
            default:
                System.out.println("None");
        }
    }
}
