package algorithm.HS.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_3020 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());  // 장애물 개수
        int M = Integer.parseInt(st.nextToken());  // 동굴의 높이

        int[] bottom = new int[M + 1];
        int[] top = new int[M + 1];

        // 장애물 높이 입력 받기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            int height = Integer.parseInt(st.nextToken());

            if (i % 2 == 0) {
                bottom[height]++;
            } else {
                top[height]++;
            }
        }

        // 누적합 계산
        for (int i = M - 1; i >= 1; i--) {
            bottom[i] += bottom[i + 1];
            top[i] += top[i + 1];
        }

        int min = Integer.MAX_VALUE;
        int cnt = 0;

        // 최소 장애물 개수와 해당 높이 개수 찾기
        for (int i = 1; i <= M; i++) {
            int foo = bottom[i] + top[M - i + 1];
            if (foo < min) {
                min = foo;
                cnt = 1;
            } else if (foo == min) {
                cnt++;
            }
        }

        System.out.println(min + " " + cnt);
    }
}
