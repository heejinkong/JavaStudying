package SW.D2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_1959 {
    static int N, M;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int caseNum = Integer.parseInt(br.readLine());

        for(int i = 1; i <= caseNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            int[] arr1 = new int[N];
            int[] arr2 = new int[M];

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                arr1[j] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for(int k = 0; k < M; k++) {
                arr2[k] = Integer.parseInt(st.nextToken());
            }

            int answer = Integer.MIN_VALUE;

            for(int j = 0; j <= Math.abs(N - M); j++) {
                int sum = 0;
                if (N > M) {
                    for (int k = 0; k < M; k++) {
                        sum += arr1[j + k] * arr2[k];
                    }
                } else { // arr2가 더 길거나 같을 경우
                    for (int k = 0; k < N; k++) {
                        sum += arr1[k] * arr2[j + k];
                    }
                }
                answer = Math.max(answer, sum);  
            }
            System.out.println("#" + i + " " + answer);

        }
    }
}
