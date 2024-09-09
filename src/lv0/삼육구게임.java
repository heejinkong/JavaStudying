package lv0;

public class 삼육구게임 {
    class Solution {
        public int solution(int order) {
            int answer = 0;
            String s = Integer.toString(order);

            for(int i = 0; i < s.length(); i++){
                int digit = Integer.parseInt(s.substring(i, i + 1));
                if (digit % 3 == 0 && digit != 0) {
                    answer++;
                }
            }

            return answer;
        }
    }
}
