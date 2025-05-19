package Ex_33_Generics;

public class Lab_239_Generics {
    public static void main(String[] args) {


    temp_sum(3,4);
    temp_sum(3.14, 4.13);
    temp_sum("jennie", "gia");







    }

    static int temp_sum(int a, int b){
        return a+b;
    }
    static double temp_sum(double a, double b){
        return a+b;
    }
    static String temp_sum(String a, String b){
        return a+b;
    }

}
