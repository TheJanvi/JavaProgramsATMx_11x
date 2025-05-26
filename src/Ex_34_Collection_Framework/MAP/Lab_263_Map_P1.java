package Ex_34_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab_263_Map_P1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        //Map is key and value pair
        //name -> pramod
        map.put("Name", "Pramod");
        map.put("RollNo", 1);
        map.put("Phone", 987654321);
        System.out.println(map);

        Map map1 = new LinkedHashMap();
        map1.put("Name", "Pramod");
        map1.put("RollNo", 1);
        map1.put("Phone", 987654321);
        System.out.println(map1);

        Map map2 = new TreeMap();
        //Map is key - value
        //name: pramod,
        //roll no: 1,
        //phone: 987654321
        map2.put("FirstName", "Pramod");
        map2.put("LastName", "dutta");
        map2.put("RollNo", 1);
        map2.put("Phone", 987654321);
        System.out.println(map2);
    }
}
