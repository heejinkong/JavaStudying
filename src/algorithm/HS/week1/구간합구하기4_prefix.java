package algorithm.HS.week1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합구하기4_prefix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        int[] dp = new int[arr.length];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++ ) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i<=N; i++) {
            dp[i] = dp[i-1] + arr[i];
        }


        for(int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int sum =  dp[end] - dp[start-1];
            System.out.println(sum);
        }

    }
}
