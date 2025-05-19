package Ex_34_Collection_Framework.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab_244_ArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("pramod");
        arrayList.add(null);
        arrayList.add("dutta");//Duplicate is alloweed.
        arrayList.add("dutta");
        arrayList.add(123);//Different data type is allowed.
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List L = new ArrayList();//Dynamic Dispatch
        L.add("890");
        L.add(123);
        System.out.println(L);
        System.out.println(L.isEmpty());

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());









    }

}
