package algorithm.week10;

public class 타켓넘버 {
    static int answer = 0;
    static boolean[] visited;
    static int[] booho = {-1,1};

    public int solution(int[] numbers, int target) {

        visited = new boolean[numbers.length];

        dfs(numbers, target, 0 , 0);

        return answer;
    }
    public static void dfs(int[] numbers, int target, int cur, int depth) {
        //basecase
        if(depth == numbers.length) {
            if(cur == target) {
                answer++;
                return;
            } else {
                return;
            }
        }

        //recursive call
        for(int i = 0; i < booho.length; i++) {
            if(!visited[depth]) {
                visited[depth] = true;
                int newValue = cur + numbers[depth] * booho[i];
                dfs(numbers, target, newValue, depth+1);
                visited[depth] = false;
            }
        }
    }
}