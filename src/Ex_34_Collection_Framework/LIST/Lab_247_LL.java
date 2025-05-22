package Ex_34_Collection_Framework.LIST;

import java.util.LinkedList;

public class Lab_247_LL {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList();

        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        animals.addLast("Elephant");
        System.out.println("LinkedList: " + animals);

        //accessing elements
        System.out.println("First Element: " + animals.getFirst());
        System.out.println("Last Element: " + animals.getLast());

        //removing elements
        animals.removeFirst();
        animals.removeLast();
        System.out.println("LinkedList after removal: " + animals);

        System.out.println("Size of LinkedList: " + animals.size());
    }
}
