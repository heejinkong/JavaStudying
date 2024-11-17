package SW.D3;

import java.util.*;
import java.io.*;

public class D3_1860 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < testCase; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr); // 도착 시간 정렬

            boolean possible = true;
            int fish = 0; // 현재 붕어빵 개수
            int idx = 0; // 처리한 사람 수
            int lastTime = arr[N - 1];

            if (arr[0] == 0) { // 처음에 붕어빵을 받을 수 없으면 불가능
                possible = false;
            } else {
                for (int i = 1; i <= lastTime; i++) {
                    if (i % M == 0) fish += K; // M초마다 K개 생성
                    if (idx < N && i == arr[idx]) { // i초에 사람이 도착
                        fish--; // 붕어빵 제공
                        if (fish < 0) { // 붕어빵 부족
                            possible = false;
                            break;
                        }
                        idx++;
                    }
                }
            }

            String result = possible ? "Possible" : "Impossible";
            sb.append("#").append(t + 1).append(" ").append(result).append("\n");
        }

        System.out.print(sb);
    }
}
