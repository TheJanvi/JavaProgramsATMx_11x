package Ex_34_Collection_Framework.LIST;

import java.util.Stack;

public class Lab_254_Stack
{
    public static void main(String[] args) {
        //stack
        //Last in -> First out (LIFO)

        Stack s = new Stack();

        s. push(  "Pramod" );
        s. push(  "Dutta");
        s. push(  "Amit");
        s. push ( "Amit2");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s);
        System.out.println(s);
        s.add("Chetan");
        s.add("Chetan");
        s.push("Vijay");
        System.out.println(s);


    }
}
