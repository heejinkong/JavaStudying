package lv0;

import java.util.Arrays;

public class 최댓값만들기2 {
    class Solution {
        public int solution(int[] numbers) {
            int answer = 0;
            Arrays.sort(numbers);
            int max1 = 0;
            int max2 = 0;

            max1=numbers[0]*numbers[1];
            max2=numbers[numbers.length-1]*numbers[numbers.length-2];

            if(max1>max2) answer = max1;
            else answer = max2;
            return answer;
        }
    }
}
