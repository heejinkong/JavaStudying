package Lv0;

public class 세균증식 {
    class Solution {
        public int solution(int n, int t) {
            int answer = n;
            for(int i=1; i <= t; i++) {
                answer *= 2;
                System.out.println(answer);
            }
            return answer;
        }
    }
}
