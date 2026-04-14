import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        // ---------------- PriorityQueue ----------------
        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("PriorityQueue: " + pq);
        System.out.println("Peek: " + pq.peek());
        pq.poll();
        System.out.println("After poll: " + pq);


        // ---------------- ArrayDeque ----------------
        Queue<Integer> dq = new ArrayDeque<>();

        dq.add(30);
        dq.add(10);
        dq.add(20);

        System.out.println("\nArrayDeque: " + dq);
        System.out.println("Peek: " + dq.peek());
        dq.poll();
        System.out.println("After poll: " + dq);


        // ---------------- LinkedList as Queue ----------------
        Queue<Integer> ll = new LinkedList<>();

        ll.add(30);
        ll.add(10);
        ll.add(20);

        System.out.println("\nLinkedList Queue: " + ll);
        System.out.println("Peek: " + ll.peek());
        ll.poll();
        System.out.println("After poll: " + ll);
    }
}

