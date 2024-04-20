package Lv0;

public class 두수의나눗셈 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;

        System.out.println(solution(num1, num2));

    }

    private static int solution(int num1, int num2) {
        double answer = (double)num1/num2 * 1000;
        return (int)answer;

    }
}
