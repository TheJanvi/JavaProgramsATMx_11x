package Ex_04_Operators;

public class Lab035_Operator_Equal {
    public static void main(String[] args) {
        // == ? Compare the values
        System.out.println(10==10);
        System.out.println(10<10);
        System.out.println(10==20);
        System.out.println(10>=10);

        //! not
        System.out.println(!(10>20));

        //&& - AND
        System.out.println( true && true);
        System.out.println( true && false);
        System.out.println( false && true);
        System.out.println( false && false);

        //|| - OR
        System.out.println( true || true);
        System.out.println( true || false);
        System.out.println( false || true);
        System.out.println( false || false);
    }
}
