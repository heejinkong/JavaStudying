package lv0;

public class 피자나눠먹기2 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= 6 * n; i++) {
            if(6 * i % n == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }

}
