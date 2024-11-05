package SW.D2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class D2_1983 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int caseNum = Integer.parseInt(br.readLine());

        for (int i = 1; i <= caseNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
            Double[] score = new Double[N];
            double targetScore = 0.0;

            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());

                int mScore = Integer.parseInt(st.nextToken());
                int fScore = Integer.parseInt(st.nextToken());
                int hScore = Integer.parseInt(st.nextToken());

                score[j] = mScore * 0.35 + fScore * 0.45 + hScore * 0.20;

                if (j + 1 == K) {
                    targetScore = score[j];
                }
            }

            Arrays.sort(score, Collections.reverseOrder());

            int index = 0;

            for (int j = 0; j < score.length; j++) {
                if (score[j].equals(targetScore)) {
                    index = j;
                    break;
                }
            }

            index = index / (N / 10);

            sb.append("#" + i + " " + grade[index] + "\n");
        }
        System.out.print(sb);
    }
}
