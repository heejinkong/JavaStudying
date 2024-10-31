package SW.D2;
import java.util.Scanner;
import java.io.FileInputStream;

public class D2_2001 {
    public static int[][] map;
    public static int N;
    public static int M;

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();


        for (int test_case = 1; test_case <= T; test_case++) {
            N = sc.nextInt();
            M = sc.nextInt();
            map = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            int max = 0;
            for (int i = 0; i < N - M + 1; i++) {
                for (int j = 0; j < N - M + 1; j++) {
                    int sum = 0;
                    for (int k = 0; k < M; k++) {
                        for (int p = 0; p < M; p++) {
                            sum += map[i + k][j + p];
                        }
                    }
                    if (max < sum) {
                        max = sum;
                    }
                }
            }
            System.out.println("#" + test_case + " " + max);
        }
        }
    }
