package Ex_13_Functions;

public class Lab_123_User_Defined_One {
    public static void main(String[] args) {
        // Main used of function is create function's re-usability
        int r1 = Sum_of_two_Number(3,4);
        int r2 = Sum_of_two_Number(13,14);

        System.out.println(r1);
        System.out.println(r2);

    }


    static int Sum_of_two_Number(int a, int b){
        return a+b;

    }

}
