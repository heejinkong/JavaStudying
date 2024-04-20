package Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 짝수는싫어요 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }

    private static int[] solution(int n) {

        List<Integer> list = new ArrayList<>();


        // 배열은 => 길이가 정해져있어. ->
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                list.add(i);
            }
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
        return answer;
    }

}
