package Daily_Tasks;

public class Task029_4th_April_MethodOverLoading_MethodOverRiding {
    public static void main(String[] args) {
        Method_Overloading methodOverloading = new Method_Overloading();
        methodOverloading.Method(3);
        methodOverloading.Overloading(23, 34, 45);

        OverRiding overRiding =  new OverRiding();
        overRiding.Overloading(23, 34 , 45);
    }


}
//MethodOverloading
class Method_Overloading{
    void Method(int a ){
        System.out.println(a);
    }
    void Overloading (int a, int b, int c ){
        System.out.println("Original Sum: " + (a+b+c));
    }
}
//Method Overriding
class OverRiding extends Method_Overloading{
@Override
    void Overloading (int a, int b, int c ){
        System.out.println("OverRidden Sum: " + (a+b+c));
    }
}

