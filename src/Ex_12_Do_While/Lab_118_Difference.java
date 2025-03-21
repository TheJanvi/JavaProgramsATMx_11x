package Ex_12_Do_While;

public class Lab_118_Difference {
    public static void main(String[] args) {
        int a = 0;
//        while (a < 0){
//            System.out.println(a);
//            a++;
//        }
        do {
            System.out.println(a);
            a++;
        }
        while (a < 0 );
        //Even though condition is false it will execute once.

    }
}
