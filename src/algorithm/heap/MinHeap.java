package algorithm.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class MinHeap {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<Integer>();

        //enqueue
        pq.add(3);
        pq.add(1);
        pq.add(8);

        //dequeue
        while(!pq.isEmpty()) {
            Integer value = pq.remove();
            System.out.println(value);
        }
    }
}
