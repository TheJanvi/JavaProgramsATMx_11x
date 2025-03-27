package Daily_Tasks;

import java.util.Scanner;

public class Task009_14th_March_Triangle_Classifier {
    //Triangle Classifier:
    //Write a Program that Classifies a triangle Based on its Side Lengths,
    //Given three input values representing the lengths of the sides,
    //determine if the triangle is
    // (acute triangle) equilateral (All sides are equal),
    //isosceles (exactly two sides are equal),
    //or scalene (no sides are equal).

    //Use an if-else statement to classify the triangle.
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Length of First Side of Triangle");
        int side1 = Sc.nextInt();
        System.out.println("Enter the Length of Second Side of Triangle");
        int side2 = Sc.nextInt();
        System.out.println("Enter the Length of Third Side of Triangle");
        int side3 = Sc.nextInt();

        if (side1 <= 0 || side2 <= 0 || side3 <= 0){
            System.out.println("This is not triangle");
            System.exit(0);
        }
        if (side1 + side2 <= side3 || side2 +  side3 <= side1  || side1 + side3 <= side2 ){
            System.out.println("This is not a triangle");
            System.exit(0);
        }


        if (side1 == side2 && side2 == side3){
            System.out.println("Triangle is Acute(Equilateral)");
        } else if (side1 == side2 || side1== side3 || side2 == side3) {
            System.out.println("Triangle is Isosceles");
        }
        else {
            System.out.println("Triangle is Scalene");
            System.exit(0);
        }

        Sc.close();
    }

}
