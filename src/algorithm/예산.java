package algorithm;

import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;
        System.out.println(solution(d, budget));
    }

    public static int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;

        for(int price : d) {
            budget -= price;
            if(budget < 0) break;
            answer++;
        }
        return answer;
    }

}
