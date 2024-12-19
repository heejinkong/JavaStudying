package algorithm.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueEx2 {
    public static void main(String[] args) throws IOException {
        Deque<Integer> queue = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            String word = br.readLine();
            if(word.startsWith("push")) {
                int num = Integer.parseInt(word.split(" ")[1]);
                queue.add(num);
            } else if(word.equals("pop")) {
                if(queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.removeFirst());
                }
            } else if (word.equals("size")) {
                System.out.println(queue.size());
            } else if (word.equals("empty")) {
                if(queue.isEmpty()) {
                    System.out.println(1);
                } else{
                    System.out.println(0);
                }
            } else if (word.equals("front")) {
                if(queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.peekFirst());
                }
            } else if (word.equals("back")) {
                if(queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.peekLast());
                }
            }
        }
    }
}
