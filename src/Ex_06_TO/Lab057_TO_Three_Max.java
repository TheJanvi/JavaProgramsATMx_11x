package Ex_06_TO;

public class
Lab057_TO_Three_Max {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        //logic building formula

        //step 1: find input/outputs
        //I/0 -> n1,n2,n3 - int
        //o/p -> String -> max number

        //step 2 = rough logic , think about it.
        //n1 > n2 and n1 > n3 - > n1
        //n2 > m3 amd n2 > n1 -> n2
        //n3 -

    int max = (n1>n2) ? (n1 > n3) ? n1 : n3 : ((n2 >n3)? n2 : n3);
        System.out.println("Max is "+ max);
        //A -> (n1 > n3) ? n1 : n3


    }
}
