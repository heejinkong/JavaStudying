package algorithm.Recursion;

public class pgs120848 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        int answer = 1;
        int factorial = 1;

        while (n >= factorial) {
            answer++;
            factorial *= answer;
        }
        return answer-1;
    }
}
