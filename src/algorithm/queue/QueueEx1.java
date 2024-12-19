package algorithm.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueEx1 {
    public static void main(String[] args) {
        Deque<Integer> s = new ArrayDeque<>();
        Deque<Integer> d = new ArrayDeque<>();

        s.push(1);
        s.push(2);
        s.push(3);

        d.addFirst(1); //1
        d.addFirst(2); //2 1
        d.addLast(3); // 2 1 3
        d.addLast(4); // 2 1 3 4

        System.out.println(s.pop());
        System.out.println(d);
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());

        d.removeFirst();
        System.out.println(d);
        d.removeLast();
        System.out.println(d);
    }
}
