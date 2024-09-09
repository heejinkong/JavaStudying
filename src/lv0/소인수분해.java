package lv0;

import java.util.ArrayList;

public class 소인수분해 {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(solution(n));
    }
    public static int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 2; i <=n; i++) {
            if(n % i == 0) {
                while(n % i ==0) {
                    n /= i;
                }
                list.add(i);
            }
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
