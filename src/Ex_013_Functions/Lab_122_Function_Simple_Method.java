package Ex_013_Functions;

public class Lab_122_Function_Simple_Method {
    public static void main(String[] args) {

        //int result = jennie_f1();
        int result = return_int();
        System.out.println(result);

        boolean b = return_Boolean();
        System.out.println(b);

        float f1 = return_Float();
        System.out.println(f1);

        byte b1 = return_Byte();
        System.out.println(b1);

        long l1 = return_Long();
        System.out.println(l1);

        short s1 = return_Short();
        System.out.println(s1);

        String S1 = return_String();
        System.out.println(S1);

    }
//    static returnDataType( void, another dataType){
//        //void - no return
//    }

    static void f1(){
        System.out.println("No return");
    }
    static int return_int (){
        return 10;
    }

    static boolean return_Boolean(){
      return true;
    }

    static  float return_Float(){
        return 3.14f;
    }

    static byte return_Byte(){
        return 100;
    }

    static long return_Long(){
        return 900009000000L;
    }

    static short return_Short(){
        return 8;
    }

    static String return_String(){
        return "Jennie";
    }
}

