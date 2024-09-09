package lv0;

import java.util.Arrays;

public class 한번만등한문자 {
    public String solution(String s) {
        String answer = "";
        String[] word = s.split("");
        int cnt = 0;

        Arrays.sort(word);
        for(int i = 0; i < word.length; i++) {
            cnt=0;

            for(int j=0; j < word.length; j++) {
                if(word[i].equals(word[j])) {
                    cnt++;
                }
            }
            if(cnt == 1) {
                answer += word[i];
            }
        }
        return answer;
    }
}
