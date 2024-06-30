package algorithm.week5;

import java.util.HashMap;
import java.util.HashSet;

public class pgs1845_hj {
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums){
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        int mon = nums.length/2;

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        // 3,2,4  / 3 -> 3
        // 1,2,3 / 2 -> 2
        // 3,2  / 3  -> 2
        if(mon > set.size()) {
            answer = set.size();
        } else {
            answer = mon;
        }


        return answer;
    }
}
