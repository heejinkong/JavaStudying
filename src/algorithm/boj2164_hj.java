package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class boj2164_hj {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            queue.offer(i + 1); // 1 2 3 4 5 6
        }

        while (queue.size() > 1) {
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.println(queue.poll());

    }

}

