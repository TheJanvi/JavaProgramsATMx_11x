package Ex_34_Collection_Framework.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab_243_LIST_Interface {
    public static void main(String[] args) {
//        List fruits = new List(); //Not possible
        List fruits = List.of("Orange", "Apple", "Banana", "Mango","watermelon");
        System.out.println(fruits);
//        fruits.add("chiku");//staic function cannot be changed. //java.lang.UnsupportedOperationException
//        fruits.remove("apple");//not possible


        List L = new ArrayList();//Dynamic Dispatch
        L.add("hello");
        L.add(123);
        L.add(true);
        L.add("Blah blah!");








    }

}
