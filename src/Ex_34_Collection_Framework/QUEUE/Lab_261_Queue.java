package Ex_34_Collection_Framework.QUEUE;

import java.util.PriorityQueue;

public class Lab_261_Queue {
    public static void main(String[] args) {
        //Queue -> 0.001% in automation
        PriorityQueue queue = new PriorityQueue();
        queue.add("Pramod");
        queue.add("Dutta");
        //PQ -> Natural - Sorting
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
