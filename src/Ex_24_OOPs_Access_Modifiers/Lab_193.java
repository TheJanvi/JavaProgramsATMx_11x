package Ex_24_OOPs_Access_Modifiers;

public class Lab_193 {
    public static void main(String[] args) {

    }
}
class Father{
    private int gold = 10;
    protected int bhk3 = 10;
    int car = 1;

}
class Son extends Father{
    void getGold(){
//        System.out.println(gold);
        System.out.println(bhk3);
        System.out.println(car);

    }
}