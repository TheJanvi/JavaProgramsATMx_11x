package Ex_06_TO;

public class Lab055_Interview_Ready_Question {
    public static void main(String[] args) {
        //nested ternary
        //result = condition1 ? expression1 : (condition? expression2 : expression)

        int number = 15;
        String result = (number > 10) ?  (number > 20 ? "N>20":"N<20"): "B" ;
        System.out.println(result);
    }
}
