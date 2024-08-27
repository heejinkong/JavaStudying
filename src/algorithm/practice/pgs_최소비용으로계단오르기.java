package algorithm.practice;

import java.util.Arrays;

public class pgs_최소비용으로계단오르기 {
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        System.out.println(solution(cost));
    }

    //1️⃣ 0번 인덱스, 1번 인덱스에서 시작 가능 → dp 0
    //
    //2️⃣ 0번 계단부터 한 계단, 두 계단 이동해보면서
    // (현 계단까지 오는데 필요했던 비용(dp[i])) + (현 계단에서 다음 계단까지 가는데 필요한 비용(cost[i]))을
    // 계산해 다음 계단까지 가는 데 필요한 비용(dp[i + 1], dp[i + 2])의 최솟값 갱신
    public static int solution(int[] cost) {
        int answer = 0;
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }

        answer = Math.min(dp[n - 1], dp[n - 2]);
        return answer;
    }
}
