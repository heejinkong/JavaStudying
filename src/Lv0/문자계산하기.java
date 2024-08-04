package Lv0;

import java.util.ArrayList;

public class 문자계산하기 {
    public int solution(String my_string) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        String[] s = my_string.split(" ");
        answer += Integer.parseInt(s[0]);

        for(int i = 0; i < s.length; i++) {
            if(i % 2 == 1) {
                if(s[i].equals("+")) {
                    int num = Integer.parseInt(s[i+1]);
                    answer += num;
                } else {
                    int num = Integer.parseInt(s[i+1]);
                    answer -= num;
                }
            }
        }
        return answer;
    }
}
