package algorithm.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class QueueEx3 {
    public static void main(String[] args) throws IOException {
        Deque<Integer> q  = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        for(int i = 1; i <= N; i++) {
            q.add(i);
        }


        StringBuilder st = new StringBuilder();
        st.append("<");

        while(!q.isEmpty()) {
            for(int i = 1; i < K; i++) {
                q.add(q.removeFirst());
            }
            st.append(q.removeFirst());
            if(!q.isEmpty()) {
                st.append(", ");
            }
        }

        System.out.println(st + ">");
    }
}
