package Ex_013_Functions;

public class Lab_124_User_Defined_OneP1 {
    public static void main(String[] args) {
        //1. Without parameters and without Return Type
        wp_wr_greet();

        //2. Without parameters but with return type
        String msg = greet_with_hello_wp_with_RT();
        System.out.println(msg);

        //3.With Parameters and With Return Type(90%)
        greet_with_details("jennie", 21, 100);

        //4. with Parameters and with return type
        int sum1 = sum_of_two_numbers(13, 14);
        System.out.println(sum1);

    }


    //1. Without parameters and without Return Type
    static void wp_wr_greet(){
        System.out.println("How are you?");
    }

    //2. Without parameters but with return type

    static String greet_with_hello_wp_with_RT(){
        System.out.println("Hi");
        return "Hi, How are you?";
    }

    //3.With Parameters and Without Return Type(90%)
    static void greet_with_details(String name , int age, double salary){
        System.out.println("Hi, Your name -> " + name + "\nYour age is ->" +age+ "\nYour Salary ->" + salary);

    }

    //4. with Parameters and with return type
    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }



}
