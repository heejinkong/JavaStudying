package algorithm.practice;

import java.util.Arrays;

public class pgs_동전교환 {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(solution(coins, amount));
    }

    // 11원 => 10원 만드는 방법 + 1 || 9원 만드는 방법 + 1 || 6원 만드는 방법 + 1 중 최솟값
    // dp는 최소 동전 수와 dp[i-coin] + 1(이전 값 + 동전 하나 더) 중 작은 값으로 갱신
    public static int solution(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}
