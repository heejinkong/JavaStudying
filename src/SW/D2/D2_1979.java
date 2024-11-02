package SW.D2;

import java.util.Scanner;

public class D2_1979 {
    public static int N;
    public static int K;
    public static int[][] map;
    public static int cnt;
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            N = sc.nextInt();
            K = sc.nextInt();
            map = new int[N][N];
            cnt = 0;

            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            for(int i = 0; i < N; i++) {
                int temp = 0;
                for(int j = 0; j < N; j++) {
                    if(map[i][j] == 0) {
                        if(temp == K) {
                            cnt++;
                        }
                        temp = 0;
                    } else {
                        temp++;
                    }
                }
                if(temp == K) {
                    cnt++;
                }
            }

            for(int i = 0; i < N; i++) {
                int temp = 0;
                for(int j = 0; j < N; j++) {
                    if(map[j][i] == 0) {
                        if(temp == K) {
                            cnt++;
                        }
                        temp = 0;
                    } else {
                        temp++;
                    }
                }
                if(temp == K) {
                    cnt++;
                }
            }
            System.out.println("#" + test_case + " " + cnt);
        }
    }
}