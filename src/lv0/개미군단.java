package lv0;

public class 개미군단 {
    public static void main(String[] args) {
        int hp = 23;
        System.out.println(solution(hp));
    }

    private static int solution(int hp) {
        int answer = 0;
        answer += (hp / 5);
        hp %= 5;

        answer += (hp / 3);
        hp %= 3;

        answer += (hp / 1);

        return answer;
    }
}
