package lv1;

public class 나머지가1이되는수찾기 {
    public int solution(int n) {
        int answer = n;
        for(int i =1; i < n; i++) {
            if(n % i == 1) {
                if(i <= answer) {
                    answer = i;
                }

            }
        }
        return answer;
    }
}