package Ex_34_Collection_Framework.MAP;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab_267_HashTable {
    public static void main(String[] args) {
        //Map - K, V , null values allows

        //Hashtable - Synchronised, Slow and legacy class - thread safe
        // T1, T2 - they will use one by one.

        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "one");
        hashtable.put(2, "two");
        hashtable.put(3, "three");
       // hashtable.put(4, null); //java.lang.NullPointerException
       // hashtable.put(null, "one");
        System.out.println(hashtable);

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, null);
        hashMap.put(3, null);
        hashMap.put(null, null);
        System.out.println(hashMap);

        System.out.println("-----");

        Enumeration<Integer> enumeration = hashtable.keys();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }








    }
}
