package algorithm.practice;

public class pgs_네트워트 {
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(solution(n, computers));
    }

    public static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(i, n , computers, visited);
                answer++;
            }
        }
        return answer;

    }

    public static void dfs(int cur, int n, int[][] computers, boolean[] visited) {
        visited[cur] =true;

        for(int i = 0; i < n; i++) {
            if(computers[cur][i] == 1) {
                if(!visited[i]) {
                    dfs(i, n , computers, visited);
                }
            }
        }
    }
}
