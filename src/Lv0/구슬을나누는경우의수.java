package Lv0;

public class 구슬을나누는경우의수 {
    static boolean[] visited;
    static int answer;

    public static void main(String[] args) {
        int balls = 3;
        int share = 2;
        System.out.println(solution(balls, share));
    }

    public static int solution(int balls, int share) {
        visited = new boolean[balls];
        answer = 0;

        backtrack(balls, share, 0, 0);

        return answer;
    }

    public static void backtrack(int balls, int share, int start, int depth) {
        if (depth == share) {
            answer++;
            return;
        }

        for (int i = start; i < balls; i++) {
            if (!visited[i]) {
                visited[i] = true;
                backtrack(balls, share, i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }
}
