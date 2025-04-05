package Ex_08_if_Condition;

public class Lab071_If_P1
{
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age > 18 ){
            System.out.println("Yes, You can go to Goa!");
        }else{
            System.out.println("You Can't go to Goa!!");
        }
    }
}
