import java.util.*;

public class Queue {
    public static void main(String[] args) {
        // This Will Return First Smallest or Biggest number based On the Initialization
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // pq.add(10);
        // pq.add(20);
        // pq.add(30);
        // pq.add(40);
        // pq.add(50);
        // pq.add(60);
        // pq.add(70);
        // pq.add(80);
        // // this will insert number and give true or false(Boolean);
        // System.out.println(pq.offer(100));

        // System.out.println(pq.poll());
        // pq.peek();
        // System.out.println(pq);

        // it implements the Queue Interface but PriorityQueue don't follows FIFO
        // principle
        // here Dequeue is Interface and ArrayDeque is class
        Deque<Integer> dq = new ArrayDeque<>();
        // dq.add(1);
        // dq.add(2);
        // dq.add(3);
        // System.out.println(dq);
        // dq.offerFirst(8);

        // dq.offerLast(31);
        // System.out.println(dq);

        // Inspecting
        System.out.println(dq);
        System.out.println(dq.pollLast());
    }
}
