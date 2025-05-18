package Ex_32_Execption;

public class Lab_236_Throw {
    public static void main(String[] args) {

    }
    static void divideByZero(int a){
        //check some
        if (a == 0) {
            throw new ArithmeticException();
        }
    }
}
