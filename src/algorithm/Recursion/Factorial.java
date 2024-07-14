package algorithm.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(solution(num));
    }

    public static int solution(int num) {
        int answer = factorial(num);
        return answer;
    }

    public static int factorial(int num) {
        int result = 1;
        for(int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
