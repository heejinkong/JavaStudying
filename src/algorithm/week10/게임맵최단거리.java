package algorithm.week10;

import java.util.ArrayDeque;
import java.util.Queue;

public class 게임맵최단거리 {
    public static int[] dx = {0,-1,0,1};
    public static int[] dy = {-1,0,1,0};
    public static boolean[][] visited;
    public static Queue<int[]> queue;

    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        System.out.println(solution(maps));
    }
    public static int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        queue = new ArrayDeque<>();
        visited = new boolean[n][m];

        queue.add(new int[] {0,0,1});
        visited[0][0] = true;

        while(!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            int dist = curr[2];

            if (x == n - 1 && y == m - 1) {
                return dist;
            }

            for(int i = 0; i < 4; i++) {
                int nX = x + dx[i];
                int nY = y + dy[i];

                if(nX >= 0 && nY >= 0 && nX < n && nY < m && maps[nX][nY] == 1) {
                    if(!visited[nX][nY]) {
                        visited[nX][nY] = true;
                        queue.add(new int[] {nX, nY, dist+1});
                    }
                }
            }

        }
        return -1;

    }
}