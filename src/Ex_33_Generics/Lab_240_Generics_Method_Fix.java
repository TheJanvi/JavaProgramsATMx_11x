package Ex_33_Generics;

public class Lab_240_Generics_Method_Fix {
    public static void main(String[] args) {


    temp_sum(3,4);
    temp_sum(3.14, 4.13);
    temp_sum("jennie", "gia");







    }

    static <G> G temp_sum(G a, G b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }

}
