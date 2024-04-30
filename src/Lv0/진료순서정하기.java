package Lv0;

import java.util.Arrays;

public class 진료순서정하기 {
    public static void main(String[] args) {
        int[] emergency = {3, 76, 24};
        System.out.println(solution(emergency));
    }

    private static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 0; i < answer.length; i++) {
            for(int j = 0; j < emergency.length; j++) {
                if(emergency[i] < emergency[j]) {
                    answer[i]++;
                }
            }
            answer[i]++;
        }

        return  answer;
    }
}
