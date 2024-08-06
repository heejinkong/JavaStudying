package algorithm.week10;

import java.util.LinkedList;
import java.util.Queue;

public class 주식가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0 ; i < prices.length; i++) {
            queue.offer(prices[i]);
        }

        int idx = 0;
        while(!queue.isEmpty()) {
            int cur = queue.poll();
            int cnt = 0;

            for(int i = idx + 1; i < prices.length; i++) {
                cnt++;
                if(cur > prices[i]) {
                    break;
                }
            }

            answer[idx] = cnt;
            idx++;
        }

        return answer;
    }
}
