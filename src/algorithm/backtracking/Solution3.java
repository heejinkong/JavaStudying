package algorithm.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Solution3 {
    private static boolean[] visited;
    private static List<String> set;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        visited = new boolean[N];
        set = new ArrayList<>();
        dfs(N,M,0,"");
        System.out.println(set);
    }
    public static void dfs(int N, int M, int depth,String str){
        //basecase
        if(depth == M) {
            set.add(str.trim());
        }
        //recursive call
        for(int i = 1; i <= N; i++) {
            if(!visited[i-1]){
                visited[i-1] = true;
                dfs(N,M,depth+1, str+ " "+i );

                visited[i-1] =false;
            }
        }
    }
}
