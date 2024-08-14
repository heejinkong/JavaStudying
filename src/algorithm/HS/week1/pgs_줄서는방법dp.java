package algorithm.HS.week1;

import java.util.ArrayList;
import java.util.Arrays;
//시간초과
public class pgs_줄서는방법dp {
    static boolean[] visited;
    static ArrayList<String> cases;

    public static void main(String[] args) {
        int n = 3;
        int k = 5;
        System.out.println(Arrays.toString(solution(n, k)));
    }

    public static int[] solution(int n, int k) {
        visited = new boolean[n+1];
        cases = new ArrayList<>();
        String num = "";

        dfs(n, num, 0);

        String[] casesArray = cases.get((int)(k-1)).split("");

        int[] answer = new int[casesArray.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(casesArray[i]);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void dfs(int n, String num, int depth) {
        if(n == depth) {
            cases.add(num);
            return;
        }

        for(int i = 1; i <= n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(n, num + i, depth + 1);
                visited[i] = false;
            }
        }
    }
}
