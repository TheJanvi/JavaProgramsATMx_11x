package Ex_34_Collection_Framework.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_257_Set_P1 {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Promod");
        hs.add("Promod");
        hs.add("Dutta");
        System.out.println(hs);

    }
}
