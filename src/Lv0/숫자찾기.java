package Lv0;

import java.util.Arrays;

public class 숫자찾기 {
    public static void main(String[] args) {
        int num = 29183;
        int k =1;
        System.out.println(solution(num,k));
    }

    public static int solution(int num, int k) {
        String s = Integer.toString(num);
        String[] arr = s.split("");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(Integer.toString(k))) {
                return i + 1;
            }
        }
        return -1;
    }
}
