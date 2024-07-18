package algorithm;

public class 타겟넘버 {
    public static boolean[] visited;
    public static int answer;
    public static int sum;
    public static int[] booho = {-1,1};
    public static int curr = 0;

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(solution(numbers, target));
    }

    public static int solution(int[] numbers, int target) {
        visited = new boolean[numbers.length];
        backtrack(numbers,target,0,0);
        answer = 0;
        return answer;
    }

    public static void backtrack(int[] numbers, int target, int start, int depth) {
        if(sum > target) {
            return;
        } else {
            if (depth == numbers.length) {
                answer++;
                return;
            }
        }
        for(int i = start; i< numbers.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                int newValue = curr + numbers[i]*booho[i];
                sum += newValue;
                backtrack(numbers, target, i+1, depth+1);
                visited[i] =false;

            }
        }
    }
}
