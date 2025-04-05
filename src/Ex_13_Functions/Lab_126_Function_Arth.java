package Ex_13_Functions;

import java.util.Scanner;

public class Lab_126_Function_Arth {
    public static void main(String[] args) {
        //Create a function of sib, mul, div
        //with parameter, a, b (take parameter from the user)

        //logic building
        //Step - 1 -> inputs and outputs
        //a, b - int -> Scanner
        // int -> variable result ->


        //step 2 -rough logic -> create functions
        // functions-> type 4th - with return and with arguments/ parameters

        //Step 3 - write the code and find and fix -> edge class

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a Number 1:");
        int a = 0;
        if(scanner.hasNextInt()){
            a = scanner.nextInt();
        }else {
            System.out.println("Enter the Int only");
            System.exit(0);
        }


        System.out.println("Enter a Number 2:");
        int b = 0;
        if (scanner.hasNextInt()){
            scanner.nextInt();
        }else {
            System.out.println("Enter the Int only");
            System.exit(0);
        }

        int result_add = addition(a,b);
        System.out.println(result_add);

        int result_sub = Subtraction(a,b);
        System.out.println(result_sub);

        int result_mul = Multiplication(a,b);
        System.out.println(result_mul);

        int result_div = Division(a,b);
        System.out.println(result_div);

        int result_mod = Modulus(a,b);
        System.out.println(result_mod);

        scanner.close();
    }

    static int addition(int a, int b){
        return a + b;

    }

    static int Subtraction(int a , int b){
        return a - b;

    }

    static int Multiplication(int a , int b){
        return a * b;

    }

    static int Division(int a , int b){
        if (b == 0){
            System.out.println("Div by zero is not allowed");
            System.exit(0);
        }
        return a / b;

    }

    static int Modulus(int a , int b){
        return a % b;

    }

}
