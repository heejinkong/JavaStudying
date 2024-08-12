package algorithm.HS.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_개똥벌레 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] bottom = new int[M + 1];
        int[] top = new int[M + 1];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            if(i % 2 == 0) {
                bottom[Integer.parseInt(st.nextToken())] ++;
            } else {
                top[Integer.parseInt(st.nextToken())] ++;
            }
        }

        for(int i = M -1; i >= 1; i--) {
            bottom[i] += bottom[i+1];
            top[i] += top[i+1];
        }

        int min = Integer.MAX_VALUE;
        int cnt = 0;

        for(int i = 1; i <= M; i++) {
            int num = bottom[i] + top[M - i + 1];
            if(num < min) {
                min = num;
                cnt = 1;
            } else if(num == min) {
                cnt++;
            }
        }
        System.out.println(min + " " + cnt);
    }
}
