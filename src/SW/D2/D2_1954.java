package SW.D2;

import java.util.Scanner;

public class D2_1954 {
    public static int[] dx = {0,1,0,-1};
    public static int[] dy = {1,0,-1,0};
    public static int nums[][];
    public static int N;

    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            N = sc.nextInt();
            nums = new int[N][N];

            dfs(0,0,1,0);

            System.out.println("#" + test_case);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(nums[i][j] + " ");
                }
                System.out.println();
            }

        }
    }

    public static void dfs(int x, int y, int num, int curr) {
        nums[x][y] = num;

        if(num == N*N) return;


        int nx = x + dx[curr];
        int ny = y + dy[curr];

        if(nx < 0 || ny < 0 || nx >= N || ny >= N || nums[nx][ny] != 0) {
            curr = (curr + 1) % 4;
            nx = x + dx[curr];
            ny = y + dy[curr];
        }

        dfs(nx, ny, num + 1, curr);
    }
}