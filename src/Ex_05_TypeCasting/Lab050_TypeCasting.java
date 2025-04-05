package Ex_05_TypeCasting;

public class Lab050_TypeCasting {
    public static void main(String[] args) {
        long phon_no= 9876543210l;
       // short s= phon_no;
        short s=(short)phon_no;
        System.out.println(s);
    }
}
