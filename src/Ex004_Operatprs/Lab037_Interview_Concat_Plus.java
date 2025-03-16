package Ex004_Operatprs;

public class Lab037_Interview_Concat_Plus {
    public static void main(String[] args) {
        //Concatination
        //System.out.println("Jennie"+"Gia");

        int a = 10;
        int b = 20;
        System.out.println(a+b);

        String Name1="Jennie";
        String Name2="Gia";
        System.out.println(Name1+Name2);

        // + -> Behave differently with the data type
        // + -> operator overloading
        System.out.println(Name1+Name2+a+b);//first operator - + performed as concatenation
        System.out.println(a+b+Name1+Name2);

        System.out.println(Name1+Name2+(a+b));
    }
}
