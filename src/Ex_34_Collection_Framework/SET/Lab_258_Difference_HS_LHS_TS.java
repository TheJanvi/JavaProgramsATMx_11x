package Ex_34_Collection_Framework.SET;

import java.util.*;


public class Lab_258_Difference_HS_LHS_TS
{
    public static void main(String[] args) {
        Set<String> hs = new HashSet();
        //Hashing mechanism to store the element
        //no order
        //no duplicates

        hs.add("apple");
        hs.add("orange");
        hs.add("watermelon");
        hs.add("watermelon");
//        hs.add(123);
        hs.add(null);
        System.out.println(hs);
        System.out.println("-----------");

        for (String s:hs){
            System.out.println(s);
        }

        //Iterator
        Iterator iterator = hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-------------------------------");

        Set lhs = new LinkedHashSet();
        //LinkedList Mechanism to store the element,
        //order will maintain, no duplicates

        lhs.add("dapple");
        lhs.add("apple");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("apple"));
        System.out.println(lhs.size());

        System.out.println("-------------------------------");

        Set ts = new TreeSet();
        //Black and red mechanism to store the element.
        //Order will maintain, natural sorting is done.

        ts.add("dapple");
        ts.add("Apple");
        ts.add("orange");
        ts.add("watermelon");
//        ts.add("");
//        ts.add(123);java.lang.ClassCastException
//        ts.add(null);
        System.out.println(ts);

        System.out.println("----------For Each------------");

        for (Object o:ts){
            System.out.println(o);
        }






    }
}
