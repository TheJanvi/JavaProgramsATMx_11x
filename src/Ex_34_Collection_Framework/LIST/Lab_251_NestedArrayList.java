package Ex_34_Collection_Framework.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab_251_NestedArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("orange");
        list.add("apple");
        list.add("jerry");
//        list.add(1233);
        System.out.println(list);

        List list1 = new ArrayList();
        list1.add("Mango");
        list1.add("grapes");
        list1.add("papaya");
        System.out.println(list1);

        List list2 = new ArrayList();
        list2.add("Tomatoes");
        list2.add("potatoes");
        list2.add("onion");
        System.out.println(list2);

        List all_list = new ArrayList();
        all_list.add(list);
        all_list.add(list1);
        all_list.add(list2);
        System.out.println(all_list);
        System.out.println(all_list.get(2));




    }
}
