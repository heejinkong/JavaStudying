package algorithm.Recursion;

public class pgs12945 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;
        // 0 1 1 2 3
        for(int i = 3; i <= n; i++) {
            dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
        }
        int answer = dp[n];

        return answer;
    }


}
