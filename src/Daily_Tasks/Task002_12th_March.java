package Daily_Tasks;

public class Task002_12th_March {
    public static void main(String[] args) {
        double x =1;
        double y = 2;
        double z=-3;

        double result=Math.cbrt(Math.pow(x,2)+ Math.pow(y,2)- Math.abs(z));
        System.out.println("Result: "+result);
    }
}
