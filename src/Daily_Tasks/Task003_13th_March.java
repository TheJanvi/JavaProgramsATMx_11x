package Daily_Tasks;
import java.util.Scanner;

public class Task003_13th_March {
    public static void main(String[] args) {
        //Grade Calculator
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Score: ");
        int Score = scanner.nextInt();

        String Grade = (Score >= 90) ? "A" :
                (Score >= 80) ? "B" :
                        (Score >= 70) ? "C" :
                                (Score >= 60) ? "D" : "F";

        System.out.println("Your Grade is\t"+Grade);
    }
}
