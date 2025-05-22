package Ex_34_Collection_Framework.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab_245_AL {
    public static void main(String[] args) {
        List list = new ArrayList();
//        List list1 = new ArrayList(10);
        list.add("1");//0
        list.add("2");//1
        list.add("3");//2
        list.add("3");//3
        list.add(4);//4
        list.add(true);//5
        list.add("3");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));

        System.out.println(list.indexOf("3"));
        System.out.println(list.lastIndexOf("3"));

        System.out.println(list);

        System.out.println("---------");

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        list.clear();
        System.out.println(list);

    }
}
