package SW.D2;
import java.util.Scanner;
public class D2_2001_DP {
    public static int N;
    public static int M;
    public static int[][] map;
    public static int[][] sumMap;

    public static int solution(int[][] map, int m) {
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                sumMap[i][j] = map[i - 1][j - 1] + sumMap[i - 1][j] + sumMap[i][j - 1] - sumMap[i - 1][j - 1];
            }
        }
        int maxSum = Integer.MIN_VALUE;

        for (int i = M; i <= N; i++) {
            for (int j = M; j <= N; j++) {
                int sum = sumMap[i][j] - sumMap[i][j - M] - sumMap[i - M][j] + sumMap[i - M][j - M];
                maxSum = Math.max(sum, maxSum);
            }
        }

        return maxSum;
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        for(int test_case = 1; test_case <= T; test_case++){
            N = sc.nextInt();
            M = sc.nextInt();
            map = new int[N][N];
            sumMap = new int[N+1][N+1];

            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            System.out.println("#" + test_case + " " + solution(map,M));

        }
    }
    }
