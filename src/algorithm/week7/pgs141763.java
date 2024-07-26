package algorithm.week7;

import java.util.Arrays;
import java.util.Collections;

public class pgs141763 {
    public static void main(String[] args) {
        int k = 4;
        int m = 3;
        int[] score = {4,1,2,2,4,4,4,4,1,2,4,2};
        System.out.println(Solution(k,m,score));
    }
    //[3,3,

    public static int Solution (int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        // 3 3 2 2 } 7/4
        // 4 4 4 } 4 4 4 } 2 2 2 } 2 1 1 -> 12/4
        int size = score.length % m; // 3
        int box = score.length / m; // 1
        for(int j = score.length; j > size ; j++) {
            int min = 9;
            for(int i = 0; i < box; i++) {

                if(score[j] < min  )
                    min = score[j];
            }
        }

        return answer;
    }
}
