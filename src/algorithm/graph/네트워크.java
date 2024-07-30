package algorithm.graph;

public class 네트워크 {
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(Solution(n,computers));
    }
    public static int Solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {   // 방문하지 않은 컴퓨터라면
                dfs(i, n, computers, visited); // dfs 탐색
                answer++;
            }
        }
        return answer;
    }

    public static void dfs(int cur, int n, int[][] computers, boolean[] visited) {
        visited[cur] = true;

        for(int i = 0; i < n; i++) {
            if(computers[cur][i] == 1) { // 연결되어 있고 방문하지 않았다면
                if(!visited[i]) {
                    dfs(i,n,computers,visited); // 재귀
                }
            }
        }
    }
}
