package Lv0;

public class 나이출력 {
    public static void main(String[] args) {
        int age = 40;
        System.out.println(solution(age));
    }

    private static int solution(int age) {
        int answer = (2022 - age) + 1;

        return answer;
    }

}
