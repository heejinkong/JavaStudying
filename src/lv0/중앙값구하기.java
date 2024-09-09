package lv0;


import java.util.*;

public class 중앙값구하기 {
    public static void main(String[] args) {
        int[] array = {1,7,2,10,11};
        System.out.println(solution(array));
    }

    private static int solution(int[] array) {
        int answer = 0;
        int middle = array.length / 2;
        Arrays.sort(array);
        answer = array[middle];

        return answer;
    }
}
