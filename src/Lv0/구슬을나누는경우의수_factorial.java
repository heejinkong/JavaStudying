package Lv0;

public class 구슬을나누는경우의수_factorial {
    public static void main(String[] args) {
        int balls = 3;
        int share = 2;
        System.out.println(solution(balls, share));
    }

    public static int solution(int balls, int share) {
        int answer = combination(balls, share);
        return answer;
    }
    public static int combination(int n, int k) {
        return factorial(n) / factorial(k) * factorial(n-k);
    }

    public static int factorial(int n) {
       if (n < 2) {
           return 1;
       }
       int result = 1;
       for(int i = 2; i<=n; i++) {
           result *= i;
       }
       return result;
    }
}
