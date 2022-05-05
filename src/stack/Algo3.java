package stack;

import java.util.PriorityQueue;

public class Algo3 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            return o2 - o1;
        });
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(1);
        pq.add(3);
        pq.add(2);
        pq.add(1);
        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
            System.out.println(priorityQueue.poll());
        }
    }
}
