package lv0;

public class 아이스아메리카노 {
    public static void main(String[] args) {
        int money = 5500;
        System.out.println(solution(money));
    }

    private static int[] solution(int money) {
        int[] answer = new int[2];

        answer[0] = money / 5500;
        answer[1] = money % 5500;

        return answer;
    }
}
