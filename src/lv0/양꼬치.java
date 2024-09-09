package lv0;

public class 양꼬치 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        System.out.println(solution(n,k));
    }

    private static int solution(int n, int k) {
        int n_money, k_money = 0;
        n_money = n * 12000;
        int service = n / 10;
        k_money = (k-service) * 2000;

        int answer = n_money + k_money;
        return answer;
    }
}
