package SW.D2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_2005 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 수 읽기
        int caseNum = Integer.parseInt(br.readLine().trim());

        for (int i = 1; i <= caseNum; i++) {
            // 각 테스트 케이스의 N 값 읽기
            int N = Integer.parseInt(br.readLine().trim());
            int[][] map = new int[N][N];

            // 파스칼 삼각형 생성
            for (int j = 0; j < N; j++) {
                for (int k = 0; k <= j; k++) {
                    if (j == k || k == 0) { // 양 끝값은 1
                        map[j][k] = 1;
                    } else { // 내부 값은 위의 두 값의 합
                        map[j][k] = map[j - 1][k - 1] + map[j - 1][k];
                    }
                }
            }

            // 결과 출력
            System.out.println("#" + i);
            for (int j = 0; j < N; j++) {
                for (int k = 0; k <= j; k++) {
                    System.out.print(map[j][k] + " ");
                }
                System.out.println(); // 줄 바꿈
            }
        }
    }
}
