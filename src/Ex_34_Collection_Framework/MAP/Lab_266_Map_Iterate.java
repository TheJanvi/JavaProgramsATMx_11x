package Ex_34_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab_266_Map_Iterate {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("id", 1);
        map.put("id2", 2);
        map.put("id3", 34);
        map.put("i4", null);
        map.put("id5", 100);


        for (Map.Entry<String, Integer> item: map.entrySet()){
            System.out.println(item.getKey() + "->" + item.getValue());
        }




    }
}
