package Lv0;

import java.util.Arrays;

public class 배열두배만들기 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(solution(numbers));
    }

    private static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i=0; i < numbers.length; i++) {
            answer[i] = 2*numbers[i];
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
