package Ex_34_Collection_Framework.LIST;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab_252_IQ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(91);
        list.add(95);
        list.add(56);
        list.add(89);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);



    }
}
