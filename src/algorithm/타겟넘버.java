package algorithm;

public class 타겟넘버 {
    public static boolean[] visited;
    public static int answer;
    public static int[] booho = {-1,1};

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(solution(numbers, target));
    }

    public static int solution(int[] numbers, int target) {
        visited = new boolean[numbers.length];
        answer = 0;
        backtrack(numbers,target,0,0);
        return answer;
    }

    public static void backtrack(int[] numbers, int target, int curr, int depth) {
        if (depth == numbers.length && curr == target) {
            answer++;
            return;
        } else if (depth == numbers.length) {
            return;
        }

//        visited[depth] = true;
        for(int i = 0; i< booho.length; i++) {
            if (!visited[i]) {
                visited[i] =true;
                int newValue = curr + numbers[depth] * booho[i];
                backtrack(numbers, target, newValue, depth + 1);

                visited[i] =false;
            }
        }
//        visited[depth] =false;
    }
}
