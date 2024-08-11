package algorithm.HS.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_개똥벌레 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] bottom = new int[M + 1]; // 아래에서 자라는 돌
        int[] top = new int[M + 1]; // 위에서 자라는 돌

        for (int i = 0; i < N; i++) {
            int h = Integer.parseInt(br.readLine().trim());
            if (i % 2 == 0) {
                bottom[h]++;
            } else {
                top[h]++;
            }
        }

        // 누적합 계산
        for (int i = M - 1; i >= 1; i--) {
            bottom[i] += bottom[i + 1];
            top[i] += top[i + 1];
        }

        int min = Integer.MAX_VALUE;
        int cnt = 0;

        // 최소 장애물 수와 그 빈도 계산
        for (int i = 1; i <= M; i++) {
            int num = bottom[i] + top[M - i + 1];
            if (num < min) {
                min = num; // min 값을 업데이트
                cnt = 1;
            } else if (num == min) {
                cnt++;
            }
        }

        System.out.println(min + " " + cnt);
    }
}
