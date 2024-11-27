package lv1;

import java.util.*;

public class 정수내림차순으로배치하기도움말 {
    public long solution(long n) {
        long answer = 0;

        String[] arr = String.valueOf(n).split("");

        Arrays.sort(arr, Collections.reverseOrder());

        String target = "";
        for (int i = 0; i < arr.length; i++) {
            target += arr[i];
        }

        answer = Long.parseLong(target);

        return answer;
    }
}
