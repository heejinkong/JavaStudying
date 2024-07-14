package algorithm.backtracking;

import java.util.HashSet;
import java.util.Scanner;

public class Solution2 {
   static int[] arr;
   static boolean[] visit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //4
        int M = sc.nextInt(); //2

        arr = new int[M];
        visit = new boolean[N];
        dfs(N,M,0);
    }
    public static void dfs(int N, int M, int depth) {
        //basecase
        if(depth == M) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        //recursive call
        for(int i = 0; i < N; i++) {
            if(!visit[i]) {
                arr[depth] = i + 1;
                dfs(N,M,depth+1);

                visit[i] = false;
            }
        }
    }
}
