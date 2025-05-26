package Ex_34_Collection_Framework.MAP;

import java.util.*;

public class Lab_265_Real_Example {
    public static void main(String[] args) {
        Map<String, Object> student1 = new HashMap<>();
        student1.put("name", "Diwakar");
        student1.put("phone", "985634193");
        student1.put("address", "Banglore");
        student1.put("address", 123);


        System.out.println(student1);

        Map<String, Object> student2 = new HashMap<>();
        student2.put("name", "Lucky");
        student2.put("phone", "764792340");
        student2.put("address", "Pune");
        student2.put("address", 345);

        List students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        System.out.println(students);

        System.out.println(student1);

        Set book_read_items = new HashSet();
        book_read_items.add("rich dad poor dad");
        book_read_items.add("sapaiens");
        book_read_items.add("secret");
        book_read_items.add("atomic habit");
        book_read_items.add("atomic habit");
        book_read_items.add("eat the frog");
    }

}
